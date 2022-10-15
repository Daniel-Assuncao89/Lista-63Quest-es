/**
 * 18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
 * igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
 * um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou
 * seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int CODIGO;

        System.out.println("Inserir valor de 1 a 3");
        CODIGO = entrada.nextInt();

        switch (CODIGO){
            case 1 -> System.out.println("Um: " + CODIGO);
            case 2 -> System.out.println("Dois: " + CODIGO);
            case 3 -> System.out.println("Tres: " + CODIGO);
            default -> System.out.println("Código invalido");
        }
    }
}
