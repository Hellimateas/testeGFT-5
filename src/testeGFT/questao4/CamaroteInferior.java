package testeGFT.questao4;

public class CamaroteInferior extends VIP{
	private int localizacaoIngressoLatitude;
	private int localizacaoIngressoLongitude;
	
	public void acessarLocalizacao(int latitude, int longitude) {
		this.localizacaoIngressoLatitude = latitude;
		this.localizacaoIngressoLongitude = longitude;
	}
	public String imprimirLocalizacao() {
		return "latitude: " + localizacaoIngressoLatitude + "\nlongitude: " + localizacaoIngressoLongitude;
	}
}
