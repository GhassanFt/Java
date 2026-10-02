import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class App {
    
    public static void main(String[] args) throws Exception {
    SwingUtilities.invokeLater(() ->new App().createAndShowGUI());
    }

    private void createAndShowGUI(){
        JFrame frame = new JFrame("Bentuzerformular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel , BoxLayout.Y_AXIS));

        JTextField name = new JTextField();
        panel.add(new JLabel("Name"));
        panel.add(name);


        JButton abschicken = new JButton("Abschicken");

        //Textbereich
        JTextArea erginisse = new JTextArea();
        frame.add(panel,BorderLayout.NORTH);
        frame.add(erginisse,BorderLayout.CENTER);
        frame.add(abschicken, BorderLayout.SOUTH);

    }
}
