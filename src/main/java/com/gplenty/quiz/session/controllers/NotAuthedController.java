package com.gplenty.quiz.session.controllers;

import com.gplenty.quiz.connection.Message;
import com.gplenty.quiz.connection.PLENA.ActionIdentifier;
import com.gplenty.quiz.session.Controller;
import com.gplenty.quiz.session.ServerState;

public class NotAuthedController implements Controller
{
	private Message receivedMessage;
	private Message answerMessage;

	@Override
	public void readMessage(String message) 
	{
		receivedMessage = new Message(message);
	}

	@Override
	public ServerState handleMessage() 
	{
		ActionIdentifier answerIdentifier;
		ServerState nextState;
		switch(receivedMessage.getIdentifier())
		{
		case REQUEST_REGISTER:
			answerIdentifier = ActionIdentifier.EXPECTING_NEW_REGISTER;
			nextState = ServerState.SIGN_IN;
			break;
		case REQUEST_LOGIN:
			answerIdentifier = ActionIdentifier.LOGIN_EXPECTED;
			nextState = ServerState.LOGIN;
			break;
		default:
			throw new IllegalArgumentException("Action received does not correspond to a valid action "
					+ "for the current state : " + ServerState.NOT_AUTHED);
		}
		answerMessage = new Message(answerIdentifier, "");
		return nextState;
	}

	@Override
	public String getAnswer() 
	{
		return answerMessage.getAsString();
	}
	
}
