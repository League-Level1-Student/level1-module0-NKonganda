package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Play Sound drum");
	JButton button2 = new JButton("Play Sound cymbal");
	JButton button3 = new JButton("Play Sound Snare");
	public void showbutton() {
		 frame.setVisible(true);
		    frame.add(panel);
		    button1.addActionListener(this);
		    button2.addActionListener(this);
		    button3.addActionListener(this);
		    button1.setText("cymbal");
		    button2.setText("drum");
		    button3.setText("snare");
		    panel.add(button1);
		    panel.add(button2);
		    panel.add(button3);
		    frame.pack();
		    frame.setTitle("Sound Effect Buttons");
	}
	private void playSound(String fileName) {
		System.out.println(fileName);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button1) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		else if(buttonPressed == button2) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		else if(buttonPressed == button3) {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
