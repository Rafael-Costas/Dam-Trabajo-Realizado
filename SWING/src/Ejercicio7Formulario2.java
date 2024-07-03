import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio7Formulario2 extends JFrame {
private  Ejercicio7Boletin ej7;
public String datosPadre;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ejercicio7Formulario2(Ejercicio7Boletin ej7) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS ENVIADOS!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBounds(69, 10, 290, 59);
		contentPane.add(lblNewLabel);
		
		JButton Volver = new JButton("VOLVER\r\n");
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ej7.setVisible(true);
			}
		});
	
		Volver.setBounds(20, 154, 85, 21);
		contentPane.add(Volver);
		
		JButton cerrar = new JButton("CERRAR\r\n");
		cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cerrar.setBounds(253, 154, 85, 21);
		contentPane.add(cerrar);
		
		JLabel Datos = new JLabel("New label");
		Datos.setBounds(60, 106, 278, 13);
		contentPane.add(Datos);
	}

	
		
	

}
