package testeGFT.questao4;

public class CamaroteSuperior extends VIP{
	private double valor;
	
	
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	@Override
	public void imprimeValor() {
		
		System.out.println(valor + 20);
	}
}
