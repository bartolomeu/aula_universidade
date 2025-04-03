import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o raio:");
        double valor = scan.nextDouble();
        System.out.println("Area do circulo é "+ areaCirculo(valor));
    }

    private static double areaCirculo(double raio){
        double resultado = Math.PI * raio * raio;
        return resultado;
    }
}
