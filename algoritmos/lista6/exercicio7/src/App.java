import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] matrix = new int[3][3];//{{1,2,3},{4,5,6},{7,8,9}};

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int contador =0;
        for (int i = 0; i < matrix.length; i++) {
            contador += matrix[i][i];
        }
        System.out.println(contador);

    }
}
