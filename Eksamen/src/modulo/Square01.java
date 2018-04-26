/*
 * Square01.java er en kildefil til boken "Objektorientert programmering med Java"
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
 * for annenhver rute
 * 
 * Men dette gir ikke helt riktig løsning
 * 
 */
public class Square01 extends JButton  {
	
	public Square01(int i) {
		setBackground(calcColor(i));
	}
	
	Color calcColor(int n) {		
		boolean annenhverRute = (n % 2==0);		
		return (annenhverRute ? Color.BLACK : Color.WHITE);
	}
	
}
