package lista2;

import java.util.Scanner;

public class GrausCelsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em Graus Celsius.");

		float celsius = sc.nextFloat();

		float fahrenheit = (9 * celsius + 160) / 5;

		System.out.println("A temperatura convertida de Celsius para Fahrenheit é de " + fahrenheit + " ° Fahrenheit");

		sc.close();
	}

}
