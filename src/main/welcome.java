package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class welcome extends JFrame implements ActionListener {

    static JLabel label_result = new JLabel();

    JButton start = new JButton("START");
    JLabel welcome = new JLabel();
    JLabel und = new JLabel();
    JFrame con_info = new JFrame();
    JFrame Palestine = new JFrame();
    JFrame Egypt = new JFrame();
    JFrame Jordan = new JFrame();
    JFrame Lebnan = new JFrame();
    JFrame Syria = new JFrame();

    welcome() {

        this.setBounds(50, 50, 400, 300);
        this.setTitle("Welcome");
        Container s = getContentPane();
        s.setLayout(null);
        Font username = new Font("Arial", Font.BOLD, 20);

        welcome.setText("Welcome Mahmoud");
        welcome.setForeground(Color.RED);
        welcome.setFont(username);
        welcome.setBounds(100, 50, 200, 100);

        und.setText("------------------------------------------------------------");
        und.setForeground(Color.BLUE);
        und.setBounds(70, 70, 300, 100);

        start.setBounds(115, 170, 150, 30);
        start.addActionListener(this);

        s.add(welcome);
        s.add(und);
        s.add(start);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

    public void palestine() {

        Palestine.setBounds(100, 100, 350, 300);
        Palestine.setTitle("Palestine");
        Container s = getContentPane();
        s.setLayout(null);

        JLabel flag = new JLabel();
        flag.setIcon(new ImageIcon("palestine.png"));

        JLabel name = new JLabel("Country name: Palestine");
        JLabel cur_pris = new JLabel("Current President: Yasser Arafat");
        JLabel capital = new JLabel("The capital is Jerusalem");
        JLabel location = new JLabel("It is located in southwest Asia");

        flag.setBounds(80, 0, 250, 100);
        name.setBounds(90, 80, 150, 100);
        cur_pris.setBounds(90, 110, 200, 100);
        capital.setBounds(90, 140, 150, 100);
        location.setBounds(90, 170, 170, 100);

        Palestine.add(flag);
        Palestine.add(name);
        Palestine.add(cur_pris);
        Palestine.add(capital);
        Palestine.add(location);
        Palestine.add(label_result);
        Palestine.setVisible(false);
        Palestine.setVisible(true);

    }

    public void Egypt() {

        Egypt.setBounds(100, 100, 350, 300);
        Egypt.setTitle("Egypt");
        Container s = getContentPane();
        s.setLayout(null);

        JLabel flag = new JLabel();
        flag.setIcon(new ImageIcon("egypt.jpg"));

        JLabel name = new JLabel("Country name: Egypt");
        JLabel cur_pris = new JLabel("Current President: Abdel Fattah Sisi");
        JLabel capital = new JLabel("The capital is Cairo");
        JLabel location = new JLabel("It is located in northeast Africa");

        flag.setBounds(110, 0, 250, 100);
        name.setBounds(80, 80, 150, 100);
        cur_pris.setBounds(80, 110, 230, 100);
        capital.setBounds(80, 140, 150, 100);
        location.setBounds(80, 170, 230, 100);

        Egypt.add(flag);
        Egypt.add(name);
        Egypt.add(cur_pris);
        Egypt.add(capital);
        Egypt.add(location);
        Egypt.add(label_result);
        Egypt.setVisible(false);
        Egypt.setVisible(true);

    }

    public void Jordan() {

        Jordan.setBounds(100, 100, 350, 300);
        Jordan.setTitle("Jordan");
        Container s = getContentPane();
        s.setLayout(null);

        JLabel flag = new JLabel();
        flag.setIcon(new ImageIcon("jordan.png"));

        JLabel name = new JLabel("Country name: Jordan");
        JLabel cur_pris = new JLabel("Current President: Abdullah bin Hussein");
        JLabel capital = new JLabel("The capital is Amman");
        JLabel location = new JLabel("It is located in southwest Asia");

        flag.setBounds(110, 0, 250, 100);
        name.setBounds(80, 80, 150, 100);
        cur_pris.setBounds(80, 110, 230, 100);
        capital.setBounds(80, 140, 150, 100);
        location.setBounds(80, 170, 170, 100);

        Jordan.add(flag);
        Jordan.add(name);
        Jordan.add(cur_pris);
        Jordan.add(capital);
        Jordan.add(location);
        Jordan.add(label_result);
        Jordan.setVisible(false);
        Jordan.setVisible(true);

    }

    public void Lebnan() {

        Lebnan.setBounds(100, 100, 350, 300);
        Lebnan.setTitle("Lebnan");
        Container s = getContentPane();
        s.setLayout(null);

        JLabel flag = new JLabel();
        flag.setIcon(new ImageIcon("lebnan.png"));

        JLabel name = new JLabel("Country name: Lebnan");
        JLabel cur_pris = new JLabel("Current President: Michel Aoun");
        JLabel capital = new JLabel("The capital is Beirut");
        JLabel location = new JLabel("It is located in west Asia");

        flag.setBounds(110, 0, 250, 100);
        name.setBounds(90, 80, 150, 100);
        cur_pris.setBounds(90, 110, 200, 100);
        capital.setBounds(90, 140, 150, 100);
        location.setBounds(90, 170, 170, 100);

        Lebnan.add(flag);
        Lebnan.add(name);
        Lebnan.add(cur_pris);
        Lebnan.add(capital);
        Lebnan.add(location);
        Lebnan.add(label_result);
        Lebnan.setVisible(false);
        Lebnan.setVisible(true);

    }

    public void Syria() {

        Syria.setBounds(100, 100, 350, 300);
        Syria.setTitle("Syria");
        Container s = getContentPane();
        s.setLayout(null);

        JLabel flag = new JLabel();
        flag.setIcon(new ImageIcon("syria.png"));

        JLabel name = new JLabel("Country name: Syria");
        JLabel cur_pris = new JLabel("Current President: Bashar al-Assad");
        JLabel capital = new JLabel("The capital is Damascus");
        JLabel location = new JLabel("It is located in west Asia");

        flag.setBounds(100, 0, 250, 100);
        name.setBounds(80, 80, 150, 100);
        cur_pris.setBounds(80, 110, 250, 100);
        capital.setBounds(80, 140, 150, 100);
        location.setBounds(80, 170, 170, 100);

        Syria.add(flag);
        Syria.add(name);
        Syria.add(cur_pris);
        Syria.add(capital);
        Syria.add(location);
        Syria.add(label_result);
        Syria.setVisible(false);
        Syria.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {

            String country = JOptionPane.showInputDialog("Enter name of the country");
            switch (country) {

                case "Palestine":
                    palestine();
                    break;
                case "Egypt":
                    Egypt();
                    break;
                case "Lebnan":
                    Lebnan();
                    break;
                case "Jordan":
                    Jordan();
                    break;
                case "Syria":
                    Syria();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Country not found");
            }
        }
    }

}
