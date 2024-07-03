package ConsultaPreparadas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Nuevo.ConexionBd;

public class ConsultaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaCliente frame = new ConsultaCliente();
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
	public ConsultaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre cliente");
		lblNewLabel.setBounds(48, 105, 96, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(156, 100, 170, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CONSULTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionBd con = new ConexionBd("localhost", "3306", "root", "");
				try {
					Statement st=con.getConexion().createStatement();
					st.execute("USE northwind;");
					
					String consulta="SELECT * FROM customers WHERE customerID=?";
					PreparedStatement ps=con.getConexion().prepareStatement(consulta);
					

					ps.setString(1, textField.getText());
					ResultSet rs=ps.executeQuery();	
					
					ResultSetMetaData rsmd = rs.getMetaData();
					
					while(rs.next()) {
						for(int i=1;i<rsmd.getColumnCount();i++) {
							System.out.print(rs.getObject(i)+" ");
						}
						System.out.println();
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(214, 151, 117, 29);
		contentPane.add(btnNewButton);
	}
}