package semana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
	    public static void main(String[] args) throws IOException {
	        Socket socket = new Socket("localhost", 1234);

	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

	        String userInput;
	        while ((userInput = stdIn.readLine()) != null) {
	            out.println(userInput);
	            System.out.println("Day of week: " + in.readLine());
	        }

	        out.close();
	        in.close();
	        stdIn.close();
	        socket.close();
	    }
	
}