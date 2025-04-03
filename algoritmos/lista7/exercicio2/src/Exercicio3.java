import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o numero inicial");
        int inicial = scan.nextInt();
        System.out.println(somaNumeros(inicial));
    }
    public static int somaNumeros(int inicial){
        if(inicial == 1){
            return inicial;
        }
        return inicial + somaNumeros(inicial -1);
    }
}
