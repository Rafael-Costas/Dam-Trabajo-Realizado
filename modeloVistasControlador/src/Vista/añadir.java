package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.gatos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class añadir extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField raza;
	private JTextField nombre;
	private JTextField foto;
	private Coordinador cor;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public void setCoordinador(Coordinador miCoordinador) {
		this.cor=miCoordinador;
	}
	public añadir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(10, 38, 37, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblRaza = new JLabel("raza");
		lblRaza.setBounds(10, 74, 37, 22);
		contentPane.add(lblRaza);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(10, 124, 56, 22);
		contentPane.add(lblNombre);
		
		JLabel lblFoto = new JLabel("foto");
		lblFoto.setBounds(10, 160, 37, 22);
		contentPane.add(lblFoto);
		
		id = new JTextField();
		id.setBounds(64, 40, 96, 19);
		contentPane.add(id);
		id.setColumns(10);
		
		raza = new JTextField();
		raza.setBounds(74, 76, 96, 19);
		contentPane.add(raza);
		raza.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(74, 126, 96, 19);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		foto = new JTextField();
		foto.setBounds(74, 162, 96, 19);
		contentPane.add(foto);
		foto.setColumns(10);
		
		JButton Subir = new JButton("Subir");
		Subir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gatos abc = new gatos();
				abc.setId(1);
				abc.setNombre(nombre.getName());
				abc.setRaza(raza.getName());
				abc.setFoto(foto.getText());
				cor.subir(abc);
			}
		});
		Subir.setBounds(222, 97, 85, 21);
		contentPane.add(Subir);
	}
}
