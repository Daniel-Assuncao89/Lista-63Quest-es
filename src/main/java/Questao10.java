/**
 * 10) Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
 * entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 */

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor 1?");
        n1 = entrada.nextInt();

        System.out.println("Valor 2?");
        n2 = entrada.nextInt();

        if(n1 > n2){
            System.out.println("Valor 1 maior que valor 2");
        } else if (n1 < n2){
            System.out.println("Valor 1 menor que valor 2");
        } else if (n1 == n2) {
            System.out.println("Valor 1 igual que valor 2");
        }
    }
}
