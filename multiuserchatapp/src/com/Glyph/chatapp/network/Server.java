package com.Glyph.chatapp.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.Glyph.chatapp.utils.ConfigReader;

public class Server {
	ServerSocket serverSocket;
	ArrayList<ServerWorker> workers = new ArrayList<>();  //contains all the client Sockets
	
	public Server() throws IOException {
		int PORT = Integer.parseInt(ConfigReader.getValue("PORTNO"));
		serverSocket = new ServerSocket(PORT);
		System.out.println("Server starts and Waiting for CLients to join..");
		handleClientRequest();
	}
	
	//Multiple Client Handshaking
	public void handleClientRequest() throws IOException {
		while(true) {
			Socket clientSocket = serverSocket.accept();  //HandShaking
			//Per Client Per Thread
			ServerWorker serverWorker = new ServerWorker(clientSocket, this); //Creating a new Thread/Worker , 'this' passes the server so that thread can contact with arraylist of workers
			//now everytime new serverworker is created the prev one will get lost, so we make arraylist to store all threads.
			workers.add(serverWorker);
			serverWorker.start();
		}
	}
	
//	//For Single Client
//	public Server() throws IOException {
//		int PORT = Integer.parseInt(ConfigReader.getValue("PORTNO"));
//		serverSocket = new ServerSocket(PORT);
//		
//		System.out.println("Server Started and Waiting for Client Connection...");
//		Socket socket = serverSocket.accept();  //HandShaking
//		System.out.println("Client Connected");
//		
//		InputStream in = socket.getInputStream();  //Read bytes from network
//		byte[] arr = in.readAllBytes();
//		String str = new String(arr);
//		System.out.println("Message received from Client " + str);
//		
//		in.close();
//		socket.close();
//	}
	
	public static void main(String[] args) throws IOException {
		Server server = new Server();
	}
}
