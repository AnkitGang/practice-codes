// ClientSocket - to send radius to server and receive area server 

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cliint extends JFrame {
	//Text field for receiving radius
	private JTextField tf = new JTextField();
	
	//text area to display contents
	private JTextArea ta = new JTextArea();
	
	//IO streams
	private DataOutputStream toServer;
	private DataInputStream fromServer;
	
	public cliint() {
		// panel p to hold the label and text field
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JLabel("Enter Radius"), BorderLayout.WEST);
		p.add(tf, BorderLayout.CENTER);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		setLayout(new BorderLayout());
		add(p, BorderLayout.NORTH);
		add(new JScrollPane(ta), BorderLayout.CENTER);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// get the radius from the text field
					double radius = Double.parseDouble(tf.getText().trim());
					
					//send the radius to server
					toServer.writeDouble(radius);
					toServer.flush();
					
					//get area from the server
					double area = fromServer.readDouble();
					
					//display to the text area
					ta.append("Radius is"+ radius + "\n");
					ta.append("Area received from server "+ area + "\n");
				}
				catch(IOException ex) {
					System.out.println(ex);
				}
			}
		});
		
		setTitle("Client");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		try {
			//create a socket to connect to the server
			Socket socket = new Socket("localhost", 8000);
			// Socket socket = new Socket("130.254.204.36", 8000);
			// Socket socket = new Socket("drake.Armstrong.edu". 8000);
			
			//create an input stream to receive data from the server
			fromServer = new DataInputStream(socket.getInputStream());
			
			//create an output stream to send data to the server
			toServer = new DataOutputStream(socket.getOutputStream());
		}
		catch(IOException e) {
			ta.append(e.toString() + "\n");
		}
	}
	
	public static void main(String[] args) {
		new cliint();
	}
	
}
