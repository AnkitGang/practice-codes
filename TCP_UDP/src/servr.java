import java.io.IOException;
import java.io.IOException.*;
import java.net.ServerSocket;
import java.net.Socket;

public class servr {
	public static void main(String[] args) {
		try
		{
			System.out.println("Waiting for client");
			ServerSocket ss = new ServerSocket(9800);
			Socket soc = ss.accept();
			System.out.println("Connection is established");
		}
		catch(IOException e) {
		}
		
	}
}
