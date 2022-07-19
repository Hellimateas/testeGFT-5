package testeGFT.questao2;

import java.util.ArrayList;
import java.util.Scanner;

import testeGFT.questao2.raca.Anao;
import testeGFT.questao2.raca.Elfo;
import testeGFT.questao2.raca.Humano;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> atributos = new ArrayList();

		System.out.println("escolha seis números entre 3 e 18: ");
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			int atributo = input.nextInt();
			if (atributo >= 3 && atributo <= 18) {
				atributos.add(atributo);
			} else {
				System.out.println("digite novamente um número entre 3 e 18: ");
				i--;
			}

		}
		
		System.out.println("Escolha agora sua raça digite \n1 - Anão\n2 - Elfo\n3 - Humano");
		int raca = input.nextInt();
		if(raca == 1) {
			Anao anao1 = new Anao();
			anao1.setForca(atributos.get(0));
			anao1.setDestreza(atributos.get(1));
			anao1.setConstituicao(atributos.get(2));
			anao1.setInteligencia(atributos.get(3));
			anao1.setSabedoria(4);
			anao1.setCarisma(5);
			
			System.out.println(anao1.toString());
		} else if(raca == 2) {
			Elfo elfo2 = new Elfo();
			elfo2.setForca(atributos.get(0));
			elfo2.setDestreza(atributos.get(1));
			elfo2.setConstituicao(atributos.get(2));
			elfo2.setInteligencia(atributos.get(3));
			elfo2.setSabedoria(4);
			elfo2.setCarisma(5);
			System.out.println(elfo2.toString());
		} else if(raca == 3) {
			Humano humano3 = new Humano();
			humano3.setForca(atributos.get(0));
			humano3.setDestreza(atributos.get(1));
			humano3.setConstituicao(atributos.get(2));
			humano3.setInteligencia(atributos.get(3));
			humano3.setSabedoria(4);
			humano3.setCarisma(5);
			System.out.println(humano3.toString());
		}
		
		
		
	}
}
