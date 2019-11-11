package com.gplenty.quiz.connection;

import com.gplenty.quiz.connection.PLENA.ActionIdentifier;

public class Message 
{
	private ActionIdentifier identifier;
	
	private String body;
	
	//
	// Construtores
	//
	
	/*
	 * Construtor para criar a mensagem a partir de uma String recebida, e separar o
	 * identificador do corpo
	 */
	public Message(String message)
	{
		String identifierString;
		String bodyString;
		int index = 0;
		
		for(int i = 0; i < message.length(); i++)
		{
			if(message.charAt(i) == ':')
			{
				index = i+1;
				break;
			}
		}
		
		identifierString = message.substring(0, index);
		bodyString = message.length() > index ? message.substring(index + 1) : "";

		this.identifier = ActionIdentifier.valueOf(identifierString);
		this.body = bodyString;
	}
	
	/*
	 * Construtor para criar a mensagem a partir do identificador e do corpo
	 * separados e formar a string de mensagem
	 */
	public Message(ActionIdentifier identifier, String body)
	{
		this.identifier = identifier;
		this.body = body;
	}
	
	public String getAsString()
	{
		return identifier.toString() + ":" + body;
	}
	
	public ActionIdentifier getIdentifier()
	{
		return this.identifier;
	}
	
	public String getBody()
	{
		return this.body;
	}
}
