package testeGFT.questao4;

public class Ingresso {
	private double valor = 10;
	
	public Ingresso(double valor) {
		this.valor = valor;
	}
	public Ingresso() {
		
	}
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public void imprimeValor() {
		System.out.println(this.valor);
	}
}
