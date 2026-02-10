package src;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reservation {
	private LocalTime heureArrivee;
	private Client client;
	private int nbPlacesReservee;
	private ArrayList<Article> articlesCommandes;
	
	public Reservation(LocalTime heureArrivee, Client client, int nbPlacesReservee) {
		this.heureArrivee = heureArrivee;
		this.client = client;
		this.nbPlacesReservee = nbPlacesReservee;
		articlesCommandes = new ArrayList<Article>();
	}
	
	public int montantFacture() {
		int somme = 0;
		for(Article a: articlesCommandes){
		  somme += a.getPrix();
		}
		return somme;
	}
	
	void addCommande(Article article) {
		articlesCommandes.add(article);
	}
	
	public void addCommande (Plat plat, int quantite) {
		for(int i = 0; i < quantite; i++) {
			articlesCommandes.add(plat);
		}
	}
	
	public String toString() {
		String desc = "Réservation de " + client + " (" + nbPlacesReservee + ", " + heureArrivee + ") \n";
		for(Article a: articlesCommandes) {
			desc += a;
		}
		desc += "Total : " + montantFacture() + "\n";
		return desc;
	}
	
}
