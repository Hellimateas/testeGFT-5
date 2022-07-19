package testeGFT.questao2.raca;

public class Humano extends Raca{
	@Override
	public void setCarisma(int carisma) {
		// TODO Auto-generated method stub
		super.setCarisma(carisma + 1);
	}
	
	@Override
	public void setConstituicao(int constituicao) {
		// TODO Auto-generated method stub
		super.setConstituicao(constituicao + 1);
	}
	
	@Override
	public void setDestreza(int destreza) {
		// TODO Auto-generated method stub
		super.setDestreza(destreza + 1);
	}
	@Override
	public void setForca(int forca) {
		// TODO Auto-generated method stub
		super.setForca(forca + 1);
	}
	@Override
	public void setInteligencia(int inteligencia) {
		// TODO Auto-generated method stub
		super.setInteligencia(inteligencia +1);
	}
	@Override
	public void setSabedoria(int sabedoria) {
		// TODO Auto-generated method stub
		super.setSabedoria(sabedoria + 1);
	}

	@Override
	public String toString() {
		return "Humano [getForca()=" + getForca() + ", getDestreza()=" + getDestreza() + ", getConstituicao()="
				+ getConstituicao() + ", getInteligencia()=" + getInteligencia() + ", getSabedoria()=" + getSabedoria()
				+ ", getCarisma()=" + getCarisma() + "]";
	}
	
}
