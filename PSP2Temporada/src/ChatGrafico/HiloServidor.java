package ChatGrafico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class HiloServidor extends Thread {

	DataInputStream fentrada;
	Socket socket = null;

	public HiloServidor(Socket s) {
		socket = s;
		try {
			fentrada = new DataInputStream(socket.getInputStream());

		} catch (IOException e) {
			System.out.println("ERROR DE E/S");
			e.printStackTrace();

		}

	}

	public void run() {
		ServidorChat.mensaje.setText("NUMERO DE CONEXIONES ACTUALES: " + ServidorChat.ACTUALES);
		String texto = ServidorChat.textarea.getText();
		EnviarMensajes(texto);

		while (true) {
			String cadena = "";
			try {
				cadena = fentrada.readUTF();

				if (cadena.trim().equals("QUIT")) {
					ServidorChat.ACTUALES--;
					ServidorChat.mensaje.setText("NUMERO DE CONEXIONES ACTUALES: " + ServidorChat.ACTUALES);
					ServidorChat.tabula.remove(this);
					break;
				}

				ServidorChat.textarea.append(cadena + "\n");
				texto = ServidorChat.textarea.getText();
				EnviarMensajes(texto);

			} catch (Exception e) {
				e.printStackTrace();
				break;

			}
		}
	}

	private void EnviarMensajes(String texto) {
		int i;

		for (i = 0; i < ServidorChat.CONEXIONES; i++) {
			Socket si = ServidorChat.tabula.get(i);

			try {
				DataOutputStream fsalida = new DataOutputStream(si.getOutputStream());
				fsalida.writeUTF(texto);

			} catch (SocketException se) {

			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}
}