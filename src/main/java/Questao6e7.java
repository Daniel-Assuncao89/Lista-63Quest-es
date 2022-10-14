import java.util.Scanner;

public class Questao6e7 {
    public static void main(String[] args) {
        double c = 0, f = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Temperatura em graus celsius");
        c = entrada.nextDouble();

        f = (9 * c + 160) / 5;
        System.out.println("Temperatura convertida em Fahrenheit: " + f);

        System.out.println("Temperatura em Fahrenheit");
        f = entrada.nextDouble();

        c = (f - 32) * 5/9;
        System.out.println("Temperatura convertida em graus celsius: "+ c);
    }
}
