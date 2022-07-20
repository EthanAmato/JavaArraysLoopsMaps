import java.util.HashMap;
import java.util.Scanner;

public class MapExercise {

	public static void main(String[] args) {
		HashMap<String,String> carMap = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		carMap.put("Beatle","Volkswagen");
		carMap.put("Outback","Subaru");
		carMap.put("Civic","Honda");
		carMap.put("Model 3","Tesla");
		carMap.put("Jetta","Volkswagen");
		
		System.out.println("What type of car are you looking for today?");
		String desiredCar = input.nextLine();
		
		if (carMap.get(desiredCar) == null) {
			System.out.println("Unfortunately I don't believe we carry that model.");
			} else {
				System.out.printf("Oh you're looking for a %s?\nThat's wonderful our %s collection is over here", desiredCar,carMap.get(desiredCar));
			}
	}

}
