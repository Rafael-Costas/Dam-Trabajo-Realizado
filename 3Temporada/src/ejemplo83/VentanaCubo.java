package ejemplo83;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCubo extends JFrame implements ActionListener  {


		private Container contenedor;

		private JLabel radio,  volumen, superficie;
		// Campos de texto a ingresar
		private JTextField campoRadio;
		// Botón para realizar los cálculos numéricos
		private JButton calcular, volver;

		/**
		 * Constructor de la clase VentanaCilindro
		 */
		public VentanaCubo() {
			inicio();
			setTitle("Cubo"); // Establece el título de la ventana
			setSize(280, 210); // Establece el tamaño de la ventana
			setLocationRelativeTo(null);
			setResizable(false);
		}

		/**
		 * Método que crea la ventana con sus diferentes componentes gráficos
		 */
		private void inicio() {
			contenedor = getContentPane();
			contenedor.setLayout(null);

			// Establece la etiqueta y campo de texto para el radio del cilindro
			radio = new JLabel();
			radio.setText("Lado (cms):");
			radio.setBounds(20, 20, 135, 23);

			campoRadio = new JTextField();
			// Establece la posición del campo de texto de radio del cilindro
			campoRadio.setBounds(100, 20, 135, 23);
			// Establece la etiqueta y campo de texto para la altura del cilindro

			

			/*
			 * Establece el botón para calcular el volumen y superficie del cilindro
			 */
			calcular = new JButton();
			calcular.setText("Calcular");
			calcular.setBounds(110, 80, 110, 23);
			/*
			 * Agrega al botón un ActionListener para que gestione eventos del botón
			 */
			calcular.addActionListener(this);
			
			volver = new JButton();
			volver.setText("Volver");
			volver.setBounds(5, 80, 105, 23);

			// Establece la etiqueta y el valor del volumen del cilindro
			volumen = new JLabel();
			volumen.setText("Volumen (cm3):");
			// Establece la posición de la etiqueta de volumen del cilindro
			volumen.setBounds(20, 110, 135, 23);

			// Establece la etiqueta y el valor de la superficie del cilindro
			superficie = new JLabel();
			superficie.setText("Superficie (cm2):");
			// Establece la posición de la etiqueta de superficie del cilindro
			superficie.setBounds(20, 140, 135, 23);

			// Se añade cada componente gráfico al contenedor de la ventana
			contenedor.add(radio);
			contenedor.add(campoRadio);
			
			contenedor.add(calcular);
			contenedor.add(volumen);
			contenedor.add(superficie);

			}

		/**
		 * Método que gestiona los eventos generados en la ventana del cilindro throws
		 * Exception Excepción al ingresar un campo nulo o error en formato de número
		 */
		public void actionPerformed(ActionEvent event) {
			// Se inicializan el radio y la altura del cilindro
			boolean error = false; /* Se inicializa variable para determinar si ocurre un error */
			double lado = 0;
		
			if(event.getSource() == volver) {
		
			}
			try {
				// Se obtiene el radio del cilindro ingresado
				lado = Double.parseDouble(campoRadio.getText());
				// Se obtiene la altura del cilindro ingresada
				
				Cubo Cubo = new Cubo(lado); /* Se crea un objeto Cilindro */
				// Se calcula y muestra el volumen
				volumen.setText("Volumen (cm3): " + String.format("%.2f", Cubo.CalcularVolumen()));
				// Se calcula y muestra la superficie
				superficie.setText("Superficie (cm2): " + String.format("%.2f", Cubo.CalcularSuperficie()));
			} catch (Exception e) {
				error = true; // Si ocurre una excepción
			} finally {
				if (error) { /* Si ocurre una excepción, se muestra un mensaje de error */
					JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}