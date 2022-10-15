package estruturasCondicionais;

/**
 * 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
 * possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
public class Questao11 {
    public static void main(String[] args) {
        int a = 3, b = 5, controle = 0;
        System.out.println("valor a: "+ a);
        System.out.println("valor b: "+ b);
        controle = a;
        a = b;
        b = controle;
        System.out.println("valor trocado a: " + a);
        System.out.println("valor trocado b: " + b);
    }
}
