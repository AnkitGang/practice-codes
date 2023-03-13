
import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;

public class Client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String str = JOptionPane.showInputDialog(null, "Enter a Sentence : ", "Input", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Sentence is : "+str);
        int count ;
        dout.writeUTF(str);
        dout.flush();
        count = Integer.parseInt(din.readUTF());
        System.out.println("Server says : \nNumber of Character in- "+str+ " are : " + count);

        dout.close();
        s.close();
    }
}
