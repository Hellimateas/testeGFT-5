package testeGFT.questao4;

public class VIP extends Ingresso{
	
	private double valor;
	
	public VIP() {
		super.setValor(valor);
	}
	
	@Override
	public void imprimeValor() {
		setValor(getValor()+ 10);
		System.out.println(getValor());
	}
}
