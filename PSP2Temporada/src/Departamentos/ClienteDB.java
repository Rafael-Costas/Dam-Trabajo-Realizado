package Departamentos;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.awt.*;

public class ClienteDB extends JFrame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;
	static JTextField depconsultar = new JTextField(2);
	static JLabel etiqueta = new JLabel("Departamento a consultar:");
	private JScrollPane scrollpanel;
	static JTextArea textareal;
	JButton boton = new JButton("Enviar");
	JButton desconectar = new JButton("Salir");
	boolean repetir = true;
	static Socket socket;

	// streams
	ObjectInputStream inObjeto;
	DataOutputStream salida;

	// constructor
	public ClienteDB(Socket s) {
		super("OPERACIONES CON BD");
		socket = s;
		try {
			salida = new DataOutputStream(socket.getOutputStream());
			inObjeto = new ObjectInputStream(socket.getInputStream());

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}
		setLayout(null);
		etiqueta.setBounds(10, 10, 200, 30);
		add(etiqueta);
		depconsultar.setBounds(210, 10, 50, 30);
		add(depconsultar);
		textareal = new JTextArea();
		scrollpanel = new JScrollPane(textareal);
		scrollpanel.setBounds(10, 50, 400, 300);
		add(scrollpanel);
		boton.setBounds(420, 10, 100, 30);
		add(boton);
		desconectar.setBounds(420, 50, 100, 30);
		add(desconectar);
		textareal.setEditable(false);
		boton.addActionListener(this);
		desconectar.addActionListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			try {
				salida.writeUTF(depconsultar.getText());
			} catch (IOException el) {
				el.printStackTrace();
			}
		}
		if (e.getSource() == desconectar) {
			try {
				socket.close();
			} catch (IOException el) {
				el.printStackTrace();
				System.exit(0);
			}
		}
	}

	public void run() {
		String texto = "";
		while (repetir) {
			try {
				Departamentos d = null;
				d = (Departamentos) inObjeto.readObject();
				textareal.setText("");
				textareal.setForeground(Color.blue);

				if (d == null) {
					textareal.setForeground(Color.red);
					System.out.println(" «EL DEPARTAMENTO NO EXISTE>>");

				} else {
					texto = "Número Dep: " + d.getDeptNo() + "\n " + " Nombre: " + d.getDnombre() + "\tLocalidad: "
							+ d.getLoc();
					textareal.append(texto);
					PintarEmpleados(d);
				}

			} catch (SocketException s) {
				repetir = false;

			} catch (IOException e) {
				e.printStackTrace();
				repetir = false;

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				repetir = false;

			}
		}
		try {
			socket.close();
			System.exit(0);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	private void PintarEmpleados(Departamentos d) {
		Set<Empleados> listaemple = d.getEmpleadoses();
		textareal.setForeground(Color.blue);

		if (listaemple == null) {
			PintaMensaje("EL DEPARTAMENTO NO TIENE EMPLEADOS");

		} else {
			PintaMensaje("EMPLEADOS DEL DEPARTAMENTO: " + listaemple.size());
			Iterator<Empleados> it = listaemple.iterator();
			while (it.hasNext()) {
				Empleados emple = new Empleados();
				emple = it.next();
				textareal.append("\n" + emple.getEmpNo() + " * " + emple.getApellido() + " * " + emple.getOficio()
						+ " * " + emple.getSalario());

			}
			textareal.append("\n ");

		}
	}

	private void PintaMensaje(String mensaje) {
		textareal.append("\n - - - - - - - - - - - - - - - - - - - -");

		textareal.append("\n" + mensaje);
		textareal.append("\n - - - - - -");

	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		int puerto = 44441;
		Socket s = new Socket("localhost", puerto);
		ClienteDB hiloC = new ClienteDB(s);
		hiloC.setBounds(0, 0, 540, 400);
		hiloC.setVisible(true);
		new Thread(hiloC).start();

	}

}