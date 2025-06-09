package aula02;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite M ou F:");
		char resposta = entrada.next().charAt(0);
		
		/*if (resposta == 'F' || resposta == 'f') {
			System.out.println("Feminino");
		}else if (resposta == 'M' || resposta == 'm') {
			System.out.println("Masculino");
		}else {
			System.out.println("Invalido");
		}*/
		
		String result = resposta == 'F'||resposta=='f'? "Feminino":resposta=='M'||resposta=='m'?"Masculino":"Invalido";
		System.out.println(result);
		
		entrada.close();
	}
}
