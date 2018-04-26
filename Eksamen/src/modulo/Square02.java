/*
 * Square02.java er en kildefil til boken "Objektorientert programmering med Java"
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

import javax.swing.JButton;

/*
 * Hver rute er en standard JButton med farge
 * 
 * Algoritmen bytter mellom svart og hvitt
 * for annenhver rute og annhver rad
 * 
 * Dette gir riktig løsning
 * 
 */
public class Square02 extends JButton  {

	int n;
	
	public Square02(int i) {
		n = i;		
		setBackground(calcColor(n));
	}
	
	Color calcColor(int n) {		
		boolean annenhverRute = (n % 2==0);
		boolean annenhverRad = ((n / 8) % 2 == 0);
		return (annenhverRute != annenhverRad?Color.BLACK:Color.WHITE);
	}
	
}
