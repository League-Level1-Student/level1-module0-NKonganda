package arraysPractice;

public class Arrays {
public void addingTo100() {
	final int arrayLength = 101;
	int sum = 0;
	int reverseArr[] = new int[arrayLength];
	int arr[] = new int[arrayLength];
	for (int i = 0; i < arrayLength; i++) {
		arr[i] = i;
		sum = arr[i] + sum;
		System.out.println(arr[i]);
	}
	for (int i = 0; i < arrayLength; i++) {
		reverseArr[i] = arr[100-i];
		System.out.println("reverseArr = " + reverseArr[i] + " arr = " + arr[i]);
	}
	System.out.println("Sum = " + sum);
}
}

