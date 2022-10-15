/**
 * 15) Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
 * aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
 * do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
 * apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
 * apresentar u
 */
package estruturasCondicionais;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[4];
        double media = 0, recuperação = 0;

        System.out.println("Inserir as 4 notas do aluno");
        for(int i = 0; i < 4; i++){
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }
        media /= 4;
        if(media >= 7){
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Recuperação, inserir nota da recuperação");
            recuperação = entrada.nextDouble();
            media += recuperação;
            media /= 2;
            if(media >= 7){
                System.out.println("Aprovado na Recuperação: " + media);
            } else {
                System.out.println("Reprovado: " + media);
            }
        }
    }
}
