import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio10 extends JFrame {

	private JPanel contentPane;
	private JTextField R;
	private JTextField Q;
	private JTextField T;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 frame = new Ejercicio10();
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
	public Ejercicio10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar el valor de R\r\n");
		lblNewLabel.setBounds(10, 10, 134, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresar el valor de Q\r\n");
		lblNewLabel_1.setBounds(10, 43, 134, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar el valor de T\r\n");
		lblNewLabel_2.setBounds(10, 75, 147, 13);
		contentPane.add(lblNewLabel_2);
		
		R = new JTextField();
		R.setBounds(219, 7, 96, 19);
		contentPane.add(R);
		R.setColumns(10);
		
		Q = new JTextField();
		Q.setColumns(10);
		Q.setBounds(219, 40, 96, 19);
		contentPane.add(Q);
		
		T = new JTextField();
		T.setColumns(10);
		T.setBounds(219, 72, 96, 19);
		contentPane.add(T);
		
		JTextArea Res = new JTextArea();
		Res.setBounds(40, 157, 262, 96);
		contentPane.add(Res);
		
		JButton btnNewButton = new JButton("CALCULAR\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double solu=Math.pow(Integer.parseInt(R.getText()), 4)-Math.pow(Integer.parseInt(T.getText()),3)+4*(Math.pow(Integer.parseInt(Q.getText()),2));
				Res.setText("El valor de la variable R es: "+R.getText()+"\n"
						+ "El valor de la variable Q es: "+Q.getText()+"\n"
						+"El valor de la variable T es: "+T.getText()+"\n"
						+ "El resultado es: "+solu);
				
			}
		});
		btnNewButton.setBounds(10, 111, 112, 21);
		contentPane.add(btnNewButton);
		
		JButton btnReiniciar = new JButton("REINICIAR\r\n");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				R.setText("");
				Q.setText("");
				T.setText("");
				Res.setText("");
			}
		});
		btnReiniciar.setBounds(163, 111, 121, 21);
		contentPane.add(btnReiniciar);
	}
}
