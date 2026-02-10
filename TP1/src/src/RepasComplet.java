package src;

public class RepasComplet implements Article{
	
	private String nom;
	private String entree;
	private String platPrincipal;
	private String dessert;
	
	private int prix;
	
	public RepasComplet(String nom, String entree, String platPrincipal, String dessert, int prix) {
		this.nom = nom;
		this.entree = entree;
		this.platPrincipal = platPrincipal;
		this.dessert = dessert;
		this.prix = prix;
	}
	public String toString() {
		return this.nom + " (" + this.entree + " - " + this.platPrincipal + " - " + this.dessert +") " + this.prix + "€ \n";
	}	
	
	public int getPrix() {
		return this.prix;
	}
}
