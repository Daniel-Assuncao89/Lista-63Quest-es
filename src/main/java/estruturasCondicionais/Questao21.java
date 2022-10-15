/**
 * 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
 * positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1;

        System.out.println("Inserir valor positivo ou negativo");
        n1 = entrada.nextInt();

        if(n1 > 0){
            System.out.println("Valor positivo: " + n1);
        }else if(n1 < 0){
            System.out.println("Valor negativo: " + n1);
        } else {
            System.out.println("Valor inserido foi: " + n1);
        }
    }
}
