package lista2;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu sal�rio atual.");

		float salarioAtual = sc.nextFloat();

		System.out.println("Digite o percentual de reajuste salarial.");

		float percentual = sc.nextFloat();

		float salarioAdicional = salarioAtual / 100 * percentual;
		
		float salarioFinal = salarioAdicional + salarioAtual;
		

		System.out.println("O valor do seu novo sal�rio ap�s o percentual aplicado � de R$" + salarioFinal);
		sc.close();

	}

}
