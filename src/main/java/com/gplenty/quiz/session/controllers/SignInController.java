package com.gplenty.quiz.session.controllers;

import java.util.List;
import java.util.Map;

import com.gplenty.quiz.connection.JsonParser;
import com.gplenty.quiz.connection.Message;
import com.gplenty.quiz.connection.PLENA.ActionIdentifier;
import com.gplenty.quiz.daos.UserDao;
import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.domain.users.Student;
import com.gplenty.quiz.domain.users.Teacher;
import com.gplenty.quiz.session.Controller;
import com.gplenty.quiz.session.ServerState;

public class SignInController extends Controller {
	private Message receivedMessage;
	private Message answerMessage;

	@Override
	public ServerState handleMessage() {
		switch(receivedMessage.getIdentifier())
		{
		case ATTEMPT_REGISTER:
			return attemptRegister(receivedMessage.getBody());
		case CANCEL_ACTION:
			answerMessage = new Message(ActionIdentifier.EXPECTING_OPTION_SELECT_NOT_AUTHED, "");
			return ServerState.NOT_AUTHED;
		default:
			throw new IllegalArgumentException("Identifier not supported in the state SignIn: " 
												+ receivedMessage.getIdentifier());
		}
	}

	@Override
	public String getAnswer() {
		return answerMessage.getAsString();
	}
	
	private ServerState attemptRegister(String json)
	{
		Map<String, String> values = JsonParser.jsonToMap(json);
		String username = values.get("username");
		String passwd = values.get("passwd");
		String role = values.get("role");
		
		User newUser;
		
		UserDao ud = new UserDao();
		
		List<User> users = ud.retrieveByUsername(username);
		
		if(users.size() > 0)
		{
			answerMessage = new Message(ActionIdentifier.REGISTER_NOT_ACCEPTED, "");
			return ServerState.SIGN_IN;
		}
		
		switch(role)
		{
		case "TEACHER":
			newUser = new Teacher();
			break;
		case "STUDENT":
			newUser = new Student();
			break;
		default:
			throw new IllegalArgumentException("Invalid role: " + role);
		}
		
		newUser.setPasswd(passwd);
		newUser.setUsername(username);
		ud.save(newUser);
		
		answerMessage = new Message(ActionIdentifier.REGISTER_ACCEPTED, "");
		
		return ServerState.NOT_AUTHED;
	}

}
