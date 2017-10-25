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
				
				// Branch hast-du-eine-Berufsausbildung
				input = scanner.nextLine();				
				if(input.equalsIgnoreCase("j")){
					System.out.println ("Hast du eine Berufsausbildung?");
						input = scanner.nextLine();
						if(input.equalsIgnoreCase("j")) {
							System.out.println ("Du kannst ja später noch studieren");
						}
						else if(input.equalsIgnoreCase("n")){
							System.out.println ("Besser noch studieren");
						}
				}
							
				// Branch nicht-studieren
				if (input.equalsIgnoreCase("n")) {
					System.out.println ("nicht studieren");
				}			
			}
				
			// Branch bist-duwissbegierig
			else if (input.equalsIgnoreCase("j")) {
				System.out.println ("Bist du wissbegierig?");
			}
	}
	
	
}