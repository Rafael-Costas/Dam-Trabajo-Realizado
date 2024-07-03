import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField texto;
	private String aux;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto = new JTextField();
		texto.setBounds(58, 25, 294, 147);
		contentPane.add(texto);
		texto.setColumns(10);
		
		JButton btnNewButton = new JButton("Ocultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(texto.getText().isEmpty()) {
					
					System.out.println("No hay nah");
				}else {
					aux=texto.getText();
					texto.setText("");
				}
			}
		});
		btnNewButton.setBounds(41, 211, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aux==null) {
					System.out.println("No hay nada que mostrar");
				}else {
					texto.setText(aux);
					aux=null;
				}
			}
		});
		btnNewButton_1.setBounds(267, 211, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
