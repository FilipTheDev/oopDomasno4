package Zadaca3;

public class MainClass {
	public static void main(String[] args) {
		Proizvod pepsi = new Proizvod();
		pepsi.setIme("Pepsi");
		pepsi.setCena(65);
		pepsi.setProizvoditel("Pepsi");
		pepsi.setTezina(1.75);
		
		System.out.println("Ime: " + pepsi.getIme() + "\nCena: " + pepsi.getCena() +
		"\nProizvoditel: " + pepsi.getProizvoditel() + "\nTezina: " + pepsi.getTezina());
	}
}
