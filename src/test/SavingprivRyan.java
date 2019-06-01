package test;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.out;
	
	public class SavingprivRyan {
		public static void main (String... params) {
			String      s;
			Scanner     inputStream;
			PrintWriter outputStream;
			var console = new Scanner(System.in);
			out.print("Enter name: ");
			String name = console.nextLine();
			try {
				// Connect to server, port 6789
				Socket clientSocket = new Socket("Omen-646" ,6789);
				//set up streams to send/receive data
				inputStream  = new Scanner(new InputStreamReader(clientSocket.getInputStream()));
				outputStream = new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));
				// send name to the server
				outputStream.println(name);
				outputStream.flush(); //sends data to the stream
				// read everything from the server until no more lines and output it to the screen
				while (inputStream.hasNextLine()) {
					s = inputStream.nextLine();
					out.println(s);
				}
				inputStream.close();
				outputStream.close();
			} catch (Exception e) {
				out.println("Error " + e);
			}
		}
	}

