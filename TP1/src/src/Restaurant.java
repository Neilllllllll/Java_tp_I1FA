package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalTime;

public class Restaurant {
	private ArrayList<Table> tables;
	private HashMap<Table, Reservation> tablesReservees;
	
	public Restaurant() {
		tables = new ArrayList<Table>();
		tablesReservees = new HashMap<Table, Reservation>();
	}
	
	public void addTable(int capacite) {
		tables.add(new Table(capacite));
	}
	
	public boolean tableEstReservee(Table table) {
		if(tablesReservees.get(table) != null) {
			return true;
		}
		return false;
	}
	
	private Table chercherTableCapaciteSuffisante (int nombrePersonnes) {
		Table min_table = null;
		for(Table table: tables) {
			// Cas où la table est libre et à une capacité suffisante
			if(table.getCapacite() >= nombrePersonnes && !tableEstReservee(table)) {
				// Cas où la table à une capacité plus petite que la précédente
				if(min_table == null || table.getCapacite() < min_table.getCapacite()) {
					min_table = table;
				}
			}
		}
		return min_table;
	}
	
	public Table reserver(Client client, int nombrePlaces, LocalTime heureArrivee) {
		Table table = chercherTableCapaciteSuffisante (nombrePlaces);
		if(table != null) {
			Reservation reservation = new Reservation(heureArrivee, client, nombrePlaces);
			tablesReservees.put(table, reservation);
		}
		return table;
	}
	
	public void addCommande(Article article, Table table) {
		if(tablesReservees.get(table) != null) {
			tablesReservees.get(table).addCommande(article);
		}
		else {
			System.out.println("La table n'existe pas");
		}
	}
	
	public void addCommande (Plat plat, int quantite, Table table) {
		if(tablesReservees.get(table) != null) {
			tablesReservees.get(table).addCommande (plat, quantite);
		}
		else {
			System.out.println("La table n'existe pas");
		}
	}
	
	public String toString() {
		String description = "";
		for(Table t: tables) {
			description += t;
			if(tableEstReservee(t)) {
				description += tablesReservees.get(t);
			}
			else {
				description += "vide";
			}
		}
		return description;
	}
}
