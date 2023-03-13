

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.TreeMap;
import javax.swing.*;

public class OSPROJECT extends javax.swing.JFrame {

    
    // Creates new form OSPROJECT
    public OSPROJECT() {
        initComponents();
    }
                      
    private void initComponents() {

        options = new javax.swing.JComboBox<>();
        arrival = new javax.swing.JTextField();
        burst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        solve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1. FCFS", "2. SJF(NON PRE EMPTIVE)", "3. SJF (PRE EMPTIVE)"}));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        arrival.setText("eg 0 2 4 6 8");

        burst.setText("eg 0 2 4 6 8");

        jLabel1.setText("Algorithm");

        jLabel2.setText("Burst times");

        jLabel3.setText("Arrival Times");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18));
        jLabel4.setText("INPUT");

        solve.setBackground(new java.awt.Color(0, 0, 204));
        solve.setForeground(new java.awt.Color(255, 255, 255));
        solve.setText("Solve");
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(52, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(burst, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(solve))
                                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(burst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(solve)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }                    

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {
        //fcfs
        switch (options.getSelectedIndex()) {
            case 0: {
                ArrayList<Integer> at = new ArrayList<>();
                ArrayList<Integer> bt = new ArrayList<>();
                String a = arrival.getText();
                String b = burst.getText();
                int sp1 = 0, sp2;
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) == ' ') {
                        sp2 = i;
                        at.add(Integer.parseInt(a.substring(sp1, sp2)));
                        sp1 = sp2 + 1;
                    }
                }
                at.add(Integer.parseInt(a.substring(sp1, a.length())));
                sp1 = 0;
                for (int i = 0; i < b.length(); i++) {
                    if (b.charAt(i) == ' ') {
                        sp2 = i;
                        bt.add(Integer.parseInt(b.substring(sp1, sp2)));
                        sp1 = sp2 + 1;
                    }
                }
                bt.add(Integer.parseInt(b.substring(sp1, b.length())));
                JFrame f = new JFrame();
                f.setSize(550, 350);
                f.setVisible(true);
                String[] colname = {"Process Name", "Arrival time", "Burst Time", "Finish Time", "Turn Around Time", "Waiting Time"};
                String[][] data = new String[at.size() + 1][6];
                // fcfs algorithm
                // assuming the user has input the arrival times in sorted manner

                // finding complete time
                ArrayList<Integer> ct = new ArrayList<>();
                for (int i = 0; i < bt.size(); i++) {
                    if (i == 0) {
                        ct.add(at.get(i) + bt.get(i));
                    } else {
                        ct.add(ct.get(i - 1) + bt.get(i));
                    }
                }

                // finding turn around time
                ArrayList<Integer> tat = new ArrayList<>();
                double total_tat = 0;
                for (int i = 0; i < bt.size(); i++) {
                    tat.add(ct.get(i) - at.get(i));
                    total_tat += tat.get(i);
                }

                // finding waiting time
                ArrayList<Integer> wt = new ArrayList<>();
                double total_wt = 0;
                for (int i = 0; i < bt.size(); i++) {
                    wt.add(tat.get(i) - bt.get(i));
                    total_wt += wt.get(i);
                }

                // Preparing Gantt Chart
                int j = 0;
                char x = 'A';
                int i;
                JLabel jl = new JLabel("Gantt Chart");
                f.setLayout(new GridLayout(2, 1));
                JPanel jp = new JPanel();
                jp.setLayout(null);
                jl.setBounds(220, 60, 100, 30);
                JTextField jtf = new JTextField();
                jtf.setBounds(200, 100, ct.size() * 30, 25);
                int c = 26;
                JLabel temp1 = new JLabel("0");
                temp1.setBounds(200, 126, 15, 25);
                jp.add(temp1);
                for (i = 0; i < ct.size(); i++) {
                    String s = jtf.getText();
                    jtf.setText(s + "|   " + Character.toString(x) + "   ");
                    JLabel temp = new JLabel(Integer.toString(ct.get(i)));
                    temp.setBounds(200 + c, 126, 15, 25);
                    jp.add(temp);
                    x++;
                    c += 26;
                }
                jp.add(jl);
                jp.add(jtf);
                f.add(jp);

                // preparing table for output
                x = 'A';
                for (i = 0; i < bt.size(); i++) {
                    String[] newRow = {Character.toString(x), at.get(j).toString(), bt.get(j).toString(), ct.get(j).toString(), tat.get(j).toString(), wt.get(j).toString()};
                    data[i] = newRow;
                    j++;
                    x++;
                }
                String[] newRow = {"", "", "", "Average", Double.toString(total_tat) + "/" + Integer.toString(bt.size()) + "=" + Double.toString(total_tat / bt.size()), Double.toString(total_wt) + "/" + Integer.toString(bt.size()) + "=" + Double.toString(total_wt / bt.size())};
                data[i] = newRow;
                DefaultTableModel model = new DefaultTableModel(data, colname);
                JTable jt = new JTable(model);
                f.add(new JScrollPane(jt));
                f.validate();

                break;
            }
            case 1: {
                // Getting values from text boxes
                TreeMap<Integer, Character> bt = new TreeMap<>();
                String b = burst.getText();
                char x = 'A';
                int sp1 = 0, sp2;

                for (int i = 0; i < b.length(); i++) {
                    if (b.charAt(i) == ' ') {
                        sp2 = i;
                        bt.put(Integer.parseInt(b.substring(sp1, sp2)), x);
                        x++;
                        sp1 = sp2 + 1;
                    }
                }
                bt.put(Integer.parseInt(b.substring(sp1, b.length())), x);

                // creating frame
                JFrame f = new JFrame();
                f.setSize(550, 350);
                f.setVisible(true);
                String[] colname = {"Process Name", "Arrival time", "Burst Time", "Finish Time", "Turn Around Time", "Waiting Time"};
                String[][] data = new String[bt.size() + 1][6];

                // sjf non pre emptive algorithm
                // getting finish times
                ArrayList<Integer> ft = new ArrayList<>();
                ArrayList<Integer> btset = new ArrayList<>(bt.keySet());
                for (int i = 0; i < btset.size(); i++) {
                    if (i == 0) {
                        ft.add(btset.get(i));
                    } else {
                        ft.add(ft.get(i - 1) + btset.get(i));
                    }
                }

                // getting turn around time
                ArrayList<Integer> tat = new ArrayList<>();
                double total_tat = 0;
                for (int i = 0; i < btset.size(); i++) {
                    tat.add(ft.get(i));
                    total_tat += tat.get(i);
                }

                // getting waiting time
                ArrayList<Integer> wt = new ArrayList<>();
                double total_wt = 0;
                for (int i = 0; i < btset.size(); i++) {
                    wt.add(tat.get(i) - btset.get(i));
                    total_wt += wt.get(i);
                }

                // forming gantt chart
                int i;
                JLabel jl = new JLabel("Gantt Chart");
                f.setLayout(new GridLayout(2, 1));
                JPanel jp = new JPanel();
                jp.setLayout(null);
                jl.setBounds(220, 60, 100, 30);
                JTextField jtf = new JTextField();
                jtf.setBounds(200, 100, btset.size() * 30, 25);
                int c = 26;
                JLabel temp1 = new JLabel("0");
                temp1.setBounds(200, 126, 15, 25);
                jp.add(temp1);
                for (i = 0; i < btset.size(); i++) {
                    String s = jtf.getText();
                    jtf.setText(s + "|   " + Character.toString(bt.get(btset.get(i))) + "   ");
                    JLabel temp = new JLabel(Integer.toString(ft.get(i)));
                    temp.setBounds(200 + c, 126, 15, 25);
                    jp.add(temp);
                    c += 26;
                }
                jp.add(jl);
                jp.add(jtf);
                f.add(jp);

                // forming table
                int j = 0;
                for (i = 0; i < bt.size(); i++) {
                    String[] newRow = {Character.toString(bt.get(btset.get(j))), "0", btset.get(j).toString(), ft.get(j).toString(), tat.get(j).toString(), wt.get(j).toString()};
                    data[i] = newRow;
                    j++;
                    x++;
                }
                String[] newRow = {"", "", "", "Average", Double.toString(total_tat) + "/" + Integer.toString(btset.size()) + "=" + Double.toString(total_tat / btset.size()), Double.toString(total_wt) + "/" + Integer.toString(btset.size()) + "=" + Double.toString(total_wt / btset.size())};
                data[i] = newRow;
                DefaultTableModel model = new DefaultTableModel(data, colname);
                JTable jt = new JTable(model);
                f.add(new JScrollPane(jt));
                f.validate();

            }
            break;
            case 2: {
                ArrayList<Integer> at = new ArrayList<>();
                ArrayList<Integer> bt = new ArrayList<>();
                String a = arrival.getText();
                String b = burst.getText();
                int sp1 = 0, sp2;
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) == ' ') {
                        sp2 = i;
                        at.add(Integer.parseInt(a.substring(sp1, sp2)));
                        sp1 = sp2 + 1;
                    }
                }
                at.add(Integer.parseInt(a.substring(sp1, a.length())));
                sp1 = 0;
                for (int i = 0; i < b.length(); i++) {
                    if (b.charAt(i) == ' ') {
                        sp2 = i;
                        bt.add(Integer.parseInt(b.substring(sp1, sp2)));
                        sp1 = sp2 + 1;
                    }
                }
                bt.add(Integer.parseInt(b.substring(sp1, b.length())));

                int proc[][] = new int[bt.size()][5];
                for (int i = 0; i < bt.size(); i++) {
                    proc[i][0] = at.get(i);
                    proc[i][1] = bt.get(i);
                }
                int n = bt.size();
                int total_time = 0;
                String s = new String();
                for (int i = 0; i < n; i++) {
                    total_time += proc[i][1];
                }
                int time_chart[] = new int[total_time];

                for (int i = 0; i < total_time; i++) {
                    //Selection of shortest process which has arrived
                    int sel_proc = 0;
                    int min = 99999;
                    for (int j = 0; j < n; j++) {
                        if (proc[j][0] <= i)//Condition to check if Process has arrived
                        {
                            if (proc[j][1] < min && proc[j][1] != 0) {
                                min = proc[j][1];
                                sel_proc = j;
                            }
                        }
                    }

                    //Assign selected process to current time in the Chart
                    time_chart[i] = sel_proc;

                    //Decrement Remaining Time of selected process by 1 since it has been assigned the CPU for 1 unit of time
                    proc[sel_proc][1]--;

                    //WT and TT Calculation
                    for (int j = 0; j < n; j++) {
                        if (proc[j][0] <= i) {
                            if (proc[j][1] != 0) {
                                proc[j][3]++;//If process has arrived and it has not already completed execution its TT is incremented by 1
                                if (j != sel_proc)//If the process has not been currently assigned the CPU and has arrived its WT is incremented by 1
                                {
                                    proc[j][2]++;
                                }
                            } else if (j == sel_proc)//This is a special case in which the process has been assigned CPU and has completed its execution
                            {
                                proc[j][3]++;
                            }
                        }
                    }

                    //Printing the Time Chart
                    if (i != 0) {
                        if (sel_proc != time_chart[i - 1]) //If the CPU has been assigned to a different Process we need to print the current value of time and the name of 
                        //the new Process
                        {
                            String temp = s;
                            s = temp + "--" + i + "--P" + sel_proc;
                        }
                    } else//If the current time is 0 i.e the printing has just started we need to print the name of the First selected Process
                    {
                        String temp = s;
                        s = temp + i + "--P" + sel_proc;
                    }
                    if (i == total_time - 1)//All the process names have been printed now we have to print the time at which execution ends
                    {
                        String temp = s;
                        s = temp + "--" + (i + 1);
                    }
                }
                double total_wt = 0, total_tat = 0;
                for (int i = 0; i < n; i++) {
                    total_wt += proc[i][2];
                    total_tat += proc[i][3];
                }
                total_wt /= n;
                total_tat /= n;
                JPanel jp = new JPanel();
                JTextField jtf = new JTextField(s);
                JLabel jl = new JLabel("Gantt Chart");
                jl.setBounds(220, 60, 100, 30);
                jtf.setBounds(200, 100, 300, 25);
                jp.add(jl);
                jp.add(jtf);
                JFrame f = new JFrame();
                f.setSize(550, 350);
                f.setVisible(true);
                f.setLayout(new GridLayout(2, 1));
                f.add(jp);
                String[] colname = {"Process Name", "Arrival time", "Burst Time", "Finish Time", "Turn Around Time", "Waiting Time"};
                String[][] data = new String[bt.size() + 1][6];
                int i;
                for (i = 0; i < bt.size(); i++) {
                    String[] newRow = {Integer.toString(i), at.get(i).toString(), bt.get(i).toString(), " ", Integer.toString(proc[i][3]), Integer.toString(proc[i][2])};
                    data[i] = newRow;
                }

                String[] newRow = {"", "", "", "Average", Double.toString(total_tat) + "/" + Integer.toString(bt.size()) + "=" + Double.toString(total_tat / bt.size()), Double.toString(total_wt) + "/" + Integer.toString(bt.size()) + "=" + Double.toString(total_wt / bt.size())};
                data[i] = newRow;
                DefaultTableModel model = new DefaultTableModel(data, colname);
                JTable jt = new JTable(model);
                f.add(new JScrollPane(jt));
                f.validate();

            }
            default:

        }
    }

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {
        if (options.getSelectedIndex() == 1) {
            arrival.setText("Arrival Time not Required");
        } else {
            arrival.setText("eg 0 2 4 6 8");
        }
    }

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OSPROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OSPROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OSPROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OSPROJECT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OSPROJECT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField arrival;
    private javax.swing.JTextField burst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JButton solve;
    // End of variables declaration                   
}
