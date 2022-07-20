import java.util.Scanner;
public class LoopExercise {

	
	public static int findSum(int[] intArray) {
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			sum+=intArray[i];
		}
		return sum;
	}
	
	public static int max(int[] intArray) {
		int max = intArray[0];
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max) {max = intArray[i];}
		}
		return max;
	}
	
	public static int min(int[] intArray) {
		int min = intArray[0];
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] < min) {min = intArray[i];}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] userNumbers = new int[5];
		
		for(int i = 0; i < userNumbers.length; i++) {
			System.out.println("Please enter a number:");
			userNumbers[i] = Integer.parseInt(input.nextLine());
		}
		
		System.out.println(findSum(userNumbers));
		System.out.println(max(userNumbers));
		System.out.println(min(userNumbers));
	}

}
