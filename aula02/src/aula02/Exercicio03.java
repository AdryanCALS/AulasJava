package aula02;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		double num = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextInt();
		
		double media = (num+num2)/2;
		System.out.println(media);
		
		entrada.close();
	}
}
