package EjercicioAntonio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Base extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCuenta;
	private JTextField Fecha;
	private JTextField Saldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Base frame = new Base();
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
	public Base() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero de Cuenta");
		lblNewLabel.setBounds(10, 31, 112, 13);
		contentPane.add(lblNewLabel);
		
		txtCuenta = new JTextField();
		txtCuenta.setText("Cuenta");
		txtCuenta.setBounds(132, 28, 266, 19);
		contentPane.add(txtCuenta);
		txtCuenta.setColumns(10);
		
		Fecha = new JTextField();
		Fecha.setColumns(10);
		Fecha.setBounds(132, 170, 82, 19);
		contentPane.add(Fecha);
		
		Saldo = new JTextField();
		Saldo.setColumns(10);
		Saldo.setBounds(321, 170, 77, 19);
		contentPane.add(Saldo);
		
		JComboBox Cliente = new JComboBox();
		Cliente.setBounds(132, 74, 266, 21);
		contentPane.add(Cliente);
		
		JComboBox Sucursal = new JComboBox();
		Sucursal.setBounds(132, 113, 266, 21);
		contentPane.add(Sucursal);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente\r\n");
		lblNewLabel_1.setBounds(10, 78, 77, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sucursal");
		lblNewLabel_1_1.setBounds(10, 117, 77, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha\r\n");
		lblNewLabel_1_1_1.setBounds(10, 173, 77, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Saldo: ");
		lblNewLabel_1_1_1_1.setBounds(236, 173, 77, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton Nuevo = new JButton("Nuevo");
		Nuevo.setBounds(480, 27, 85, 21);
		contentPane.add(Nuevo);
		
		JButton Actualizar = new JButton("Actualizar");
		Actualizar.setBounds(480, 74, 85, 21);
		contentPane.add(Actualizar);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.setBounds(480, 113, 85, 21);
		contentPane.add(Eliminar);
		
		JButton Listado = new JButton("Listado\r\n");
		Listado.setBounds(480, 169, 85, 21);
		contentPane.add(Listado);
		
		JButton Ok = new JButton("Ok\r\n");
		Ok.setBounds(453, 363, 64, 21);
		contentPane.add(Ok);
		
		JButton btnCancel = new JButton("Cancel\r\n");
		btnCancel.setBounds(554, 363, 82, 21);
		contentPane.add(btnCancel);
	}
}
