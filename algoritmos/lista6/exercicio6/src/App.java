import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[][][] matrix = new int[2][3][3];
        int[][] matrixSomada = new int[3][3];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int j2 = 0; j2 < matrix[i][j].length; j2++) {
                    System.out.println("insira o valor da "+(i+1)+"° tabela na posicão "+j+" => "+j2);
                    int valorUsuario = leitor.nextInt();
                    matrix[i][j][j2] = valorUsuario;
                }
            }
        }

        leitor.close();

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0][i].length; j++) {
                matrixSomada[i][j] = matrix[0][i][j] + matrix[1][i][j];
            }
        }

        for (int[] is : matrixSomada) {
            System.out.println(Arrays.toString(is));
        }

    }
}
