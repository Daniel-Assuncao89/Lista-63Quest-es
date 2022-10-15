package entradaProcessamentoSaida; /**
 * 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
 * valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
 * A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 * com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
 * devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
 * multiplicações.
 */

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d= 0;
        int [] soma = new int[6];
        int [] multiplicacao = new int[6];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserir o valor de A");
        a = entrada.nextInt();
        System.out.println("Inserir o valor de B");
        b = entrada.nextInt();
        System.out.println("Inserir o valor de C");
        c = entrada.nextInt();
        System.out.println("Inserir o valor de D");
        d = entrada.nextInt();




        for(int i = 0; i < 3; i++){
            if(i == 0){
                soma[0] = a + b;
                soma[1] = a + c;
                soma[2] = a + d;
            } else if (i == 1){
                soma[3] = b + c;
                soma[4] = b + d;
            } else {
                soma[5] = c + d;
            }
        }
        for(int i = 0; i < 3; i++){
            if(i == 0){
                multiplicacao[0] = a * b;
                multiplicacao[1] = a * c;
                multiplicacao[2] = a * d;
            } else if (i == 1){
                multiplicacao[3] = b * c;
                multiplicacao[4] = b * d;
            } else {
                multiplicacao[5] = c * d;
            }

        }
        for (int i = 0; i < 6; i++){
            System.out.print(soma[i] + ",");
            if(i == 5){
                System.out.println("----SOMA----");
            }
        }
        for (int i = 0; i < 6; i++){
            System.out.print(multiplicacao[i] + ",");
            if(i == 5){
                System.out.println("----MULTIPLICAÇÃO----");
            }
        }
    }
}
