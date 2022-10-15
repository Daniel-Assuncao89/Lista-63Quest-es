/**
 * 14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2;

        System.out.println("Inserir primeiro valor");
        n1 = entrada.nextDouble();
        System.out.println("Inserir primeiro valor");
        n2 = entrada.nextDouble();

        if(n1 > n2){
            System.out.println("A diferença do maior para o menor é de " + (n1 - n2));
        } else if (n2 > n1){
            System.out.println("A diferença do maior para o menor é de " + (n2 - n1));
        } else {
            System.out.println("Numeros são iguais");
        }
    }
}
