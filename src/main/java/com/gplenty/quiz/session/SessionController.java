package com.gplenty.quiz.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.gplenty.quiz.domain.User;


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
		this.sender = new PrintWriter(this.socket.getOutputStream());
		this.reader = new Scanner(this.socket.getInputStream());
		// set controller
//		this.controller = ControllerFactory.make(state, this);
	}

	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
