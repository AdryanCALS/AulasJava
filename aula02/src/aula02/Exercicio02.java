package aula02;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 7:");
		int num = entrada.nextInt();
		
		/*
		 * if (num == 1) { System.out.println("Domingo"); }else if(num ==2) {
		 * System.out.println("Segunda"); }else if(num ==3) {
		 * System.out.println("Terça"); }else if(num ==4) {
		 * System.out.println("Quarta"); }else if(num == 5) {
		 * System.out.println("Quinta"); }else if(num == 6) {
		 * System.out.println("Sexta"); }else if(num ==7) {
		 * System.out.println("Sábado"); }else { System.out.println("Numero invalido");
		 * }
		 */
		
		/*
		 * String resultado = num ==1? "Domingo":num==2? "Segunda":num==3? "Terça": num
		 * ==4? "Quarta": num == 5? "Quinta":num==6? "Sexta":num==7? "Sabado":"Ivalido";
		 * System.out.println(resultado);
		 */
		
		switch (num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		}
		entrada.close();
	}
}
