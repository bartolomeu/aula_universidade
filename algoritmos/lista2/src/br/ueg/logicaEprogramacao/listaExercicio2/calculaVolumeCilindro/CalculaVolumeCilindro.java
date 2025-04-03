package br.ueg.logicaEprogramacao.listaExercicio2.calculaVolumeCilindro;

import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class CalculaVolumeCilindro implements IExercicio {
	@Override
	public void executa() {
		double volumeCilindro, raio, altura;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira o raio do cilindro");
			raio = scan.nextDouble();
			
			System.out.println("Insira altura do cilindro");
			altura= scan.nextDouble();
		}

		volumeCilindro = Math.PI * (raio * raio) * altura;

		System.out.println("O volume do cilindro é " + volumeCilindro);
	}
}
