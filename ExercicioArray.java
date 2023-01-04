package JavaGeneration;
import java.util.Scanner;

	public static void main(String[] args) {
		// Exercicio1
			Scanner reader = new Scanner(System.in);
        
        int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;
        
        System.out.printf("Digite o número que você deseja encontrar: ");
        numero = reader.nextInt();
        
        for(int x = 0; x < numeros.length; x++) {
            if(numeros[x] == numero)
                System.out.printf("O número %d está localizado na posição: %d", numeros[x], x);
            else if(x == numeros.length - 1)
                System.out.printf("\nO número %d não foi encontrado!", numero);

        		}
			}

		}
		
	
	
//Exercicio2
package JavaGeneration;

import java.util.Scanner;

public class ExeVetor2 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner (System.in);
		int [] num = new int [10];
		float media,soma=0;
		
		num[0]=2;
		num[1]=5;
		num[2]=1;
		num[3]=3;
		num[4]=4;
		num[5]=9;
		num[6]=7;
		num[7]=8;
		num[8]=10;
		num[9]=6;
		
		System.out.println("\nElementos Impares..");
		for(int i=0;i<10;i++) {
			
			if(i % 2 == 1) {
				System.out.printf("%d - ",num[i]);
			
			}
			soma += num[i];
			
		}
		media = soma/10;
		
		
		System.out.println("\nElementos Pares..");
		for(int i=0;i<10;i++) {
			
			if(num[i] % 2 == 0) {
				System.out.printf("%d - ",num[i]);
			
			}
			
		}
		System.out.printf("\nSoma de todos os elemntos do array: "+soma);
		System.out.printf("\nSoma de todos os elemntos do array: "+media);

	}
	
}

//Exercicio3
package JavaGeneration;
import java.util.Scanner;
public class Matriz3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        float num[][] = {{1,2,3},{4,5,6},{7,8,9}},somaPrincipal=0,somaSecundaria=0;
        int linha;
		float coluna;
        
        System.out.println("\nElementos da Diagonal Principal: ");
        for(linha=0;linha<3;linha++);{
            System.out.println(num[(int) linha][linha]);
            somaPrincipal=num[linha][(int) (3-1l)];
            
        }
        System.out.println("\nElementos da Diagonal Secundaria: ");
        for(linha=0;linha<3;linha++);{
            System.out.println(num[linha][3-1-linha]);
        }
        System.out.printf("\nSoma dos Elementos da Diagonal Principal: ",num[0][0]+num[1][1]+num[2][2]);
        System.out.printf("\nSoma dos Elementos da Diagonal Secundaria: ",num[0][2]+num[1][1]+num[2][0]);
	}
}

