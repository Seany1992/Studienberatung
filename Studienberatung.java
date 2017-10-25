import java.util.*;

public class Studienberatung {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean ready = true;
		 
		
			System.out.println("Hast du Abitur?");
	
			System.out.println("n oder j:");
			String input = scanner.nextLine();
			
			// Branch hast du fachabitur
			if (input.equalsIgnoreCase("n")) {
				System.out.println ("Hast du Fachabitur?");
			}
				
			// Branch bist-duwissbegierig
			else if (input.equalsIgnoreCase("j")) {
				System.out.println ("Bist du wissbegierig?");
			}
	}
	
	
}