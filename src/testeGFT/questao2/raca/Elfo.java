package testeGFT.questao2.raca;

public class Elfo  extends Raca{
	@Override
	public void setDestreza(int destreza) {
		// TODO Auto-generated method stub
		super.setDestreza(destreza+2);
	}
	@Override
	public void setCarisma(int carisma) {
		// TODO Auto-generated method stub
		super.setCarisma(carisma + 2);
	}
	@Override
	public void setInteligencia(int inteligencia) {
		// TODO Auto-generated method stub
		super.setInteligencia(inteligencia + 2);
	}
}
