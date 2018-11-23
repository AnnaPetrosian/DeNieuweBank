package nl.anna.development;


public class BankApp {

	public static void main(String[] args) {
	
		
		Bank bank = new Bank();	
		bank.openen();
		System.out.println("Bank is geopend");
		Klant klant = new Klant();
		klant.naam = "Aram";
		klant.rekeningnummer= "987654321";
		bank.welkomHeten(klant);
		
		bank.openRekening();
		System.out.println("Wilt u bij ons rekening openen?");
		System.out.println("Ja graag");
		System.out.println(" Het is gelukt: U rekeningnummer is: " + klant.rekeningnummer);
		bank.geldStorten(0);
		System.out.println("Hoeveel euro wilt u op u bankrekening zetten?");
		int bedrag = 0;
		System.out.println("U saldo is " + klant.bedrag);
		
		

		bank.sluiten();
		System.out.println(" Het spijt me, maar het is al 17.00: de bank gaat sluiten");
		
		
		
	}

}
