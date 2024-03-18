package com.Glyph.chatapp.views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Glyph.chatapp.network.Client;
import com.Glyph.chatapp.utils.UserInfo;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ClientChatScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private Client client;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClientChatScreen frame = new ClientChatScreen();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void sendIt() {
		String message = textField.getText();
		try {
			if(!message.isEmpty()) {
				client.sendMessage(UserInfo.USER_NAME + " - " + message);
				textField.setText("");
			}
			else {
				JOptionPane.showMessageDialog(this, "Cannot send Empty message");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public ClientChatScreen() throws UnknownHostException, IOException {
		textArea = new JTextArea();
		textArea.setEditable(false);
		client = new Client(textArea);
		setTitle(UserInfo.USER_NAME);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textArea.setFont(new Font("Courier New", Font.PLAIN, 15));
		textArea.setBounds(27, 24, 743, 267);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 549, 227);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 249, 436, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton sendit = new JButton("Send Message");
		sendit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendIt();
			}
		});
		sendit.setForeground(Color.ORANGE);
		sendit.setBackground(Color.BLUE);
		sendit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		sendit.setBounds(456, 249, 103, 47);
		contentPane.add(sendit);
		setVisible(true);
	}
}
