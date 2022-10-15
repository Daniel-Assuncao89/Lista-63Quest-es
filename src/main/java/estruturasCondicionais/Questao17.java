/**
 * 17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
 * entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
 * Caso contrário, apresentar a mensagem “valor inválido”.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1;

        System.out.println("Valor de n1?");
        n1 = entrada.nextInt();

        if(n1 > 0 && n1 < 9){
            System.out.println("Valor válido");
        } else {
            System.out.println("valor invalido");
        }

    }
}
