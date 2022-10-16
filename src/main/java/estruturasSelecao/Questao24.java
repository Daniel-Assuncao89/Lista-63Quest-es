/**
 * 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
 * realizar:
 * 1 – Verificar se um dos números lidos é ou não múltiplo do outro
 * 2 – Verificar se os dois números lidos são pares
 * 3 – Verificar se a média dos dois números é maior ou igual a 7.
 * 4 – Sair
 */
package estruturasSelecao;

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, selecao;
        System.out.println("Inserir o valor de n1 e n2");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro\n" +
                "2 – Verificar se os dois números lidos são pares\n" +
                "3 – Verificar se a média dos dois números é maior ou igual a 7.\n" +
                "4 – Sair");
        selecao = entrada.nextInt();
        switch (selecao){
            case 1:
                if(n1*2 == n2 || n2*2 == n1){
                    System.out.println("Numero multiplo do outro");
                }
                break;
            case 2:
                if ( n1 % 2 == 0 && n2 % 2 ==0){
                    System.out.println("Numeros pares");
                } else {
                    System.out.println("Numeros impares");
                }
                break;
            case 3:
                int media = (n1 + n2) / 2;
                if(media >= 7){
                    System.out.println("Media maior ou igual a 7");
                } else {
                    System.out.println("Media inferior a 7");
                }
            case 4:
                System.out.println("Saindo");
                break;
        }
    }
}
