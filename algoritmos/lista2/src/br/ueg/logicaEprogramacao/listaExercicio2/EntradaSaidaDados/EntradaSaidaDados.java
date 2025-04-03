package br.ueg.logicaEprogramacao.listaExercicio2.EntradaSaidaDados;

import java.util.Scanner;
import java.util.regex.Pattern;

import br.ueg.logicaEprogramacao.listaExercicio2.IExercicio;

public class EntradaSaidaDados implements IExercicio {
	@Override
	public void executa() {
		String nome, endereco, telefone; 
		int idade;
		char sexo;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Insira o nome");
			nome = scan.next();
			
			System.out.println("Insira a idade");
			idade = scan.nextInt();
			
			System.out.println("Insira o sexo (m = masculino, f = feminino, o = outros, n = prefiro não informar");
			sexo = scan.next(Pattern.compile("^(m|f|o|n){1}$")).charAt(0);
			
			System.out.println("Insira o endereço");
			endereco = scan.next();

			System.out.println("Insira o telefone");
			telefone = scan.next();
		}

		System.out.println("O nome do cliente é " + nome);
		System.out.println("A idade do cliente é " + idade);
		System.out.println("O sexo do cliente é " + sexo);
		System.out.println("O endereço do cliente é " + endereco);
		System.out.println("O telefone do cliente é " + telefone);
	}
}
