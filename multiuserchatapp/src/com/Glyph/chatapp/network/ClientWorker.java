package com.Glyph.chatapp.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JTextArea;

//This class only reads data from Client
public class ClientWorker extends Thread { // it is needed becz two or more clients can send data at same time, so in
											// order to get the message from other client, clients must have two threads
											// , inputstream for reading msg and outputstream for writing msg
	private InputStream in;
	private JTextArea textArea;

	public ClientWorker(InputStream in, JTextArea textArea) {
		// TODO Auto-generated constructor stub
		this.in = in;
		this.textArea = textArea;
	}

	@Override
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		try {
			while (true) {
				line = br.readLine();
				textArea.setText(textArea.getText()  + line + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();	
		}
		finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
