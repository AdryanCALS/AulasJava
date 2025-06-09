package aula02;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Telefonou para a vitima?");
		char resp1 = input.next().charAt(0);
		if (resp1 == 's') {
			contador++;
		}
		System.out.println("Esteve no local do crime?");
		char resp2 = input.next().charAt(0);
		if (resp2 == 's') {
			contador++;
		}
		System.out.println("Mora perto da vitima?");
		char resp3 = input.next().charAt(0);
		if (resp3 == 's') {
			contador++;
		}
		System.out.println("Devia para a vitima?");
		char resp4 = input.next().charAt(0);
		if (resp4 == 's') {
			contador++;
		}
		System.out.println("Já trabalhou com a vitima?");
		char resp5 = input.next().charAt(0);
		if (resp5 == 's') {
			contador++;
		}
		
		if(contador == 2) {
			System.out.println("Suspeita");
		}else if(contador==3||contador==4) {
			System.out.println("Cumplice");
		}else if(contador ==5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocentre");
		}
		
		input.close();
	}
}
