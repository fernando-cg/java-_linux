package joptionpane;

import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Joption {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE) ;
		
		String variable = JOptionPane.showInputDialog(null,"Introduce algo","Panel para introducir datos",JOptionPane.PLAIN_MESSAGE) ;
		
		JOptionPane.showMessageDialog(null,variable,"Mensaje de vuelta",JOptionPane.INFORMATION_MESSAGE) ;
		
		String[] array = {"opción1" , "opción2" , "opción3"} ;
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		JComboBox box = new JComboBox(array);
		
		JOptionPane.showMessageDialog(null, box, "Seleccione una opción",JOptionPane.QUESTION_MESSAGE);
		
		int resp = box.getSelectedIndex() ;
		
		int menu = JOptionPane.showOptionDialog(null, "¿Seleccione una opccion desea cambiar?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, array, array[1]);

	}

}
