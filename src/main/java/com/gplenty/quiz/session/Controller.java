package com.gplenty.quiz.session;

public interface Controller 
{
	public void readMessage(String message);
	
	public ServerState handleMessage();
	
	public String getAnswer();
	
}
