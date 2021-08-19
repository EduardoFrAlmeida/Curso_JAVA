package exercicios;

/*

Exercicio4 aula 30

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número 
e o salário do funcionário, com duas casas decimais.

*/

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int HT, VH;
		double salario;
		
		HT = sc.nextInt();
		VH = sc.nextInt();
		
		salario = HT * VH;
		
		System.out.println("NUMBER = " + salario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}