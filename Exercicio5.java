package JavaGeneration;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.next();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.next();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.next();
		
		
		if(palavra1=="vertebrado")
		{
			if(palavra2 == "ave")
			{
				if(palavra3 == "carnivoro")
				{
					System.out.println("\n… uma ¡guia");
				}
				else
				{
					System.out.println("\n… uma Pomba");
				}
			} 
			else 
			{
				if(palavra3 == "onivoro")
				{
					System.out.println("\n… um ser Humano");
				}
				else
				{
					System.out.println("\n… uma Vaca");
				}
			}
		}
		else 
		{
			if(palavra2 == "inseto")
			{
				if(palavra3 == "hematofago")
				{
					System.out.println("\n… uma Pulga");
				}
				else
				{
					System.out.println("\n… uma Lagarta");
				}
			}
			else
			{
				if(palavra3 == "hematofago")
				{
					System.out.println("\n… uma Sanguessuga");
				}
				else
				{
					System.out.println("\n… uma Minhoca");
				}
			}
		}
	}
}
