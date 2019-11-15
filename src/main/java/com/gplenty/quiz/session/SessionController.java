package com.gplenty.quiz.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.session.controllers.ControllerFactory;


	/*	Classe responsável por manter a sessão do usuário
	 * 
	 * contem o socket e um controlador que varia conforme o estado que o cliente 
	 * e o servidor se encontram baseado nos estados descritos em ServerStates
	 */
public class SessionController implements Runnable
{
	private ServerState state;
	
	private Controller controller;
	
	private Socket socket;
	
	private PrintWriter sender;
	
	private Scanner reader;
	
	private User user;
	
	
	public SessionController(Socket socket) throws IOException
	{
		this.socket = socket;
		this.state = ServerState.NOT_AUTHED;
		this.sender = new PrintWriter(this.socket.getOutputStream(), true);
		this.reader = new Scanner(this.socket.getInputStream());
	}

	
	
	
	@Override
	public void run() 
	{
		while(true)
		{
			controller = ControllerFactory.make(state);
			
			controller.readMessage(reader.nextLine());
			state = controller.handleMessage();
			sender.write(controller.getAnswer());
		}
		
	}
	
	public User getUser()
	{
		return user;
	}

}
