package br.ueg.logicaEprogramacao.listaExercicio2.CalculaVelocidadeMedia;

import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class CalculaVelocidadeMedia implements IExercicio {

	public void executa() {
		double variacaoEspaco, variacaoTempo, velocidadeMedia;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira a variação de Tempo");
			variacaoTempo = scan.nextFloat();

			System.out.println("Insira a variação de Espaço");
			variacaoEspaco = scan.nextFloat();
		}

		velocidadeMedia = variacaoEspaco / variacaoTempo;

		System.out.println("A velocidade média é " + velocidadeMedia);
	}
}
