package Nuevo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormConector extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldServidor;
	private JTextField txtFieldPuerto;
	private JTextField txtFieldUser;
	private JPasswordField passwordField;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormConector frame = new FormConector();
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
	public FormConector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Servidor y puerto");
		lblNewLabel.setBounds(42, 53, 116, 16);
		contentPane.add(lblNewLabel);
		
		txtFieldServidor = new JTextField();
		txtFieldServidor.setText("localhost");
		txtFieldServidor.setBounds(170, 48, 136, 26);
		contentPane.add(txtFieldServidor);
		txtFieldServidor.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(42, 90, 61, 16);
		contentPane.add(lblUsuario);
		
		txtFieldPuerto = new JTextField();
		txtFieldPuerto.setText("3306");
		txtFieldPuerto.setColumns(10);
		txtFieldPuerto.setBounds(318, 48, 61, 26);
		contentPane.add(txtFieldPuerto);
		
		txtFieldUser = new JTextField();
		txtFieldUser.setText("root");
		txtFieldUser.setBounds(170, 86, 130, 26);
		contentPane.add(txtFieldUser);
		txtFieldUser.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(42, 130, 94, 16);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 124, 130, 26);
		contentPane.add(passwordField);
		
		comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setBounds(170, 170, 130, 27);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Conectar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String host=txtFieldServidor.getText();
				String user=txtFieldUser.getText();
				String puerto=txtFieldPuerto.getText();
				
				char [] password=passwordField.getPassword();
				String pass=new String(password);
				
				ConexionBd miConexion=new ConexionBd(host,puerto,user,pass);
				Connection con=miConexion.getConexion();
				
				try {
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("SHOW DATABASES");
					while(rs.next()) {
						System.out.println(rs.getString(1));
						comboBox.addItem(rs.getString(1));
					}
					comboBox.setEnabled(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(305, 219, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblBD = new JLabel("Base de datos");
		lblBD.setEnabled(false);
		lblBD.setBounds(42, 174, 94, 16);
		contentPane.add(lblBD);
		
		
	}
}
