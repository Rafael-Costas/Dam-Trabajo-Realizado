package Ejercicios;

import javax.swing.JFileChooser;

public class Ejercicio1diferente {

	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		chooser.setMultiSelectionEnabled(true);
		int result = chooser.showOpenDialog(null);
		if(result!=JFileChooser.APPROVE_OPTION) {
			
		}
	}
}
