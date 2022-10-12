/**
 * 2) Faça um programa que:
 * - Leia a cotação do dólar
 * - Leia um valor em dólares
 * - Converta esse valor para Real
 * - Mostre o resultado
 */
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        double cotacaoDolar = 0, valorDolar = 0, real = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cotação do dolar em reais?");
        cotacaoDolar = entrada.nextDouble();
        System.out.println("Valor em dolar?");
        valorDolar = entrada.nextDouble();

        real = cotacaoDolar * valorDolar;
        System.out.println(real);
    }
}
