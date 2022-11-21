package Zadaca4;

public class Avtomobil {
	private String marka;
	private String model;
	private Integer pomKm;
	private String boja;
	
	public Avtomobil(String marka, String model, Integer pomKm, String boja) {
		this.marka = marka;
		this.model = model;
		this.pomKm = pomKm;
		this.boja = boja;
	}
	public Integer metod(Integer pomnoziKm) {
		Integer proizvodKm = pomKm * pomnoziKm;
		return proizvodKm;
	}
	
}
