
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;
import logic.NameLogic;

public class ActionL implements ActionListener {

    private JTextField name1;
    private JTextField name2;
    private JTextField name3;
    private JTextField name4;
    private JTextField name5;
    private JButton button;
    private NameLogic nl;

    public ActionL(JTextField name1, JTextField name2, JTextField name3, JTextField name4, JTextField name5, JButton button, NameLogic nl) {

        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
        this.button = button;
        
        this.nl = nl;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == this.button) {
            ArrayList<String> names = nl.createNames();
            name1.setText(names.get(0));
            name2.setText(names.get(1));
            name3.setText(names.get(2));
            name4.setText(names.get(3));
            name5.setText(names.get(4));
        }
    }
}
