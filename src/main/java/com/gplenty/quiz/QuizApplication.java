package com.gplenty.quiz;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.gplenty.quiz.session.SessionController;

@SuppressWarnings("resource")
public class QuizApplication {

	public static void main(String[] args) throws IOException {
		ServerSocket listenSocket = new ServerSocket(50000);
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		while(true)
		{
			Socket newSocket = listenSocket.accept();
			SessionController newSession = new SessionController(newSocket);
			pool.execute(newSession);
		}
	
	}

}
