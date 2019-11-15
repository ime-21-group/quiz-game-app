package com.gplenty.quiz.session;

import com.gplenty.quiz.connection.Message;

public abstract class Controller {
	
	protected Message receivedMessage;
	protected Message answerMessage;
	
	public void readMessage(String message)
	{
		receivedMessage = new Message(message);
	}
	
	public abstract ServerState handleMessage();
	
	public String getAnswer()
	{
		return answerMessage.getAsString();
	}

}
