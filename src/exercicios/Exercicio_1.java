package exercicios;

/* 

Exercicio1 aula 30 

Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
desses n�meros com uma mensagem explicativa.

*/

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {


			
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println(" SOMA = " + soma);
		
		sc.close();
	}

}