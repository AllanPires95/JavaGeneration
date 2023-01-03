
package JavaGeneration;

import java.util.Scanner;

public class Exerckckl {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		
		System.out.println("\nEntre com a sua idade");
		idade.nextInt();
		ler.nextLine();
		
		
		if (idade >=18 && idade <65)
		{
			System.out.println("\nVocê está apto a votar, voto obrigatório");		
		}
		else if (idade >=16 & idade <18)
		{
			System.out.println("\nVocê está apto a votar, voto facultativo");
		}
		else if (idade<16)
		{
			System.out.println("\nVocê não está apto a votar");
		}
		else if (idade >=65)
		{
			System.out.println("\nVocê está apto a votar, voto facultativo");
		}
		{
		}
}

		}