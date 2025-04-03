import java.util.Scanner;

public class Exercicio1 {
    public Exercicio1(){
        System.out.println("Insira a frase");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        System.out.println("comprimento => " + frase.length());

        System.out.println("Em maiúscula:"+frase.toUpperCase());
        System.out.println("Em minúscula:"+frase.toLowerCase());

        System.out.println("Digite o caracter a ser procurado");
        char searchChar = sc.nextLine().trim().toLowerCase().charAt(0);

        long contagem = this.countCharacters(frase.toLowerCase(), searchChar);
        System.out.printf("O caracter %s foi encontrado %s vezes\n", searchChar, contagem);

    }

    public long countCharacters(String frase, char searchChar) {
        long contagem = frase.chars().filter(c -> c == searchChar).count();
        return contagem;
    }
}
