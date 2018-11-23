package nl.anna.development;

import java.util.Scanner;

public class GeldAutomaat {
	Scanner scanner= new Scanner(System.in);
	
	 public void transaction(Klant klant) {
		int choice;
	
		choice = scanner.nextInt();
		switch(choice) {
			case 1:
		int	bedrag;
		System.out.println("Hoeveel contant geld wilt u hebben.");
		bedrag = scanner.nextInt();
		if(bedrag> klant.rekening.balans) {
			System.out.println("U heeft onvoldoende saldo ");
			transaction(klant);
		}else {
			klant.rekening.balans = klant.rekening.balans - bedrag;
			System.out.println("Bedrag is " + klant.rekening.balans);
			
		}
		break;
			
			case 2:
				System.out.println("U balans is" +klant.rekening.balans);
				transaction(klant);
		break;
				
			default:
				System.out.println("Geen toegang");
				transaction(klant);
		break;		
}
}


}

 