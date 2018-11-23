package nl.anna.development;

public class Rekening {
	String rekeningnummer;
	int balans;
	
	Rekening (String rekeningnummer, int balans) {
		this.rekeningnummer = rekeningnummer;
		this.balans = balans;
	}
	
	void storten (int bedrag) {
		balans += bedrag;
		System.out.println("Het saldo op uw rekening bedraagt   " + getSaldo()); 	 

	}

	int getSaldo() {

		return balans;
	}
}
