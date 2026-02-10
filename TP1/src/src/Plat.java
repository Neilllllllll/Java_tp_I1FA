package src;

public class Plat implements Article{
	private String nom;
	private int prix;
	
	public Plat(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public String toString() {
		return this.nom + " " + this.prix + "€ \n";
	}	
	
	public int getPrix() {
		return this.prix;
	}
}
