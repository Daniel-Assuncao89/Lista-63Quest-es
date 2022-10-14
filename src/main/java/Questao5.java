/**
 * 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
 * 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
 * Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
 * Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
 * fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
 * tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 */
// automovel faz 12km/l. tempo gasto e velMedia.

import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tempo = 0, velMedia = 0, distancia = 0, litrosUsados = 0;

        System.out.println("Tempo gasto na viagem?");
        tempo = entrada.nextDouble();
        System.out.println("Velocidade media da viagem?");
        velMedia = entrada.nextDouble();

        distancia = tempo * velMedia;
        litrosUsados = distancia / 12;

        System.out.println("Sua velocidade media foi de " + velMedia + " e seu tempo gasto foi de " + tempo + ".\nDistancia percorrida: " + distancia + "\nQuantidade de litros usados: " + litrosUsados);
    }
}
