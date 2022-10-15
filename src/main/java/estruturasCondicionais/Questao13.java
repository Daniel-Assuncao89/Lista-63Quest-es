/**
 * 13) Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int [3];

        System.out.println("Inserir valor de n1, n2 e n3");
        for(int i = 0; i < 3; i++){
            valores[i] = entrada.nextInt();
        }

        for(int i = 0; i < 3; i++){
            for(int y = 0; y < 3; y++){
                if(valores[i] > valores[y]) {
                int changer = valores[i];
                valores[i] = valores[y];
                valores[y] = changer;
                }
            }
        }
        for (int valor: valores) {
            System.out.printf(valor + ", ");
        }
    }
}
