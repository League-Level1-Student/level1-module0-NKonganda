package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffects implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Play Sound");
	public void showbutton() {
		 frame.setVisible(true);
		    frame.add(button);
		    button.addActionListener(this);
		    frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
