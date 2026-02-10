package multimedia;

import src.Epoque;

public class Video extends Media{
	private String realisateur;
	private String acteur;
	
	public Video(String titre, int anneePublic, double valeur, Epoque epoque, String format, int duree, String realisateur, String acteur) {
		super(titre, anneePublic, valeur, epoque, format, duree);
		this.realisateur = realisateur;
		this.acteur = acteur;
	}
	
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getActeur() {
		return acteur;
	}
	public void setActeur(String acteur) {
		this.acteur = acteur;
	}
	
}
