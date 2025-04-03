package br.ueg.logicaEprogramacao.listaExercicio2.CalculaSalarioReajustrado;

import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class CalculaSalarioReajustado implements IExercicio {
	@Override
	public void executa() {
		double salarioAtual, salarioReajustado, indiceReajuste;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira o salário Atual");
			salarioAtual = scan.nextFloat();

			System.out.println("Insira a porcentagem de reajuste do salário");
			indiceReajuste = scan.nextFloat();
		}

		salarioReajustado = salarioAtual * (1+(indiceReajuste / 100));

		System.out.println("O salário reajustado é " + salarioReajustado);
	}
}
