package src;
import java.util.UUID;

public class Table {
	
	private final String id;
	private int capacite;
	
	public Table(int capacite) {
		this.id = UUID.randomUUID().toString();
		this.capacite = capacite;
	}
	
	public int getCapacite() {
		return this.capacite;
	}

	public String toString() {
		return "Table : " + this.id + " ( " + this.capacite + " ) \n";
	}
}
