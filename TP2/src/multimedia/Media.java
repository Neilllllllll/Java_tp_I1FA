package multimedia;

import src.Document;
import src.Epoque;

public class Media extends Document{
	private String format;
	private int duree;
	
	public Media(String titre, int anneePublic, double valeur, Epoque epoque, String format, int duree) {
		super(titre, anneePublic, valeur, epoque);
		this.format = format;
		this.duree = duree;
	}
	
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
}