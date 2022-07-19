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
			
		} else if(raca == 2) {
			Elfo elfo2 = new Elfo();
		} else if(raca == 3) {
			Humano humano3 = new Humano();
		}
		
		
		System.out.println();
	}
}
