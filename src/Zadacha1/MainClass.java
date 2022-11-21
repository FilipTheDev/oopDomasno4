package Zadacha1;

public class MainClass {
	public static void main(String[] args) {
		Covek ft = new Covek();
		ft.setIme("Filip");
		ft.setPrezime("Tomevski");
		ft.setMatBroj("12341349294123");
		System.out.println("Ime: " + ft.getIme() + "\nPrezime: " + ft.getPrezime() + "\nMaticen broj: " + ft.getMatBroj());
	}
}
