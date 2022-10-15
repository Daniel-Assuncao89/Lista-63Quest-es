package entradaProcessamentoSaida; /**
 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
 * pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int anos = 0, meses = 0 , dias = 0, idade = 0;

        System.out.println("Quantos anos voce tem?");
        anos = entrada.nextInt();

        System.out.println("Quantos meses?");
        meses = entrada.nextInt();

        System.out.println("Quantos dias?");
        dias = entrada.nextInt();

        idade = anos * 365;
        idade += (meses * 30);
        idade += dias;

        System.out.println("Sua idade em dias é de: " + idade + " dias");
    }
}
