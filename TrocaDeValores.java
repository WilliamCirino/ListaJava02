package lista2;

import java.util.Scanner;

public class TrocaDeValores {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor. (Em Caract�res.)");
	
	
	String valor1 = sc.nextLine();
	
	System.out.println("Digite o segundo valor.(Em Caract�res.)");
	
	String valor2 = sc.nextLine();
	
	String trocaValor01 = valor2;
	
	String trocaValor02 = valor1;
	
	System.out.println("Os valores foram trocados, o primeiro valor agora �: " + trocaValor01 + ". e o segundo valor agora �: " + trocaValor02);
	
	sc.close();
	

	}

}
