package com.streetgame.gaming;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.streetgame.gaming.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants{
	
	public GameFrame() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setTitle("My Game - Street Fighter");
		setTitle(TITLE);      //Using our Constants
		//setExtendedState(JFrame.MAXIMIZED_BOTH);    //For full size screen
		//setSize(900, 600);
		setSize(GWIDTH, GHEIGHT);    //Using our Constants
		setLocationRelativeTo(null);     //for displaying screen at the centre
		
		Board board = new Board();
		add(board);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		GameFrame obj = null;
		try {
			obj = new GameFrame();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(obj, "Something Went Wrong");
			e.printStackTrace();
		}
		
	}

}
