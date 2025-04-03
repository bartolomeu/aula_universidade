package br.ueg.logicaEprogramacao.listaExercicio2.CalculaIMC;

import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class CalculaIMC implements IExercicio {
	@Override
	public void executa() {
		double iMC, peso, altura;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira o peso");
			peso = scan.nextFloat();

			System.out.println("Insira a altura");
			altura = scan.nextFloat();
		}

		iMC = peso/(altura * altura);

		System.out.println("O Indice de Massa Corpórea (IMC) é  " + iMC);
	}
}
