package lista2;

import java.util.Scanner;

public class PrestacaoEmAtraso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da Presta��o.");

		float valorPrestacao = sc.nextFloat();

		System.out.println("Digite o valor da taxa de juros.");

		float taxa = sc.nextFloat();

		System.out.println("Digite a quantidade de dias em atraso.");

		float diasAtraso = sc.nextFloat();

		float prestacaoFinal = valorPrestacao + (valorPrestacao * taxa / 100) * diasAtraso;

		System.out.println("O valor final da presta��o em atraso � de R$" + prestacaoFinal);

		sc.close();

	}

}
