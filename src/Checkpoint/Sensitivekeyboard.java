package Checkpoint;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Sensitivekeyboard implements KeyListener {
	JFrame frame = new JFrame();
	public void speakingKey() {
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	static void speak(String words) {
	     try {
	    	 System.out.println(words);
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak("ouch");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
