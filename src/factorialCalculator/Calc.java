package factorialCalculator;

import javax.swing.JOptionPane;

public class Calc {
	String enterValue;
	String sNum;
public void calculations() {
	int product = 1;
	enterValue = "Enter Factorial Value";
	sNum = JOptionPane.showInputDialog(enterValue);
	int num = 0;
	
	//Check if num is a positive integer
	try {
	num = Integer.parseInt(sNum);
	}
	
	//Handle the error of invalid input
	catch (NumberFormatException e) {
		System.out.println("Error");
		JOptionPane.showMessageDialog(null, "Please enter a postive integer");
		enterValue = "Enter Factorial Value";
		sNum = JOptionPane.showInputDialog(enterValue);
		return;
	}
	//Check if num is positive
	if(num <= 0) {
		JOptionPane.showMessageDialog(null, "Please enter positive number");
		enterValue = "Enter Factorial Value";
		sNum = JOptionPane.showInputDialog(enterValue);
		return;
	}
	
	//Calculate the factorial
	for (int i = 1; i < num+1; i++) {
		product = product * i;
	}
	
	//Showing results
	JOptionPane.showMessageDialog(null, num + "! = " + product);
}
}
