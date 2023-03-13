import java.io.IOException;
import java.net.Socket;

public class clint {
	public static void main(String[] args) {
		try {
			System.out.println("Client is started");
			Socket soc = new Socket("localhost", 9800);
			System.out.println("Client running");
		}
		catch(IOException e) {}
	}
}
