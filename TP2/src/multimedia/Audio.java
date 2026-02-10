package multimedia;

import src.Epoque;

public class Audio extends Media{
	private String audio;
	private String interprete;
	
	public Audio(String titre, int anneePublic, double valeur, Epoque epoque, String format, int duree, String audio, String interprete) {
		super(titre, anneePublic, valeur, epoque, format, duree);
		this.audio = audio;
		this.interprete = interprete;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	
}