// ServerSocket - to create a server and listen for radius input

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class serrver extends JFrame {
	//text area for displaying contents
	private JTextArea ta = new JTextArea();
	
	public static void main(String[] args) {
		new serrver();
	}
	
	public serrver() {
		//place text area in frame
		setLayout(new BorderLayout());
		add(new JScrollPane(ta), BorderLayout.CENTER);
		
		setTitle("server");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		try {
			//create a server socket
			ServerSocket serverSocket = new ServerSocket(8000);
			ta.append("Server started at "+ new Date() + "\n");
			
			//listen for a connection request
			Socket socket = serverSocket.accept();
			
			//create data input and output streams
			DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
			DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				//receive radius from client
				double radius = inputFromClient.readDouble();
				
				//compute area
				double area = radius*radius*Math.PI;
				
				//send area back to the client
				outputToClient.writeDouble(area);
				
				ta.append("Radius received from client: "+ radius + "\n");
				ta.append("Area found "+ area + "\n");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
