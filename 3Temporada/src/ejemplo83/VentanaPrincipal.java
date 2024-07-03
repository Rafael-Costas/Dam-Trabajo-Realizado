package ejemplo83;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


import AlgoRaro.*;

public class VentanaPrincipal extends JFrame implements ActionListener {



	private Container contenedor; /* Un contenedor de elementos gráficos */
	// Etiquetas estáticas para los nombres de los atributos

	private JButton Cilindro, Piramide, Esfera, Cubo; // Botones

	/**
	 * Constructor de la clase VentanaPrincipal
	 */
	public VentanaPrincipal() {
		

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
		
		contenedor = getContentPane();
		contenedor.setLayout(null);		
		Cilindro = new JButton();
		Cilindro.setText("Cilindro");
		Cilindro.setBounds(120, 80, 80, 23); /* Establece la posición del botón Añadir persona */

		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		Cilindro.addActionListener(this);

		// Establece el botón Eliminar persona
		Piramide = new JButton();
		Piramide.setText("Piramide");
		Piramide.setBounds(20, 50, 80, 23); /* Establece la posición del botón Eliminar persona */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */

		Piramide.addActionListener(this);

		// Establece el botón Borrar lista
		Esfera = new JButton();
		Esfera.setText("Esfera");
		Esfera.setBounds(120, 50, 80, 23); /* Establece la posición del botón Borrar lista */

		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		Esfera.addActionListener(this);
		
		Cubo = new JButton();
		Cubo.setText("Cubo");
		Cubo.setBounds(20, 80, 80, 23); /* Establece la posición del botón Borrar lista */

		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		Cubo.addActionListener(this);

		
	
		contenedor.add(Cilindro);
		contenedor.add(Piramide);
		contenedor.add(Esfera);
		contenedor.add(Cubo);
		
		
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == Piramide) { // Si se pulsa el botón añadir
			Piramide(); // Se invoca añadir persona
		}
		if (evento.getSource() == Cilindro) {
			/*
			 * Si se pulsa el botón eliminar Se invoca el método eliminarNombre que elimina
			 * el elemento seleccionado
			 */
			Cilindro();
		}
		if (evento.getSource() == Esfera) {
			/* Si se pulsa el botón borrar lista */
			Esfera(); // Se invoca borrar lista
		}
		if (evento.getSource() == Cubo) {
			/* Si se pulsa el botón borrar lista */
			Cubo(); // Se invoca borrar lista
		}
		
	}

	/**
	 * Método que agrega una persona al vector de personas y a la lista gráfica de
	 * personas
	 */
	private void Piramide() {
		/* Se obtienen los campos de texto ingresados y se crea una persona */
		VentanaPiramide abc = new VentanaPiramide();
		abc.setVisible(true);
	}

	/**
	 * Método que elimina una persona del vector de personas y de la lista gráfica
	 * de personas en la ventana
	 * 
	 * @param indice
	 *            Parámetro que define la posición de la persona a eliminar
	 */
	private void Cilindro() {
		VentanaCilindro abc = new VentanaCilindro();
		abc.setVisible(true);
	}

	/**
	 * Método que elimina todas las personas del vector de personas
	 */
	private void Esfera() {
		VentanaEsfera abc = new VentanaEsfera();
		abc.setVisible(true);
	}
	
	private void Cubo() {
		VentanaCubo abc = new VentanaCubo();
		abc.setVisible(true);
	}

	/**
	 * Método que guarda todas las personas de la lista en lista.dat
	 */
	
}
