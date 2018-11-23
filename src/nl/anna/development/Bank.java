package nl.anna.development;

public class Bank {
	private boolean geopend;
	private Klant klant;
	
	void welkomHeten(Klant klant){
		this.klant = klant;
		System.out.println("Welkom  " + klant.naam);
	}
	
	 void openen() {
		geopend = true;
		System.out.println("Bank is geopend");
	}
	
	 void sluiten() {
		geopend = false;
	}

	
	 void openRekening(Klant klant) {
		System.out.println("Wilt u bij ons rekening openen?");
		System.out.println("Ja graag.");
		Rekening rekening = new Rekening("987654321", 500);
		klant.rekening = rekening;
		
		System.out.println(" Het is gelukt: U rekeningnummer is: " 
				+ rekening.rekeningnummer);
			
	}


		void geldStorten(Klant klant) {
			System.out.println("U stort nu 80 euro op uw bankrekening");
			klant.rekening.storten(80);

	
	
		
	}
	
}
