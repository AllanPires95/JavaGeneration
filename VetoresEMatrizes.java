package JavaGeneration;
import java.util.*;
public class VetoresEMatrizes {

	public static void main(String[] args) {
		   //Exercicio 1
		  
	    int aux;
	    int listaNumerica[] = {2, 5, 1, 3, 4, 9, 7, 8, 100, 6};
	    //inteiro tamanhoDoVetor = u.numero_elementos(listaNumerica) 

	    System.out.println("listaNumerica");

	    for(int x = 0; x < 10; x++) {
	      
	      for(int y = 0; y < 10; y++) {
	        
	        if(listaNumerica[x] > listaNumerica[y]){
	         
	          aux = listaNumerica[x];
	          listaNumerica[x] = listaNumerica[y];
	          listaNumerica[y] = aux;
	        }
	      }
	  
	    }
	  System.out.printf("\n", listaNumerica);

	    //Exercicio 2

	    int elementoslista[] = {2,5,1,3,4,9,7,8,10,6};
	    int elementosIndicesPares[5];
	    int indice01 = 0;
	    int elementosPares[5];
	    int indice02 = 0;
	    int somaElementos = 0;
	    int mediaElementos;

	    int tamanhoLista = u.numero_elementos(elementoslista);

	    for(inteiro x = 0; x < tamanhoLista; x++) {

	      if(x % 2 == 0){
	        elementosIndicesPares[indice01] = elementoslista[x];
	        indice01++;
	      }
	      
	      if(elementoslista[x] % 2 == 0){
	        elementosPares[indice02] = elementoslista[x];
	        indice02++;
	      }

	      somaElementos += elementoslista[x];
	    }
	      mediaElementos = somaElementos / tamanhoLista;

	      System.out.printf("\nElementos nos Ã­ndices pares: \n", elementosIndicesPares);
	      System.out.printf("\nElementos pares: \n", elementosPares);
	      System.out.printf("\nSoma: \n", somaElementos);
	      System.out.printf("\nMÃ©dia: \n", mediaElementos); 

	      //Exercicio 3

	    
	    int listaDiagonais[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
	    int somaPrincipal = 0;
	    int somaSecundaria = 0;

	    System.out.println("\nElementos da Diagonal Principal:\n");

	    for(inteiro x = 0; x < 3; x++) {
	      for(inteiro y = 0; y < 3; y++) {
	        if(x == y){
	          System.out.print(listaDiagonais[x][y]);
	          somaPrincipal += listaDiagonais[x][y];
	        }
	      }
	    }

	    System.out.println("\nElementos da Diagonal SecundÃ¡ria:\n");

	    for(inteiro x = 0; x < 3; x++) {
	      for(inteiro y = 0; y < 3; y++) {

	        if((x == 1 e y == 1) ou (x == 0 e y == 2) ou (x == 2 e y == 0)){;
	          System.out.println(listaDiagonais[x][y]);
	          somaSecundaria += listaDiagonais[x][y];
	        }
	      }
	    }

	    System.out.println("\nSoma dos Elementos da Diagonal Principal:\n", somaPrincipal);
	    System.out.println("\nSoma dos Elementos da Diagonal SecundÃ¡ria:\n", somaSecundaria);


	    //Exercicio 4

	    real notasLista[10][4] = {{4,5,7,3},{2.5,6.5,4.7,8},{10,8.5,9.5,8},;
	      {9,6.5,7.6,8.2},{5,5,5,6.3},{7,8,9,8.5},{5.5,3.5,2.5,1},;
	      {8,9,10,9.5},{5.6,5.8,6.5,7},{7.5,8.5,9.5,10}};

	    for(inteiro x = 0; x < 10; x++) {
	      real mediaAluno = 0;
	      for(inteiro y = 0; y < 4; y++) {
	        mediaAluno += notasLista[x][y];
	      }
	      mediaLista[x] = mat.arredondar(mediaAluno / 4, 1);
	    }
	    System.out.println("Média de Alunos:\n");
	    for(inteiro x = 0; x < 10; x++){
	      cadeia espaco= " | ";

	      if(x == 0)
	        espaco = ""
	      System.out.println("espaco, mediaLista[x]");
	    }
	  }
}
