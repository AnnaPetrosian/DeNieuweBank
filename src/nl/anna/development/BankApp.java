package nl.anna.development;


public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank();	
		bank.openen();
		Klant klant = new Klant("Aram");
		bank.welkomHeten(klant);
		
		bank.openRekening(klant);
		
		bank.geldStorten(klant);

		bank.sluiten();
		
		System.out.println(" Het spijt me, maar het is al 17.00: de bank gaat sluiten.");
		System.out.println("Als u geld wil ophalen: buiten hebben we Geldautomaat. ");
		System.out.println("Welkom bij Geldautamaat.");
		System.out.println("Wilt u alstublieft een optie kiezen: 1: voor Geld opnemen, 2: voor Balans.");
		
		GeldAutomaat ga = new GeldAutomaat();
		ga.transaction(klant);

	}	
}
