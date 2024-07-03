package Departamentos;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Servidor extends JFrame {
	private static final long serialVersionUID = 1L;
	static Integer PUERTO = 44441;
	public static Integer conexiones = 0;
	static ServerSocket servidor;
	static java.util.Date hora;
	static public JTextField numconex = new JTextField();
	static JLabel numconexLabel = new JLabel();
	static JTextField puerto = new JTextField();
	static JLabel puertoLabel = new JLabel();
	static public JTextArea area = new JTextArea();
	static JScrollPane scroll = new JScrollPane(area);

	public Servidor() {
		super("SERVIDOR - CONTROL DE CONEXIONES A BD");
		Container e = getContentPane();
		numconexLabel.setText("Wde conexiones actuales:");
		puertoLabel.setText("Número de puerto:");
		numconexLabel.setBounds(new Rectangle(10, 10, 160, 25));
		numconex.setBounds(new Rectangle(175, 10, 45, 25));
		puertoLabel.setBounds(new Rectangle(235, 10, 200, 25));
		puerto.setBounds(new Rectangle(350, 10, 50, 25));
		area.setBounds(new Rectangle(10, 60, 390, 200));
		scroll.setBounds(new Rectangle(10, 60, 400, 200));
		area.setEditable(false);
		e.add(scroll, null);
		e.add(numconexLabel);
		e.add(numconex);
		numconex.setEditable(false);
		e.add(puertoLabel);
		e.add(puerto);
		puerto.setEditable(false);
		e.setLayout(null);
		area.setForeground(Color.blue);
		area.setText("");
		setSize(450, 300);

		Dimension dim = getToolkit().getScreenSize();
		setLocation(dim.width / 2 - getWidth() / 2 + 200, (dim.height / 2 - getHeight() / 2) + 200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowListener() {
			public void windowClosing(WindowEvent we) {
				try {
					servidor.close();
					System.out.println("Servidor cerrado ....");
					Conexion.db.close();
					System.exit(0);
				} catch (IOException e) {
					System.err.println("NO SE PUEDE CERRAR servidor." + e.getMessage());
					System.exit(0);
				}
			}

			public void windowOpened(WindowEvent we) {
			}

			public void windowClosed(WindowEvent we) {
			}

			public void windowIconified(WindowEvent we) {
			}

			public void windowDeiconified(WindowEvent we) {
			}

			public void windowActivated(WindowEvent we) {
			}

			public void windowDeactivated(WindowEvent ve) {
			}
		});
	}

	public static void main(String[] args) throws IOException {
		int idCliente = 0;
		servidor = new ServerSocket(PUERTO);
		System.out.println("Servidor Iniciado ....");
		Servidor pantalla = new Servidor();
		pantalla.setVisible(true);
		puerto.setText(PUERTO.toString());
		numconex.setText(conexiones.toString());

		while (true) {
			try {
				Socket cliente = servidor.accept();
				hora = new java.util.Date(System.currentTimeMillis());
				conexiones++;
				idCliente++;
				numconex.setText(conexiones.toString());
				area.append("Conexion ==> " + idCliente);
				InetAddress direccion = cliente.getInetAddress();
				area.append(" Direccion IP " + direccion.toString() + "\n\t Hora: " + hora + "\n");
				HiloServidor hilo = new HiloServidor(cliente, idCliente);
				hilo.start();

			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.exit(0);

			}
		}
	}
}
