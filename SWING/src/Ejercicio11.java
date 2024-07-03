import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio11 extends JFrame {

	private JPanel contentPane;
	private JTextField Vt;
	private JTextField Vp;
	private JTextField Vn;
	private JTextArea Res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio11 frame = new Ejercicio11();
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
	public Ejercicio11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar el valor de T");
		lblNewLabel.setBounds(10, 20, 140, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngresarElValor = new JLabel("Ingresar el valor de P");
		lblIngresarElValor.setBounds(10, 43, 140, 13);
		contentPane.add(lblIngresarElValor);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresar el valor de N\r\n");
		lblNewLabel_1_1.setBounds(10, 66, 140, 13);
		contentPane.add(lblNewLabel_1_1);
		
		Vt = new JTextField();
		Vt.setBounds(137, 17, 96, 19);
		contentPane.add(Vt);
		Vt.setColumns(10);
		
		Vp = new JTextField();
		Vp.setColumns(10);
		Vp.setBounds(137, 43, 96, 19);
		contentPane.add(Vp);
		
		Vn = new JTextField();
		Vn.setColumns(10);
		Vn.setBounds(137, 66, 96, 19);
		contentPane.add(Vn);
		
		 Res = new JTextArea();
		Res.setBounds(23, 111, 378, 142);
		contentPane.add(Res);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(Vp.getText())<=0) {
					Res.setText("El valor de P tiene que ser más de cero");
				}else {
					Double ValorP= Double.parseDouble(Vp.getText());
					Double ValorN= Double.parseDouble(Vn.getText());
					Double ValorT= Double.parseDouble(Vt.getText());
					Double res1= Math.pow(ValorT, ValorN)/ValorP;
					Double res2= Math.pow(ValorT, ValorN)/Math.pow(ValorP,ValorN);
				}
			}
		});
		btnNewButton.setBounds(277, 16, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vn.setText("");
				Vn.setText("");
				Vn.setText("");
				Res.setText("");
				
			}
		});
		btnReiniciar.setBounds(277, 62, 85, 21);
		contentPane.add(btnReiniciar);
	}
}
