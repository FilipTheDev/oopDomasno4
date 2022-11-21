package Zadaca3;

public class Proizvod {
	private static String ime;
	private static Integer cena;
	private static String proizvoditel;
	private static Double tezina;
	

	public Proizvod() {
		ime = "Bitolsko mleko";
		cena = 85;
		proizvoditel = "BiMilk";
		tezina = 2.0;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		Proizvod.ime = ime;
	}

	public Integer getCena() {
		return cena;
	}

	public void setCena(Integer cena) {
		Proizvod.cena = cena;
	}

	public String getProizvoditel() {
		return proizvoditel;
	}

	public void setProizvoditel(String proizvoditel) {
		Proizvod.proizvoditel = proizvoditel;
	}

	public Double getTezina() {
		return tezina;
	}

	public void setTezina(Double tezina) {
		Proizvod.tezina = tezina;
	}
}
