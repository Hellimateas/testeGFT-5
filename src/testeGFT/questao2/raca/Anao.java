package testeGFT.questao2.raca;

public class Anao  extends Raca{
	@Override
	public void setConstituicao(int constituicao) {
		super.setConstituicao(constituicao + 2);
	}
	
	@Override
	public void setForca(int forca) {
		// TODO Auto-generated method stub
		super.setForca(forca + 2);
	}
	
	@Override
	public void setSabedoria(int sabedoria) {
		// TODO Auto-generated method stub
		super.setSabedoria(sabedoria + 2);
	}

	@Override
	public String toString() {
		return "Anao [getForca()=" + getForca() + ", getDestreza()=" + getDestreza() + ", getConstituicao()="
				+ getConstituicao() + ", getInteligencia()=" + getInteligencia() + ", getSabedoria()=" + getSabedoria()
				+ ", getCarisma()=" + getCarisma() + ", getClass()=" + getClass() + "]";
	}
	
	
}
