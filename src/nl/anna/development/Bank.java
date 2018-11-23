package nl.anna.development;

public class Bank {
	private boolean geopend;
	private Rekening rekening;
	private int saldo;
	private int balans;
	
	
	
	void welkomHeten(Klant klant){
		System.out.println("Welkom  " + klant.naam);
}
	
	
	 void openen() {
		geopend = true;
		

	}
	
	 void sluiten() {
		geopend = false;
	}

	
	 Rekening openRekening() {
		if (rekening!=null) {
			rekening = new Rekening();
		}
		return rekening;
	}


		void geldStorten( int bedrag) {
			 saldo += bedrag;
			 	 
		 }
		 void geldOpnemen(int bedrag) {
			 saldo-= bedrag;
		 }
		 void geldOvermaken(int bedrag, Rekening rekening) {
			 saldo-= bedrag;
			
			
		 }
	
		
	}
	

