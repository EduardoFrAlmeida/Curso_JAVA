package exercicios;

/*
Exercicio3 aula 30 

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto 
de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
 
*/

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = A * B - C * D;		
		
		System.out.println("DIFERENCA = " + dif);
		
		sc.close();
	}

}