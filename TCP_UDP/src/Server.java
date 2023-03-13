
import javax.swing.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;

public class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());


        String str = "";

        str = din.readUTF();
        // Counting characters in string
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }

        System.out.println("Client Sends : "+str+"\nNumber of Characters in- " + str+" are : "+count);

        dout.writeUTF(String.valueOf(count));
        dout.flush();

        din.close();
        s.close();
        ss.close();
    }
}
