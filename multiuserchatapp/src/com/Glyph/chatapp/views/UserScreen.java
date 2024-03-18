package com.Glyph.chatapp.views;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.Glyph.chatapp.dao.UserDAO;
import com.Glyph.chatapp.dto.UserDTO;
import com.Glyph.chatapp.utils.UserInfo;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserScreen extends JFrame{
	private JTextField useridtxt;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		
		UserScreen window = new UserScreen();
		
	}
	
	UserDAO userDAO = new UserDAO();
	
	private void doLogin() {
		String userid = useridtxt.getText();
		char[] password = passwordField.getPassword();
		//UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO(userid, password);
		try {
			String message = "";
			if(userDAO.isLogin(userDTO)) {
				message = "Welcome " + userid;
				UserInfo.USER_NAME = userid;
				setVisible(false);
				dispose();
				JOptionPane.showMessageDialog(this, message);
				DashBoard dashBoard = new DashBoard(message);
				dashBoard.setVisible(true);
			}
			else {
				message = "Invalid UserId or Password";
				JOptionPane.showMessageDialog(this, message);
			}
			//JOptionPane.showMessageDialog(this, message);
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void register() {
		String userid = useridtxt.getText();
		char[] password = passwordField.getPassword();
		//UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO(userid, password);
		try {
			int result = userDAO.add(userDTO);
			if(result > 0){
				JOptionPane.showMessageDialog(this, "Registered Succesfully");
				//System.out.println("Record Added...");
			}
			else {
				JOptionPane.showMessageDialog(this, "Registration Failed");
				//System.out.println("Record Not Added....");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("DB Issue......");
			e.printStackTrace();  //Where is the exception
		}
		catch(Exception e) {
			System.out.println("Some Generic Issue.....");
			e.printStackTrace();
		}
		
		System.out.println("User id " + userid + " Password " + password.toString());  //ClassName@HashCode(in Hexadecimal)
		
	}

	/**
	 * Create the application.
	 */
	public UserScreen() {
		setResizable(false);
		setTitle("LOGIN");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(234, 23, 188, 56);
		getContentPane().add(lblNewLabel);
		
		useridtxt = new JTextField();
		useridtxt.setBounds(196, 102, 398, 34);
		getContentPane().add(useridtxt);
		useridtxt.setColumns(10);
		
		JLabel useridlbl = new JLabel("User ID");
		useridlbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		useridlbl.setBounds(66, 103, 120, 24);
		getContentPane().add(useridlbl);
		
		JLabel pwdlbl = new JLabel("Password");
		pwdlbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		pwdlbl.setBounds(66, 188, 120, 24);
		getContentPane().add(pwdlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(196, 187, 398, 34);
		getContentPane().add(passwordField);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doLogin();
			}
		});
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		loginbtn.setBounds(196, 279, 113, 34);
		getContentPane().add(loginbtn);
		
		JButton registerbtn = new JButton("Register");
		registerbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		registerbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		registerbtn.setBounds(371, 279, 113, 34);
		getContentPane().add(registerbtn);
		setVisible(true);
		setSize(689, 393);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
