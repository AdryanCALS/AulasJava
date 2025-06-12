package aula03;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o numero de alunos da sala: ");
		int qtd = input.nextInt();
		int i = 0;
		double soma_notas = 0;
		
		while(i<qtd) {
			System.out.printf("Digite a nota do aluno %d: ",i+1);
			double notas = input.nextDouble();
			soma_notas += notas;
			i++;
		}
		
		double media = soma_notas/qtd;
		System.out.printf("A media da turma é: %.2f", media);
		input.close();
	}

}