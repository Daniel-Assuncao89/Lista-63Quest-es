package estruturasCondicionais;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;
        System.out.println("Valor de a, b e c?");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        while (a <= 0 || b <= 0 || c <= 0 ){
            if ( a <= 0){
                System.out.println("Valor de a invalido, favor inserir novamente");
                a = entrada.nextInt();
            } else if ( b <= 0){
                System.out.println("Valor de b invalido, favor inserir novamente");
                b = entrada.nextInt();
            } else{
                System.out.println("Valor de c invalido, favor inserir novamente");
                c = entrada.nextInt();
            }
        }

        if(a < b && a < c){
            System.out.println("Menor valor lido: " + a);
            if(b > a && b > c){
                System.out.println(b + " * " + a + ": " + (b * a));
                System.out.println(b + " / " + a + ": " + (b / a));
            } else {
                System.out.println(c + " * " + a + ": " + (c * a));
                System.out.println(c + " / " + a + ": " + (c / a));
            }
        } else if(b < a && b < c){
            System.out.println("Menor valor lido: " + b);
            if(a > b && a > c){
                System.out.println(a + " * " + b + ": " + (a * b));
                System.out.println(a + " / " + b + ": " + (a / b));
            } else {
                System.out.println(c + " * " + b + ": " + (c * b));
                System.out.println(c + " / " + b + ": " + (c / b));
            }
        } else if(c < a && c < b){
            System.out.println("Menor valor lido: " + c);
            if(a > b && a > c){
                System.out.println(a + " * " + c + ": " + (a * c));
                System.out.println(a + " / " + c + ": " + (a / c));
            } else {
                System.out.println(b + " * " + c + ": " + (b * c));
                System.out.println(b + " / " + c + ": " + (b / c));
            }
        }
    }
}
