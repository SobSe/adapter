public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator(new Calculator());

        System.out.println(calc.pow(2, 3));
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.mult(2, 3));
    }
}
