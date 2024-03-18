package com.streetgame.gaming;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.streetgame.gaming.utils.GameConstants;

public class Board extends JPanel implements GameConstants{
	
	private BufferedImage backgroundImage;
	
	public Board() throws IOException {
		loadBackgroundImage();
	}
	
	private void loadBackgroundImage() throws IOException {
		backgroundImage = ImageIO.read(Board.class.getResource("bg.jpeg"));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//All Game Printing will be done here
		
		g.drawImage(backgroundImage, 0, 0, GWIDTH, GHEIGHT, null);
		
		
		
		
		
		
//		g.setColor(Color.RED);
//		g.fillRect(100, 100, 50, 50);
//		
//		g.setColor(Color.green);
//		g.fillOval(200, 100, 50, 50);
//		
//		g.setColor(Color.black);
//		Graphics2D g2 = (Graphics2D) g;     //Graphics g does not have method for Stroke so we DOWNCAST it
//		g2.setStroke(new BasicStroke(10));  //for giving border width
//		g.drawOval(300, 100, 50, 50);
//		
//		g.setColor(Color.BLUE);
//		g.fillRect(100, 200, 100, 100);
//		
//		g.setColor(Color.pink);
//		g.fillOval(100, 200, 50, 50);
//		
//		g.setColor(Color.black);
//		g.drawLine(10, 10, 500, 10);
//		
//		g.setColor(Color.cyan);
//		g.drawLine(10, 10, 10, 500);
//		
//		g.setColor(Color.orange);
//		g.drawLine(10, 10, 500, 500);
	}
}
