package br.ueg.logicaEprogramacao.listaExercicio2.conversaoTemperatura;

import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class ConversaoTemperatura implements IExercicio {
	@Override
	public void executa() {
		double temperaturaF, temperaturaC;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira o raio do circulo");
			temperaturaC = scan.nextDouble();
		}

		temperaturaF = (9/5)*temperaturaC + 32 ;

		System.out.println("A temperatura em Fahrenheit é " + temperaturaF);
	}
}
