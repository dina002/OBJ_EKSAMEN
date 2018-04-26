/*
 * Square03.java er en kildefil til boken "Objektorientert programmering med Java"
 * 
 * ****    Tredje opplag   ****
 * 
 * Boken er utgitt på http://www.fagbokforlaget.no
 * 
 * ISBN 978-82-7674-748-5
 * 
 * Viggo Holmstedt 2002 - 2017
 * -------------------------------------------
 * File location: kap_03/modulotest/modulo/
 * Last modified: 2015-08-03 12:47
 * 

 */ 
package modulo;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/*
 * Hver rute er en standard JButton med farge
 * 
 * Hver JButton kan klikkes på
 * og skriver dermed ut hvilken 
 * kolonne den er i
 * 
 */

public class Square03 extends JButton implements ActionListener {

	int n;
	
	public Square03(int i) {
		n = i;
		addActionListener(this);
		setBackground(calcColor(n));
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Kolonne nummer "+n % 8);		
	}
	
	Color calcColor(int n) {		
		boolean annenhverRute = (n % 2==0);
		boolean annenhverRad = ((n / 8) % 2 == 0);
		return (annenhverRute != annenhverRad?Color.BLACK:Color.WHITE);
	}
	
}
