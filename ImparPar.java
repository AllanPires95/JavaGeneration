package JavaGeneration;
import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		Scanner ler  = new Scanner (System.in);
		int num, x=1, contPar=0,contImpar=0;
		
		while (x<=10) {
			System.out.println("\nEntre com qualquer n�mero");
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				contPar++;
				System.out.println("\nEsse n�mero � par");
			}
			else 
			{
				contImpar++;
				System.out.println("\nEsse n�mero � impar");
			}
			x++;
		}
		System.out.printf("\nQuantidade de n�meros pares foi de: " +contPar);
		System.out.printf("\nQuatidade de n�meros impares foi de: " +contImpar);
		{
			
		}
	}
}
