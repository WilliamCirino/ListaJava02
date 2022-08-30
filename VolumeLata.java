package lista2;

import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do Raio da Lata de Óleo.");

		double raio = sc.nextDouble();

		System.out.println("Digite o valor da Altura da Lata de Óleo.");

		double altura = sc.nextDouble();

		double volume = Math.PI * Math.pow(raio, 2) * altura;

		System.out.println("O valor do volume da lata de óleo é de: " + volume);
		sc.close();

	}

}
