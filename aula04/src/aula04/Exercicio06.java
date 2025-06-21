package aula04;

public class Exercicio06 {

	public static void main(String[] args) {
		String array[] = {"a", "vida", "é","bela"};
		
		for(int i=array.length-1; i>=0;i--) {
			System.out.print(array[i].toUpperCase()+ " ");
		}

	}

}
