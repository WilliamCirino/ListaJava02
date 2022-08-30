package lista2;

import java.util.Scanner;

public class LitrosDeCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do tempo gasto na viagem. (Em minutos)");

		float tempoGasto = sc.nextFloat();

		System.out.println("Digite a velocidade média utilizada durante a viagem.");

		float velocidadeMedia = sc.nextFloat();

		float distancia = tempoGasto * velocidadeMedia;

		float litrosUsados = distancia/12;

		System.out.println("A velocidade média utilizada durante a viagem foi de:" + velocidadeMedia);

		System.out.println("O tempo utilizado durante a viagem foi de: " + tempoGasto);

		System.out.println("A distancia percorrida durante a viagem foi de: " + distancia);

		System.out.println("A quantidade de Litros utilizada durante a viagem foi de:" + litrosUsados);
		
sc.close();
	}

}
