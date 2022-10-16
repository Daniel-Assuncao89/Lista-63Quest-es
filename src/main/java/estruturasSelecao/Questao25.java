/**
 * 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
 * utilizando as seguintes fórmulas: (h = altura)
 * - Para homens: (72.7*h) - 58
 * - Para mulheres: (62.1 *h) - 44.7
 */
package estruturasSelecao;

import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura, calculo = 0;
        String genero;


        System.out.println("H\n" + "M");
        genero = entrada.nextLine();

        switch (genero){
            case "H":
                System.out.println("Sua altura?");
                altura = entrada.nextDouble();
                calculo = (72.7 * altura) - 58;
                System.out.println("Peso Ideal: " + calculo);
                break;
            case "M":
                System.out.println("Sua altura?");
                altura = entrada.nextDouble();
                calculo = (62.1 * altura) - 44.7;
                System.out.println("Peso Ideal: " + calculo);
                break;
        }

    }
}
