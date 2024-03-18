package com.Glyph.chatapp.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import com.Glyph.chatapp.views.ClientChatScreen;

// Thread == Worker
//Worker need a job to perform
//For job u give runnable
//Once job is created via Runnable so write the job logic inside Run function
//Assign the Job to a Thread/Worker 

//public class ServerWorker implements Runnable {
public class ServerWorker extends Thread {
	private Socket clientSocket;
	private InputStream in;
	private OutputStream out;
	private Server server;

	public ServerWorker(Socket clientSocket, Server server) throws IOException {
		this.server = server;
		this.clientSocket = clientSocket;
		in = clientSocket.getInputStream(); // Client Data Read
		out = clientSocket.getOutputStream(); // Client Data Write
		System.out.println("New Client Comes...");
	}

	public void run() {
		// Read data from Client and Broadcast the data to all
		BufferedReader br = new BufferedReader(new InputStreamReader(in)); // BufferedReader converts the data from
																			// inputstream to string automatically
		String line;
		try {
			while (true) {

				line = br.readLine();
				if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("bye")) {
					 // Particular Client Chat End
					break;
				}
				//out.write(line.getBytes());  //Client Send //it only sends to one worker
				//BroadCast to all clients
				for(ServerWorker serverWorker : server.workers) {
					line = line + "\n";
					serverWorker.out.write(line.getBytes());
				}
			}

		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				if (clientSocket != null) {
					clientSocket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
