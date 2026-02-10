package src;

public class Document {
	private String titre;
	private int anneePublic;
	private double valeur;
	private Epoque epoque;
	
	public Document(String titre, int anneePublic, double valeur, Epoque epoque) {
		this.titre = titre;
		this.anneePublic = anneePublic;
		this.valeur = valeur;
		this.epoque = epoque;
	}

	public Epoque getEpoque() {
		return epoque;
	}
	public void setEpoque(Epoque epoque) {
		this.epoque = epoque;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getAnneePublic() {
		return anneePublic;
	}
	public void setAnneePublic(int anneePublic) {
		this.anneePublic = anneePublic;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
}
