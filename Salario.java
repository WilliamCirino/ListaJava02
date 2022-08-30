package lista2;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário atual.");

		float salarioAtual = sc.nextFloat();

		System.out.println("Digite o percentual de reajuste salarial.");

		float percentual = sc.nextFloat();

		float salarioAdicional = salarioAtual / 100 * percentual;
		
		float salarioFinal = salarioAdicional + salarioAtual;
		

		System.out.println("O valor do seu novo salário após o percentual aplicado é de R$" + salarioFinal);
		sc.close();

	}

}
