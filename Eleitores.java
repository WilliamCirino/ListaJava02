package lista2;

import java.util.Scanner;

public class Eleitores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número total de eleitores do Municipio.");

		float TotalEleitoresMunicipio = sc.nextFloat();

		System.out.println("Digite o número total de votos Brancos.");

		float VotosBrancos = sc.nextFloat();

		System.out.println("Digite o número total de votos Nulos.");

		float VotosNulos = sc.nextFloat();

		System.out.println("Digite o número total de votos Válidos.");

		int VotosValidos = sc.nextInt();

		float porcentagemBrancos = VotosBrancos / TotalEleitoresMunicipio * 100;

		float porcentagemNulos = VotosNulos / TotalEleitoresMunicipio * 100;

		float porcentagemValidos = VotosValidos / TotalEleitoresMunicipio * 100;

		System.out.println("A porcentagem dos Votos Brancos corresponde à: " + porcentagemBrancos + "%");

		System.out.println("A porcentagem dos Votos Nulos corresponde à: " + porcentagemNulos + "%");

		System.out.println("A porcentagem dos Votos Válidos corresponde à: " + porcentagemValidos + "%");

		sc.close();

	}

}
