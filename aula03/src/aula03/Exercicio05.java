package aula03;
import java.util.Scanner;
public class Exercicio05 {
  public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  System.out.print("Digite a quantidade de alunos: ");
	  int qtd_alunos = entrada.nextInt();
	  double soma = 0;
	  for(int i=1;i<=qtd_alunos;i++) {
		  System.out.printf("Digite a nota do aluno %d: ", i);
		  double notas = entrada.nextDouble();
		  soma +=notas;
		}
		double media = soma/qtd_alunos;
		System.out.printf("A media da turma é: %.2f", media);
		entrada.close();
	}
}