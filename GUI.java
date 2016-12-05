
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import logic.NameLogic;

public class GUI implements Runnable {

    private JFrame frame;
    private NameLogic nl;
    private ArrayList<String> names;

    public GUI() {

        this.nl = new NameLogic();
        this.names = nl.createNames();
    }

    @Override
    public void run() {

        this.frame = new JFrame("Names");
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        components(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void components(Container container) {

        GridLayout layout = new GridLayout(7, 0);
        container.setLayout(layout);
        
        JTextField name1 = new JTextField(this.names.get(0));
        JTextField name2 = new JTextField(this.names.get(1));
        JTextField name3 = new JTextField(this.names.get(2));
        JTextField name4 = new JTextField(this.names.get(3));
        JTextField name5 = new JTextField(this.names.get(4));
        
        name1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        name2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        name3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        name4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        name5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        
        name1.setEditable(false);
        name2.setEditable(false);
        name3.setEditable(false);
        name4.setEditable(false);
        name5.setEditable(false);
        
        JButton button = new JButton("Generate new names");
        
        container.add(name1);
        container.add(name2);
        container.add(name3);
        container.add(name4);
        container.add(name5);
        container.add(button);
        
        container.add(jpanel(name1, name2, name3, name4, name5, button));
        
    }
    
    public JPanel jpanel(JTextField name1, JTextField name2, JTextField name3, JTextField name4, JTextField name5, JButton button) {
        
        JPanel jpanel = new JPanel();
        
        ActionL al = new ActionL(name1, name2, name3, name4, name5, button, this.nl);
        name1.addActionListener(al);
        name2.addActionListener(al);
        name3.addActionListener(al);
        name4.addActionListener(al);
        name5.addActionListener(al);
        button.addActionListener(al);
        
        return jpanel;
    }
}
