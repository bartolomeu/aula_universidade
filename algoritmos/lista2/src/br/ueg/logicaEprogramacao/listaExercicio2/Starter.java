package br.ueg.logicaEprogramacao.listaExercicio2;

import java.util.Map;
import java.util.Scanner;

import br.ueg.logicaEprogramacao.listaExercicio2.CalculaAreaCirculo.CalculaAreaCirculo;
import br.ueg.logicaEprogramacao.listaExercicio2.CalculaIMC.CalculaIMC;
import br.ueg.logicaEprogramacao.listaExercicio2.CalculaSalarioReajustrado.CalculaSalarioReajustado;
import br.ueg.logicaEprogramacao.listaExercicio2.CalculaVelocidadeMedia.CalculaVelocidadeMedia;
import br.ueg.logicaEprogramacao.listaExercicio2.EntradaSaidaDados.EntradaSaidaDados;
import br.ueg.logicaEprogramacao.listaExercicio2.calculaVolumeCilindro.CalculaVolumeCilindro;
import br.ueg.logicaEprogramacao.listaExercicio2.conversaoTemperatura.ConversaoTemperatura;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] options = { 0, 1, 2, 3 };

		Map<Integer, IExercicio> optionsMap = Map.of(
				1, new CalculaVelocidadeMedia(), //Deveria instanciar a classe somente depois de selecionada a opção e se possível 
				2, new CalculaIMC(),
				3, new CalculaSalarioReajustado(),
				4, new EntradaSaidaDados(),
				5, new CalculaAreaCirculo(),
				6, new ConversaoTemperatura(),
				7, new CalculaVolumeCilindro()
		);

		boolean continueExecuting = true; 
		
		do {
			showOptions();
			Scanner scan = new Scanner(System.in);
			Integer selectedOption = scan.nextInt();
			scan.close();
			// TODO refazer esta busca na array
			boolean found = optionsMap.containsKey(selectedOption);

			if (!found) {
				clearScreen();
				System.out.println("Opção não encontrada, tente novamente");
				System.out.println();
				showOptions();
			}else {
				IExercicio selected = optionsMap.get(selectedOption);
				selected.executa();
				clearScreen();
			}
			
			continueExecuting = selectedOption!=0;
		}while(continueExecuting);
		
	}

	private static void showOptions() {
		System.out.println("Escolha um dos exercícios:");
		System.out.println("1 - Calcula Velocidade Média");
		System.out.println("2 - Calcula ́Índice de Massa Corporal (IMC)");
		System.out.println("3 - Calcula Saĺario Reajustado");
		System.out.println("4 - Entrada e Saída de Dados");
		System.out.println("5 - Calcula Area Circulo");
		System.out.println("6 - Conversão Temperatura");
		System.out.println("7 - Calcula Volume Cilindro");
		System.out.println();
		System.out.println("0 - Sair");
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
