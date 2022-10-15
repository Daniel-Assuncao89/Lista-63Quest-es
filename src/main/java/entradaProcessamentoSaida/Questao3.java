package entradaProcessamentoSaida; /**
 * 3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados:
 * - Identificação do vendedor
 * - Código da peça
 * - Preço unitário da peça
 * - Quantidade vendida
 */

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        int idVendedor = 0, codPeca = 0, qtdVendida = 0;
        double precoUnitario = 0, total = 0, comissao = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual id do vendedor?");
        idVendedor = entrada.nextInt();
        if(idVendedor > 0){
            System.out.println("Codigo da peça?");
            codPeca = entrada.nextInt();
            System.out.println("Quantidade de peças vendidas?");
            qtdVendida = entrada.nextInt();
            System.out.println("Valor de cada peça?");
            precoUnitario = entrada.nextDouble();

            total = qtdVendida * precoUnitario;
            comissao =  total * 0.05;
            System.out.println("Comissão de: "+ comissao);
        }
    }
}
