import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private final JLabel lblEtiqueta = new JLabel("Nombre");
	private JTextField textField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblEtiqueta.setBackground(Color.BLUE);
		lblEtiqueta.setBounds(39, 34, 153, 36);
		contentPane.add(lblEtiqueta);
		
		textField = new JTextField();
		textField.setBounds(119, 43, 189, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pulsar");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.yellow);
			}
		});
		btnNewButton.setBounds(330, 42, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.pink);
			}
		});
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(50, 121, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
