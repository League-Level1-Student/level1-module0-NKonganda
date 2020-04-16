package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot call = new Robot();
	Random moth = new Random();
	int height;
	public void run() {
		call.penDown();
		call.setSpeed(10);
		call.setX(50);
		call.setY(500);
		for (int i = 0; i < 10; i++) {
			height = moth.nextInt(3);
			if(height == 0) {
			drawhouse("small", Color.blue);
			}
			else if (height == 1) {
				drawhouse("medium", Color.cyan);
			}
			else if (height == 2) {
				drawhouse("large", Color.darkGray);
			}
		}
	}
	public void drawhouse(int height, Color color) {
		call.setPenColor(color);
		call.move(height);
		call.turn(90);
		call.move(15);
		call.turn(90);
		call.move(height);
		call.turn(-90);
		call.setPenColor(Color.GREEN);
		call.move(15);
		call.turn(-90);
	}
	public void drawhouse(String size, Color color) {
		if(size.equals("small")) {
		drawhouse(60, color);	
		}
		else if(size.equals("medium")) {
			drawhouse(120, color);
		}
		else if(size.equals("large")) {
			drawhouse(250, color);
		}
	}
}
