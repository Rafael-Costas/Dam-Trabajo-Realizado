package FileChoo;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

	public static void main(String[] args) {
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Jose", "txt");
		fileChooser.setFileFilter(filter);
		int seleccion = fileChooser.showOpenDialog(null);
		
		if(seleccion == JFileChooser.APPROVE_OPTION) {
			File archivo = fileChooser.getSelectedFile();
			System.out.println(archivo.getName());
		}
	}
}
