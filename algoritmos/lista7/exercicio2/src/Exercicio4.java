public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println(ehPrimo(3));
        System.out.println(ehPrimo(4));
        System.out.println(ehPrimo(5));
        System.out.println(ehPrimo(6));
        System.out.println(ehPrimo(7));
        System.out.println(ehPrimo(8));
        System.out.println(ehPrimo(9));
        System.out.println(ehPrimo(10));
        System.out.println(ehPrimo(11));
    }

    // public static boolean ehPrimo(int numero){
        // if (numero==1) {
        //     return true;
        // }
        // int divisor = numero -1;
        // while (divisor > 1) {
        //     if (ehDivisivelPor(numero, divisor)){
        //         return false;
        //     }
        //     divisor --;
        // }
        // return true;
    // }
    // private static boolean ehDivisivelPor(int numero, int divisor){
    //     return numero % divisor == 0;
    // }

    private static boolean ehPrimo(int numero){
        return ! ehDivisivelPor(numero, 2);
    }
    private static boolean ehDivisivelPor(int numero, int divisor){
        if(divisor >= numero){
            return false;
        }
        if(numero % divisor == 0){
            return true;
        }
        return ehDivisivelPor(numero, divisor+1);
    }
}
