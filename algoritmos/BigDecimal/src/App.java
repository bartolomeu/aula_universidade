public class App {
    public static void main(String[] args) throws Exception {
        Double numDouble = 0.1;
        Double numDouble1 = 0.2;
        Double numDouble2 = numDouble + numDouble1;
        String numString = numDouble2.toString();

        System.err.println(numDouble);
        System.err.println(numDouble1);
        System.err.println(numDouble2);
        System.err.println(numString);
    }
}
