package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

JFrame frameI = new JFrame();
JFrame frameII = new JFrame();
JLabel label = new JLabel();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField entryBar = new JTextField(20);
	
void convert() {
frameI.setVisible(true);
frameII.add(label);
frameII.setSize(1, 1);
frameI.add(panel);
button.setText("Convert!");
panel.add(button);
button.addActionListener(this);
panel.add(entryBar);
frameI.pack();
frameII.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	String entry = entryBar.getText();
	label.setText(convert(entry));
	frameI.setVisible(false);
	label.setText(convert(entryBar.getText()));
	frameII.setVisible(true);
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}

}
