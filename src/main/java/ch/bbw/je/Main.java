package ch.bbw.je;

/**
 * @author Nexterbyby
 * @version 0.0.1 19.05.2021
 * @since 0.0.1 19.05.2021
 */
public class Main {
    public static void main( String[] args ) {
        Calculator c = new Calculator();

        int num1 = 15;
        int num2 = 2;

        System.out.println("Console Calculator");
        System.out.println("==================\n");
        System.out.println(num1 + " + " + num2 + " = " + c.summe(num1, num2));
    }
}
