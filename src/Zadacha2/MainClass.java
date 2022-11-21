package Zadacha2;

public class MainClass {
	public static void main(String[] args) {
		Restoran adriatik = new Restoran();
		adriatik.setRestoran("Adriatik");
		adriatik.setLokacija("Paca Mirceva");
		adriatik.setTelefon("047227510");
		adriatik.setBrNaSedista(175);
	System.out.println("Restoranot " + adriatik.getRestoran() + " se naogja na adresata " +
		adriatik.getLokacija() + ".\nBroj za rezervacija e " + adriatik.getTelefon() + " i ima "
		+ adriatik.getBrNaSedista() + " sedista. Bujrum");
	}
}
