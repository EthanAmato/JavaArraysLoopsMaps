import java.util.Arrays;

public class ArrayExercise {

	public static int findSum(double[] intArray) {
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			sum+=intArray[i];
		}
		return sum;
	}
	
	private static int[] toPower(int size, int power) {
		int[] result = new int[size];
		
		for(int i = 0; i<size; i++) {
			result[i] = (int) Math.pow(i,power);
		}
		
		return result;
	}
	
	public static void weirdTTSScript(double[ ] exampleArray) {
		double maximum = exampleArray[0]; //also caused error because it was initially called 'examplesArray[0]' which doesn't exist

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++){ //initially caused error because of extra > sign

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index); //prints 2 after fixing the aforementioned errors (which is correct because 6 was the largest number)
	}

	
	
	public static void main(String[] args) {
		double[ ] exampleArray = {1,5,6,5,4,1};
		
		System.out.println(findSum(exampleArray)); //returns 22 (which is correct)
		
		weirdTTSScript(exampleArray); //after fixing the errors, it prints 2 - meaning that the index 
									  //of largest num in array is 6 (at index 2 of exampleArray) 
		int size = 4;
		int power = 2;
		System.out.println(Arrays.toString(toPower(size,power)));

		
	}


	
}