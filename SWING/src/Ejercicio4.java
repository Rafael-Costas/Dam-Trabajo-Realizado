import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField punto1x;
	private JTextField punto1y;
	private JTextField punto2x;
	private JTextField punto2y;
	private JTextField punto3x;
	private JTextField punto3y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar el Punto1");
		lblNewLabel.setBounds(10, 64, 84, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresar el punto 2");
		lblNewLabel_1.setBounds(10, 96, 106, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar el punto 3");
		lblNewLabel_2.setBounds(10, 119, 106, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Coordenada X");
		lblNewLabel_3.setBounds(161, 10, 76, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Coordenada Y");
		lblNewLabel_4.setBounds(308, 10, 76, 13);
		contentPane.add(lblNewLabel_4);
		
		punto1x = new JTextField();
		punto1x.setBounds(141, 61, 96, 19);
		contentPane.add(punto1x);
		punto1x.setColumns(10);

		
		punto1y = new JTextField();
		punto1y.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(c== '.' && ((JTextField)e.getSource()).getText().contains(".")){
					e.consume();
					
				}else if(!Character.isDigit(c)){
					e.consume();
				}
			}
		});
		punto1y.setBounds(308, 61, 96, 19);
		contentPane.add(punto1y);
		punto1y.setColumns(10);
		
		punto2x = new JTextField();
		punto2x.setBounds(141, 93, 96, 19);
		contentPane.add(punto2x);
		punto2x.setColumns(10);
		
		punto2y = new JTextField();
		punto2y.setBounds(308, 93, 96, 19);
		contentPane.add(punto2y);
		punto2y.setColumns(10);
		
		punto3x = new JTextField();
		punto3x.setBounds(141, 119, 96, 19);
		contentPane.add(punto3x);
		punto3x.setColumns(10);
		
		punto3y = new JTextField();
		punto3y.setBounds(308, 116, 96, 19);
		contentPane.add(punto3y);
		punto3y.setColumns(10);
		
		JLabel res = new JLabel("Valor del perimetro:\r\n\r\n");
		res.setBounds(10, 227, 190, 13);
		contentPane.add(res);
		
		JButton btnNewButton = new JButton("Calcular\r\n");
		btnNewButton.setBounds(35, 185, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reiniciar\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				punto1x.setText("");
				punto2x.setText("");
				punto3x.setText("");
				punto1y.setText("");
				punto2y.setText("");
				punto3y.setText("");
		
			}
		});
		btnNewButton_1.setBounds(239, 185, 85, 21);
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("AARON SABE DE LO QUE HABLO");
	}
}
