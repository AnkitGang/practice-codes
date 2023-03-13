//UDP Client to send a text and receive the output

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class UDPC {
	public static void main(String [] args) throws Exception{
		DatagramSocket clientSocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName("localhost");
		byte[] sendData = new byte[1024];
		byte[] receiveData = new byte[1024];
		String sentence = JOptionPane.showInputDialog("Enter");
		sendData = sentence.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
		clientSocket.send(sendPacket);
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		String modifiedSentence = new String(receivePacket.getData());
		System.out.println("From Server: "+ modifiedSentence);
		clientSocket.close();
		
	}
}