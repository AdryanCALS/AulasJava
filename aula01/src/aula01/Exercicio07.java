package aula01;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextInt();
		
		/*
		 * if(resp>0 ?) { System.out.println("positivo"); }else {
		 * System.out.println("negativo"); }
		 */
		
		System.out.println(resp==0? "zero": resp>0? "positivo":"negativo");
	}
}
