/**
 * 19) Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
 * lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
 * eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
 * contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
 * ocorrência.
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        System.out.println("Inserir os valores de A, B e C. Respectivamente");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if(c < a + b || b < a + c || a < b + c){
            if(a == b && b == c){
                System.out.println("Triangulo equilatero");
            } else if (a == b || a == c || b == c){
                System.out.println("Triangulo isósceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("Lados nao caracterizam um triangulo");
        }
    }
}
