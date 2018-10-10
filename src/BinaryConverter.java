/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	public static void main(String[] args) {
		new BinaryConverter().createUI();
	}

	JButton convertButton = new JButton();
	JTextField textField = new JTextField(20);
	JLabel output = new JLabel("Letter!!");
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		convertButton.setText("convert");
		// 4. Set the text of the rightButton to "Click me!"
		// 5. Add an action listener to the leftButton
		convertButton.addActionListener(this);

		panel.add(textField);
		panel.add(convertButton);
		panel.add(output);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Convert 8 bits of binary to ASCII");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		String letter = convert(textField.getText());
		output.setText(letter);
		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
	
	 String convert(String input) {
         if(input.length() != 8){
              JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
              return "-";
         }
         String binary = "[0-1]+";    //must contain numbers in the given range
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

