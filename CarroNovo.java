package lista2;

import java.util.Scanner;

public class CarroNovo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de custo da fabrica��o do veiculo.");

		float custoFabricacao = sc.nextFloat();

		float distribuidor = custoFabricacao * 28 / 100;

		float imposto = custoFabricacao * 45 / 100;

		float valorFinalVeiculo = custoFabricacao + distribuidor + imposto;

		System.out.println("O valor da porcentagem do distribuidor � de R$" + distribuidor);

		System.out.println("O valor da porcentagem dos impostos � de R$" + imposto);

		System.out.println(
				"O valor final do veiculo com os custos de impostos e distribui��o � de R$" + valorFinalVeiculo);
		sc.close();

	}

}
