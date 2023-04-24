package lista2;

import java.util.Scanner;

/*Implemente um programa que leia uma quantidade não determinada de números positivos. 
 * Calcule a quantidade de números pares e ímpares, a média de valores pares e 
 * a média geral dos números lidos. O número que encerrará a leitura será zero.*/

public class ex5 {

	int contador = 0;
	int somaPar = 0;
	int somaImpar = 0;
	int impar = 0;
	int par = 0;
	int positivo = 1;
	int mediaPar = 0; 
	float mediaImpar = 0; 
	float mediaG = 0;
	
	public int numParImpar() {
		
		Scanner input = new Scanner(System.in);
	
		while(positivo > 0) {
			System.out.printf((contador + 1) + " Digite um número: ");
			positivo = input.nextInt();
			contador++;
			
			if(positivo % 2 == 0 && positivo != 0) { // se não colocar ser diferente de 0, 
				par++;                               //ele conta 0 como número par
				somaPar += positivo;
			} else  {
				somaImpar += positivo;
				impar++;
			}
			
			if (positivo == 0) { 
				break;          
			}
		} // fim while
			
		
        
        mediaPar = somaPar / par;
        mediaImpar = somaImpar / impar;
        mediaG = (somaPar + somaImpar) / contador;
        
      
        
        return contador;
		
	} // fim do metodo
	
	public void mostraInfo() {
		    System.out.println("A quantidade de números pares digitados foi " + par);
		    System.out.println("A quantidade de números impares digitados foi " + impar);
	        System.out.println("A média dos pares é " + mediaPar); 
	        System.out.println("A média dos ímpares é " + mediaImpar);
	        System.out.println("A média geral é " + mediaG);
	        
	        
	} // fim do metodo mostra o que foi solicitado
	
}


