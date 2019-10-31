package com.gplenty.quiz;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizApplication {

	public static void main(String[] args) {
		try {
			ServerSocket socket = new ServerSocket(59090);
			while(true)
			{
				Socket newSocket = socket.accept();
				PrintWriter out = new PrintWriter(newSocket.getOutputStream());
				out.println("Hello");
				out.flush();
				out.close();
				newSocket.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
