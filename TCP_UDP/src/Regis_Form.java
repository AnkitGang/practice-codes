import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

public class Regis_Form {

    JFrame j;
    JButton submit, clear;
    JLabel title, name, email, pass, cpass, country, state, phone;
    JTextField n, e, count, st, ph;
    JPasswordField p, cp;
    String[] a1 = new String[7];

    public Regis_Form() {
        j = new JFrame("Registration Form in Java");
        j.getContentPane().setBackground(Color.white);

        title = new JLabel("Registration Form");
        title.setBounds(50, 5, 300, 25);
        title.setForeground(Color.blue);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        name = new JLabel("Name:");
        name.setBounds(30, 40, 150, 30);

        n = new JTextField();
        n.setBounds(200, 40, 250, 30);

        email = new JLabel("Email-ID:");
        email.setBounds(30, 80, 150, 30);

        e = new JTextField();
        e.setBounds(200, 80, 250, 30);

        pass = new JLabel("Create Password:");
        pass.setBounds(30, 120, 150, 30);

        p = new JPasswordField();
        p.setBounds(200, 120, 250, 30);

        cpass = new JLabel("Confirm Password:");
        cpass.setBounds(30, 160, 150, 30);

        cp = new JPasswordField();
        cp.setBounds(200, 160, 250, 30);

        country = new JLabel("Country:");
        country.setBounds(30, 200, 150, 30);

        count = new JTextField();
        count.setBounds(200, 200, 250, 30);

        state = new JLabel("State:");
        state.setBounds(30, 240, 150, 30);

        st = new JTextField();
        st.setBounds(200, 240, 250, 30);

        phone = new JLabel("Phone No:");
        phone.setBounds(30, 280, 150, 30);

        ph = new JTextField();
        ph.setBounds(200, 280, 250, 30);

        submit = new JButton("Submit");
        submit.setBounds(20, 320, 110, 40);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                a1[0] = n.getText();
                a1[1] = e.getText();
                a1[2] = p.getText();
                a1[3] = cp.getText();
                a1[4] = count.getText();
                a1[5] = st.getText();
                a1[6] = ph.getText();
                /*for (int i = 0; i < 7; i++) {
                    System.out.println(a1[i]);
                }*/
                JOptionPane.showMessageDialog(null, "Data Saved Successfully");
            }
        });

        clear = new JButton("Clear");
        clear.setBounds(150, 320, 110, 40);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                n.setText("");
                e.setText("");
                p.setText("");
                cp.setText("");
                count.setText("");
                st.setText("");
                ph.setText("");
                JOptionPane.showMessageDialog(null, "All Values Removed");
            }
        });

        j.getContentPane()
                .add(title);
        j.getContentPane()
                .add(name);
        j.getContentPane()
                .add(n);
        j.getContentPane()
                .add(email);
        j.getContentPane()
                .add(e);
        j.getContentPane()
                .add(pass);
        j.getContentPane()
                .add(p);
        j.getContentPane()
                .add(cpass);
        j.getContentPane()
                .add(cp);
        j.getContentPane()
                .add(country);
        j.getContentPane()
                .add(count);
        j.getContentPane()
                .add(state);
        j.getContentPane()
                .add(st);
        j.getContentPane()
                .add(phone);
        j.getContentPane()
                .add(ph);
        j.getContentPane()
                .add(submit);
        j.getContentPane().add(clear);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        j.setSize(
                600, 700);
        j.setLayout(
                null);
        j.setResizable(
                false);
        j.setVisible(
                true);

    }

    public static void main(String[] args) {
        new Regis_Form();
    }
}
