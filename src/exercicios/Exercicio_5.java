package exercicios;

/*

Exercicio5 aula 30

Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor 
unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio 
de cada pe�a 2. Calcule e mostre o valor a ser pago.		
		
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, numeroPeca1, numeroPeca2;
		double valorUnitario1, valorUnitario2, valorAPagar;
		
		codigo1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
	
		valorAPagar = numeroPeca1 * valorUnitario1 + numeroPeca2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
				
		sc.close();
	}

}