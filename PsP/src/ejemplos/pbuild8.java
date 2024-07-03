package ejemplos;

import java.io.IOException;

public class pbuild8 {

	public static void main(String[] args)throws IOException,
	InterruptedException {
		ProcessBuilder pb = new ProcessBuilder
				("powershell.exe","echo", "Hello GeeksforGeeks"
				+ "This is ProcessBuilder Example");
				pb.inheritIO();
				Process process = pb.start();
				//Esperando a qe termine la ejecucion de echo
				process.waitFor();
	}
}
