package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String dog = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12234558/Chinook-On-White-03.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component dogImage;
		// 3. use the "createImage()" method below to initialize your Component
		dogImage = createImage(dog);
		// 4. add the image to the quiz window
		quizWindow.add(dogImage);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Do you like dogs?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equalsIgnoreCase("yes")) {
		System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
 		System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(dogImage);
		// 10. find another image and create it (might take more than one line
		// of code)
		String cat = "https://img.webmd.com/dtmcms/live/webmd/consumer_assets/site_images/article_thumbnails/other/cat_relaxing_on_patio_other/1800x1200_cat_relaxing_on_patio_other.jpg";
		Component catImage;
		catImage = createImage(cat);
		// 11. add the second image to the quiz window
		quizWindow.add(catImage);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("Do you like cats?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answer2.equalsIgnoreCase("yes")) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRRECT");
		}
	}

	private Component createImage(String imageUrl) {
		URL url = null;
		try {
			url = new URL(imageUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
