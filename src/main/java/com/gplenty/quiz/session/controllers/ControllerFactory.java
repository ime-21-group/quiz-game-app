package com.gplenty.quiz.session.controllers;

import com.gplenty.quiz.session.Controller;
import com.gplenty.quiz.session.ServerState;

public class ControllerFactory 
{
	public static Controller make(ServerState state)
	{
		switch(state)
		{
		case NOT_AUTHED:
			return new NotAuthedController();
		default:
			throw new IllegalArgumentException("this state is not available");
		}
	}
}
