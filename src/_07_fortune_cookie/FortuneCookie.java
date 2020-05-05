package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	 JButton button = new JButton();
        public void showButton() {
        	  frame.setVisible(true);
      	    frame.add(button);
      	    button.addActionListener(this);
    	    frame.pack();
            System.out.println("Button clicked");
            int rand = new Random().nextInt(5);
            if(rand == 0) {
            	JOptionPane.showMessageDialog(null, "You will be famous");
            }
            	else if(rand == 1) {
            	JOptionPane.showMessageDialog(null, "You will be rich");
            	}
            	else if(rand == 2) {
            	JOptionPane.showMessageDialog(null, "You will live above 90");
            	}
            	else if(rand == 3) {
            	JOptionPane.showMessageDialog(null, "You will have 3 kids");
            	}
            	else if(rand == 4) {
            	JOptionPane.showMessageDialog(null, "You will have 9 grandchildren");
            	}
            	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Woohoo");
		}
}
