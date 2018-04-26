import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.scene.paint.Color;

public class SjakkGUI extends JFrame {
	public static final int squareCount = 64;
	
	public SjakkGUI(String user, SjakkBrett inbrett) {
		
		SjakkBrett brett = inbrett;
			
		brett.getRuter();
		
		
		String title = "Sjakk  " + user;
		java.awt.Color blackColor = java.awt.Color.BLACK;
		java.awt.Color whiteColor = java.awt.Color.WHITE;
		
		JButton chessButton = null;
		
		for(int i = 1; i <= squareCount; i++) {
			if(i % 2 == 0) {
				chessButton = new JButton();
				chessButton.setBackground(blackColor);
				add(chessButton);
			}
			else {
				chessButton = new JButton();
				chessButton.setBackground(whiteColor);
				
				add(chessButton);
			}
			
			if(i % 8 == 0) {
				java.awt.Color temp = blackColor;
				blackColor = whiteColor;
				whiteColor = temp;
			}
		}
		
		this.setTitle(title);
		this.setLayout(new GridLayout(8, 18));
		this.setSize(650, 650);
		this.setVisible(true);
		
	}
	
}
