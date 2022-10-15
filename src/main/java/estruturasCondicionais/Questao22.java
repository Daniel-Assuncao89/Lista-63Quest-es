/**
 * 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
 * resultado.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b;

        System.out.println("Inserir valor positivo ou negativo");
        a = entrada.nextInt();

        if( a < 0){
            b = a;
            System.out.println("Valor negativo armazenado em B: " + b);
        } else {
            System.out.println("Valor positivo armazenado em A: " + a);
        }
    }
}
