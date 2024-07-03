package Nuevo;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Conexion1 extends JFrame {
	String url="jdbc:mysql://";
	private JPanel contentPane;
	private Connection con;
	private JTextField server;
	private JTextField puerto;
	private JTextField usuario;
	private JTable table;
	private DefaultTableModel model;
	private JPasswordField contraseña;
	private JScrollPane scrollPane; 
	ImageIcon   img3 = new ImageIcon  (getClass().getResource("/imagen/Sin título.jpeg"));
	private JTextField Ejecutable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conexion1 frame = new Conexion1();
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
	public Conexion1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 421);
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
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(176, 150, 96, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Conectarse\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//url="jdbc:mysql://localhost:3306";
				 url+=server.getText()+":"+String.valueOf(puerto.getText());
				
					//con=DriverManager.getConnection(url,usuario.getText(), contraseña.getText());
					ConexionBd miConexionBd = new ConexionBd(server.getText(), puerto.getText(), usuario.getText(), contraseña.getText());
					con = miConexionBd.getConexion();
					Statement s;
					try {
						s = con.createStatement();
						// s.execute("use northwind");
						
						  ResultSet rs =  s.executeQuery("show DATABASES");;
						 while(rs.next()) {
							
									System.out.println(rs.getString(1));
									 comboBox.addItem(rs.getString(1));
								}
								comboBox.setEnabled(true);
								// System.out.println(rs.getInt(1)+" "+rs.getString(2));
							 
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
				
					e1.printStackTrace();
					}
						
				System.out.println("Joya");
			
			}
	});
		btnNewButton.setBounds(10, 353, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("base de datos");
		lblNewLabel_1.setBounds(23, 147, 85, 13);
		contentPane.add(lblNewLabel_1);
		 Ejecutable = new JTextField();
		 Ejecutable.setBounds(176, 181, 273, 19);
		 contentPane.add(Ejecutable);
		 Ejecutable.setColumns(10);
		 
		
		JButton btnNewButton_1 = new JButton("Mostrar tablas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.getSelectedItem();
				Statement s;
				 try {
					 s=con.createStatement();
					 s.execute("use "+comboBox.getSelectedItem());
					ResultSet rs =  s.executeQuery("SHOW TABLES;");
					while(rs.next()) {
						System.out.println(rs.getString(1));
						// comboBox_1.addItem(rs.getString(1));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
				
			}
		});
		
		btnNewButton_1.setBounds(120, 353, 126, 21);
		contentPane.add(btnNewButton_1);
		 scrollPane = new JScrollPane();
		 scrollPane.setBounds(23, 213, 426, 130);
		 contentPane.add(scrollPane);
		JLabel lblNewLabel_2 = new JLabel("Seleccione tabla\r\n");
		lblNewLabel_2.setBounds(23, 182, 99, 13);
		contentPane.add(lblNewLabel_2);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model=new DefaultTableModel();
		model.setColumnCount(0);
		model.setRowCount(0);
		table.setModel(model);
		
		JButton btnNewButton_2 = new JButton("Datos de una tabla\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	comboBox_1.getSelectedItem();
				Statement s;
				 try {
					 s=con.createStatement();
					
					ResultSet rs =  s.executeQuery(Ejecutable.getText());
						
						
						ResultSetMetaData metaData = rs.getMetaData();
						model.setColumnCount(0); // Limpia las columnas existentes

						model.setRowCount(0);
						 
						  for(int i=1;i<=metaData.getColumnCount();i++) {
								model.addColumn(metaData.getColumnName(i));
								
							}
						  Object [] row2 = new Object[metaData.getColumnCount()];
							while(rs.next()) {
							for(int i=1;i<=metaData.getColumnCount();i++) {
								//System.out.println(rsmd.getColumnType(i));
								try {
							
									    row2[i - 1] = rs.getObject(i);
									
								} catch (Exception e1) {
									// TODO Auto-generated catch block
								}
							}
							model.addRow(row2);
								
								
						
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
				
			}
		});
		btnNewButton_2.setBounds(256, 353, 119, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel Imagen = new JLabel("");
		Imagen.setBounds(480, 32, 325, 313);
		contentPane.add(Imagen);
		Image image = img3.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH);
		 ImageIcon resizedImage = new ImageIcon(image);
		 Imagen.setIcon(resizedImage);
		 
	
		 
	}
}