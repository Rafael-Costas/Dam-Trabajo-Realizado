package Ejercicio3;


import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class ventanaPrincipal  extends JFrame implements ActionListener {

	private Component campoNombre;

	private Container contenedor; /* Un contenedor de elementos gráficos */
	// Etiquetas estáticas para los nombres de los atributos

	private JButton libras, euros, Esfera, Cubo; // Botones

	/**
	 * Constructor de la clase VentanaPrincipal
	 */
	public ventanaPrincipal() {
		

		inicio();

		setTitle("Opciones"); // Establece el título de la ventana
		setSize(260, 200); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		// Establece que el botón de cerrar permitirá salir de la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		
		campoNombre = new JTextField();
		// Establece la posición del campo de texto nombre
		campoNombre.setBounds(50, 20, 135, 23);
		// Establece la etiqueta y el campo apellidos
		
		contenedor = getContentPane();
		contenedor.setLayout(null);		
		libras = new JButton();
		libras.setText("Libras");
		libras.setBounds(120, 100, 80, 23); /* Establece la posición del botón Añadir persona */

		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		libras.addActionListener(this);

		// Establece el botón Eliminar persona
		euros = new JButton();
		euros.setText("Euros");
		euros.setBounds(20, 100, 80, 23); /* Establece la posición del botón Eliminar persona */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */

		euros.addActionListener(this);

		

		
		contenedor.add(campoNombre);
		contenedor.add(libras);
		contenedor.add(euros);
		
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == euros) { // Si se pulsa el botón añadir
		//	euros(); // Se invoca añadir persona
		}
		if (evento.getSource() == libras) {
			/*
			 * Si se pulsa el botón eliminar Se invoca el método eliminarNombre que elimina
			 * el elemento seleccionado
			 */
			//Cilindro();
		}
				
	}
	
	


}