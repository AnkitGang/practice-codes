package com.Glyph.chatapp.views;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView extends JFrame{
	int counter;
	
	public UserView() {
		counter = 0;
		setSize(500, 500);
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);  //window always at centre
		//setLocation(100, 100);
		JLabel welcome = new JLabel("Login");
		welcome.setFont(new Font("Arial", Font.BOLD, 40));
		
		Container container = this.getContentPane();
		container.setLayout(null);
		welcome.setBounds(100, 70, 250, 70);
		container.add(welcome);   //By default it adds in border Layout
		
		JButton button = new JButton("Count");  //Source
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				welcome.setText("Counter " + counter);
			}
		});
		button.setBounds(100, 300, 200, 50);
		container.add(button);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		UserView userView = new UserView();
	}
}
