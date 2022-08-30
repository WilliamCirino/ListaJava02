package lista2;

import java.util.Scanner;

public class GrausFahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Graus Fahrenheit.");
		
		float fahrenheit = sc.nextFloat();
		
		float celsius = (fahrenheit-32)*5/9;
		
		System.out.println("A temperatura convertida de Fahrenheit para Celsius é de " + celsius +" ° Celsius");
		sc.close();
	
	}

}
