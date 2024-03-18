package com.Glyph.chatapp.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JTextArea;

import com.Glyph.chatapp.utils.ConfigReader;

public class Client {
	Socket socket;
	InputStream in;
	OutputStream out;
	ClientWorker clientWorker;
	JTextArea textArea;
	
	public Client(JTextArea textArea) throws UnknownHostException, IOException {
		String IP = ConfigReader.getValue("SERVER_IP");
		int PORT = Integer.parseInt(ConfigReader.getValue("PORTNO"));
		
		socket = new Socket(IP, PORT);
		out = socket.getOutputStream();
		in = socket.getInputStream();
		this.textArea = textArea;
		readMessages();
		
//		System.out.println("Client Comes");
//		System.out.println("Enter the message send to the server...");
//		Scanner sc = new Scanner(System.in);
//		String message = sc.nextLine();
//		
//		OutputStream out = socket.getOutputStream();  //Write byte on network
//		out.write(message.getBytes());
//		System.out.println("Message sent to the server.");
//		
//		sc.close();
//		out.close();
//		socket.close();
	}
	
	public void sendMessage(String message) throws IOException {
		message = message + "\n";  //Buffered Reader expects \n to understand that the input string has ended
		out.write(message.getBytes());
	}
	
	public void readMessages () {
		clientWorker = new ClientWorker(in, textArea);
		clientWorker.start();   //Calling a Read Thread
	}
	
//	public static void main(String[] args) throws UnknownHostException, IOException {
//		Client client = new Client();
//	}
}
