package lista2;


import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
	//1) Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
	//idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e m�s com 30 dias.
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite quantos anos voc� possui: ");
	
	int anos = sc.nextInt();
	
	System.out.println("Digite quantos a quantidade de meses completos vividos: ");
	
	int meses = sc.nextInt();
	
	System.out.println("Digite a quantidade de dias passados do ultimo M�sVers�rio: ");
	
	int dias = sc.nextInt();
	
	int diasVividos = anos*365+meses*30+dias;
	
	System.out.println("A sua idade expressa em dias � de: " + diasVividos);

	
	sc.close();
		
	}

}
