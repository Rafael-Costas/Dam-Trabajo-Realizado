import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframe1 extends JFrame {
	String url="jdbc:mysql://";
	private JPanel contentPane;
	private Connection con;
	private JTextField server;
	private JTextField puerto;
	private JTextField usuario;
	private JPasswordField contraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("PETÓ");
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe1 frame = new jframe1();
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
	public jframe1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce el server");
		lblNewLabel.setBounds(23, 32, 99, 13);
		contentPane.add(lblNewLabel);
		
		server = new JTextField();
		server.setText("localhost");
		server.setBounds(176, 29, 96, 19);
		contentPane.add(server);
		server.setColumns(10);
		
		JLabel lblIntroduceElPuerto = new JLabel("Introduce el puerto");
		lblIntroduceElPuerto.setBounds(23, 65, 99, 13);
		contentPane.add(lblIntroduceElPuerto);
		
		puerto = new JTextField();
		puerto.setText("3306");
		puerto.setColumns(10);
		puerto.setBounds(176, 62, 96, 19);
		contentPane.add(puerto);
		
		JLabel lblIntroduceElUsuario = new JLabel("Introduce el usuario\r\n");
		lblIntroduceElUsuario.setBounds(23, 94, 99, 13);
		contentPane.add(lblIntroduceElUsuario);
		
		usuario = new JTextField();
		usuario.setText("root");
		usuario.setColumns(10);
		usuario.setBounds(176, 91, 96, 19);
		contentPane.add(usuario);
		
		JLabel lblIntroduceLaContrasea = new JLabel("Introduce la contraseña\r\n");
		lblIntroduceLaContrasea.setBounds(23, 124, 126, 13);
		contentPane.add(lblIntroduceLaContrasea);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(176, 121, 96, 19);
		contentPane.add(contraseña);
		
		JButton btnNewButton = new JButton("Conectarse\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//url="jdbc:mysql://localhost:3306";
				 url+=server.getText()+":"+String.valueOf(puerto.getText());
				 try {
					con=DriverManager.getConnection(url,usuario.getText(), contraseña.getText());
					System.out.println("Joya");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("Cagastae");
				}
			}
		});
		btnNewButton.setBounds(23, 166, 85, 21);
		contentPane.add(btnNewButton);
	}
}
