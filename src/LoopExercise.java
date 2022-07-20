import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LoopExercise {

	
	public static int findSum(List<Integer> userNumbers) {
		int sum = 0;
		for(int i = 0; i < userNumbers.size(); i++) {
			sum+=userNumbers.get(i);
		}
		return sum;
	}
	
	public static int max(List<Integer> userNumbers) {
		int max = userNumbers.get(0);
		for(int i = 0; i < userNumbers.size(); i++) {
			if (userNumbers.get(i) > max) {max = userNumbers.get(i);}
		}
		return max;
	}
	
	public static int min(List<Integer> userNumbers) {
		int min = userNumbers.get(0);
		for(int i = 0; i < userNumbers.size(); i++) {
			if (userNumbers.get(i) < min) {min = userNumbers.get(i);}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> userNumbers = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter a number:");
			userNumbers.add(i,Integer.parseInt(input.nextLine()));
		}
		
		System.out.println(findSum(userNumbers));
		System.out.println(max(userNumbers));
		System.out.println(min(userNumbers));
	}

}
