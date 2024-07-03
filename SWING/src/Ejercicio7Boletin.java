import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio7Boletin extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JButton btnContinuar;
	JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7Boletin frame = new Ejercicio7Boletin();
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
	public Ejercicio7Boletin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS ALUMNO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(103, 10, 189, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(30, 58, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1.setBounds(30, 87, 64, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1.setBounds(30, 120, 45, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(130, 55, 181, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 84, 181, 19);
		contentPane.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(103, 116, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		buttonGroup.add(rdbtnF);
		rdbtnF.setBounds(208, 116, 103, 21);
		contentPane.add(rdbtnF);
		
		JRadioButton rdbtnOtro = new JRadioButton("Otro");
		buttonGroup.add(rdbtnOtro);
		rdbtnOtro.setBounds(313, 116, 103, 21);
		contentPane.add(rdbtnOtro);
		
		btnContinuar= new JButton("Continuar");
		btnContinuar.addActionListener(this);
		btnContinuar.setForeground(new Color(0, 255, 0));
		btnContinuar.setBounds(52, 179, 110, 21);
		contentPane.add(btnContinuar);
		
		 btnSalir = new JButton("Salir\r\n");
		 btnSalir.addActionListener(this);
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.setBounds(233, 179, 110, 21);
		contentPane.add(btnSalir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((JButton)e.getSource()==btnContinuar){
			Ejercicio7Formulario2 formulario2=new Ejercicio7Formulario2(this);
			formulario2.setVisible(true);
			String datos = textField.getText()+" "+textField_1.getText();
			setVisible(false);
			
		}else
			if((JButton)e.getSource()==btnSalir) {
				System.exit(0);
		}
	}
}
