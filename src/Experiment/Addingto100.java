package Experiment;

public class Addingto100 {
     int NumbersToSum = 4;
public void calculations() {
	//Initialize variables
	int sum = 0;
	int evenSum = 0;
	int oddSum = 0;
	
	//loop through the numbers for which the sum is being checked
	for (int i = 0; i <= NumbersToSum; i++) {
		sum = sum + i;
	
		// check if the number is even or odd
		if(checkEven(i) == true) {
			evenSum = evenSum + i;
		}
		else {
			oddSum = oddSum +i;
		}
	}
	System.out.println("Sum = " + sum);
	System.out.println("Even = " + evenSum);
	System.out.println("Odd = " + oddSum);
}
public boolean checkEven(int orNum) {
	int newNum = orNum/2;
	newNum = newNum*2;
	
	//returning odd or even number
	if(newNum == orNum) {
		return true;
	}
	else {
		return false;
	}
}
}
