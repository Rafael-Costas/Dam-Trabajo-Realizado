package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class transacciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private Coordinador miCoordinador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					transacciones frame = new transacciones();
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
	public transacciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Transacciones");
		lblNewLabel.setBounds(270, 10, 130, 13);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ingreso");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(48, 63, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnReintegro = new JRadioButton("Reintegro");
		buttonGroup.add(rdbtnReintegro);
		rdbtnReintegro.setBounds(195, 63, 103, 21);
		contentPane.add(rdbtnReintegro);
		
		JRadioButton rdbtnTransferencia = new JRadioButton("Transferencia");
		buttonGroup.add(rdbtnTransferencia);
		rdbtnTransferencia.setBounds(351, 63, 103, 21);
		contentPane.add(rdbtnTransferencia);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setBounds(10, 131, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(48, 128, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccionar Cuenta");
		lblNewLabel_2.setBounds(170, 131, 103, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(283, 127, 171, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad");
		lblNewLabel_3.setBounds(464, 131, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(519, 128, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(195, 250, 171, 13);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Seleccionar Cuenta");
		lblNewLabel_4.setBounds(48, 250, 145, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton Ok = new JButton("OK");
		Ok.setBounds(416, 306, 85, 21);
		contentPane.add(Ok);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Cancel.setBounds(562, 306, 85, 21);
		contentPane.add(Cancel);
	}
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
}
