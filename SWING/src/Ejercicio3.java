import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa el lado 1");
		lblNewLabel.setBounds(10, 30, 88, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa el lado 2");
		lblNewLabel_1.setBounds(10, 86, 88, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresa el lado 3\r\n");
		lblNewLabel_2.setBounds(10, 148, 88, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("El area del triangulo\r\n");
		lblNewLabel_3.setBounds(10, 219, 109, 13);
		contentPane.add(lblNewLabel_3);
		
		texto1 = new JTextField();
		texto1.setBounds(139, 27, 96, 19);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(139, 83, 96, 19);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		texto3 = new JTextField();
		texto3.setBounds(139, 145, 96, 19);
		contentPane.add(texto3);
		texto3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Reiniciar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto1.setText("");
				texto2.setText("");
				texto3.setText("");
			}
		});
		btnNewButton_1.setBounds(303, 144, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel res = new JLabel("");
		res.setBounds(173, 219, 45, 13);
		contentPane.add(res);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				System.out.print(texto1.getText());
				if((texto1.getText()=="")&&(texto2.getText()=="")&&(texto3.getText()=="")) {
					System.out.println("Cagaste");
				}else {
				int aux= (Integer.parseInt(texto1.getText())+Integer.parseInt(texto2.getText())+Integer.parseInt(texto3.getText()))/2;
			res.setText((Math.sqrt(aux*(aux-Integer.parseInt(texto1.getText()))*(aux-Integer.parseInt(texto2.getText()))*(aux-Integer.parseInt(texto3.getText()))))+"");
				}
			}
		});
		btnNewButton.setBounds(303, 26, 85, 21);
		contentPane.add(btnNewButton);
	}
}
