/*
 * SjakkVindu.java er en kildefil til boken "Objektorientert programmering med Java"
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


import javax.swing.JFrame;

public class SjakkVindu extends JFrame {
	
	public SjakkVindu() {
		setTitle("Demo av modulo");
		add(new SquareMatrix());
		setSize(600,600);
		setVisible(true);
	}

}
