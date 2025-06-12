package aula03;

public class Exercicio06 {

	public static void main(String[] args) {
		int soma3=0,soma5 =0,soma_total=0;
		for(int i=1;i<21;i++) {
			if(i%3==0) {
				soma3+=i;
			}
			if(i%5==0) {
				soma5+=i;
			}
		}
		soma_total = soma3+soma5;
		System.out.printf("A soma dos multiplos de 3 é: %d\n", soma3);
		System.out.printf("A soma dos multiplos de 5 é: %d\n", soma5);
		System.out.printf("A soma dos multiplos de 3 e 5 é: %d", soma_total);
	}

}
