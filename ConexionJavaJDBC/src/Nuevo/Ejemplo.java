package Nuevo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.sql.*;
import java.util.Vector;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Ejemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldConsulta;
	private JTable table;
	private Connection miConexion;
	private JScrollPane scrollPane;
	private DefaultTableModel model;

	/**w
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldConsulta = new JTextField();
		textFieldConsulta.setBounds(40, 22, 328, 42);
		contentPane.add(textFieldConsulta);
		textFieldConsulta.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 118, 387, 148);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model=new DefaultTableModel();
		table.setModel(model);
		
		
		JButton btnConsulta = new JButton("Ejecutar consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String consulta=textFieldConsulta.getText();
				try {
					Statement st=miConexion.createStatement();
					ResultSet rs=st.executeQuery(consulta);
					ResultSetMetaData rsmd=rs.getMetaData();
					
					model.setColumnCount(0); // Limpia las columnas existentes

					model.setRowCount(0);
					for(int i=1;i<=rsmd.getColumnCount();i++) {
						model.addColumn(rsmd.getColumnName(i));
						System.out.println(rsmd.getColumnName(i));
					}
					
					System.out.println(rsmd.getColumnCount());
					
					while(rs.next()) {
						//Vector <Object> row = new Vector<Object>();
						Object [] row2 = new Object[rsmd.getColumnCount()];
						
						for(int i=1;i<=rsmd.getColumnCount();i++) {
							//System.out.println(rsmd.getColumnType(i));
							try {
						
								    row2[i - 1] = rs.getObject(i);
								
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								
							}
						}
						//model.addRow(row);
						model.addRow(row2);
					
					
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		btnConsulta.setBounds(40, 77, 134, 29);
		contentPane.add(btnConsulta);
		
		ConexionBd con = new ConexionBd("localhost","3306","root","");
		miConexion = con.getConexion();
		
		try {
			Statement st=miConexion.createStatement();
			st.execute("USE northwind");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}