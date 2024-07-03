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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import Nuevo.ConexionBd;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import java.awt.ComponentOrientation;

public class ConsultaOrders extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVinet;
	private JTextField fecha1;
	private JTextField Fecha2;
	private JTable table;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaOrders frame = new ConsultaOrders();
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
	 public ConsultaOrders() {
		// TODO Auto-generated constructor stub
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel lblNewLabel_1 = new JLabel("Primera Fecha");
		lblNewLabel_1.setBounds(51, 66, 96, 13);
		contentPane.add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(2, 2000));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(41, 156, 385, 97);
		contentPane.add(scrollPane);
		table = new JTable();
		model=new DefaultTableModel();
		model.setColumnCount(0);
		model.setRowCount(0);
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(table);
		fecha1 = new JTextField();
		fecha1.setText("996-07-04");
		fecha1.setBounds(157, 63, 170, 19);
		contentPane.add(fecha1);
		fecha1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Segunda Fecha");
		lblNewLabel_1_1.setBounds(51, 109, 96, 13);
		contentPane.add(lblNewLabel_1_1);
		
		Fecha2 = new JTextField();
		Fecha2.setText("3996-07-04");
		Fecha2.setColumns(10);
		Fecha2.setBounds(157, 106, 170, 19);
		contentPane.add(Fecha2);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre cliente");
		lblNewLabel.setBounds(51, 22, 96, 16);
		contentPane.add(lblNewLabel);
		
		txtVinet = new JTextField();
		txtVinet.setText("VINET");
		txtVinet.setBounds(157, 18, 170, 26);
		contentPane.add(txtVinet);
		txtVinet.setColumns(10);
		
		JButton btnNewButton = new JButton("CONSULTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionBd con = new ConexionBd("localhost", "3306", "root", "");
				try {
					Statement st=con.getConexion().createStatement();
					st.execute("USE northwind;");
					
					String consulta="SELECT * FROM orders WHERE CustomerId=? and OrderDate between ? and ?;";
					PreparedStatement ps=con.getConexion().prepareStatement(consulta);
					
					

					ps.setString(1, txtVinet.getText());
					ps.setString(2, fecha1.getText());
					ps.setString(3, Fecha2.getText());
					
					ResultSet rs=ps.executeQuery();	
					
					ResultSetMetaData rsmd = rs.getMetaData();
					 for(int i=1;i<=rsmd.getColumnCount();i++) {
							model.addColumn(rsmd.getColumnName(i));
							
						}
					 Object [] row2 = new Object[rsmd.getColumnCount()];
					while(rs.next()) {
						for(int i=1;i<=rsmd.getColumnCount();i++) {
							//System.out.println(rsmd.getColumnType(i));
							try {
						
								    row2[i - 1] = rs.getObject(i);
								
							} catch (Exception e1) {
								// TODO Auto-generated catch block
							}
						}
						TableColumnModel columnModel = table.getColumnModel();
						for (int column = 0; column < table.getColumnCount(); column++) {
						    int width = 15; // Ancho mínimo
						    for (int row = 0; row < table.getRowCount(); row++) {
						        TableCellRenderer renderer = table.getCellRenderer(row, column);
						        Component comp = table.prepareRenderer(renderer, row, column);
						        width = Math.max(comp.getPreferredSize().width + 1, width);
						    }
						    columnModel.getColumn(column).setPreferredWidth(width);
						}
						model.addRow(row2);
					
						
						/*for(int i=1;i<rsmd.getColumnCount();i++) {
							System.out.print(rs.getObject(i)+" ");
						
						}*/
						
					
					}
					 
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton.setBounds(337, 105, 89, 21);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}