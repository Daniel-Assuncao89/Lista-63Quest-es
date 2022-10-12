/**
 * 1) Faça um programa para calcular o estoque médio de uma peça, sendo que:
 * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int estoqueMedio = 0, qtdMinima = 0, qtdMaxima = 0;

        System.out.println("Quantidade minima?");
        qtdMinima = entrada.nextInt();

        System.out.println("Quantidade maxima?");
        qtdMaxima = entrada.nextInt();

        estoqueMedio = (qtdMinima + qtdMaxima) / 2;

        System.out.println("Estoque medio: " + estoqueMedio);
    }
}
