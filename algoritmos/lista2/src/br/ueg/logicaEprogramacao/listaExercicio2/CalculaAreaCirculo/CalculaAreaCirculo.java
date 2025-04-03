package br.ueg.logicaEprogramacao.listaExercicio2.CalculaAreaCirculo;

import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class CalculaAreaCirculo implements IExercicio {
	@Override
	public void executa() {
		
		double areaCirculo, raio;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira o raio do circulo");
			raio = scan.nextDouble();
		}

		areaCirculo = Math.PI * (raio * raio);
		
		System.out.println("A area do circulo é " + areaCirculo);
	}
}
