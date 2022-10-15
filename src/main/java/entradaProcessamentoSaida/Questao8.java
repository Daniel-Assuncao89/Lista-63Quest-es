package entradaProcessamentoSaida; /**
 * 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
 * V = 3.14159 * R * R * A
 * Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
 */
import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double volume = 0, r = 0, a = 0;

        System.out.println("Valor do raio?");
        r = entrada.nextDouble();

        System.out.println("Valor da area?");
        a = entrada.nextDouble();

        volume = 3.14159 * Math.pow(r, 2) * a;
        System.out.println("Volume da lata de óleo: " + volume);
    }
}
