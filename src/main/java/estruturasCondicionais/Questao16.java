/**
 * 16) Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
 * menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        System.out.println("Valores de n1 e n2?");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if(n1 > n2){
            System.out.println("N1 é maior que N2");
        } else if(n1 < n2){
            System.out.println("N2 é maior que N1");
        } else {
            System.out.println("Numeros Iguais");
        }
    }
}
