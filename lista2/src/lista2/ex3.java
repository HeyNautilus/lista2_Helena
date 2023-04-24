package lista2;

/*Implemente um programa que leia um número não determinado de valores e calcule e escreva 
 * a média aritmética dos valores lidos, a quantidade de valores positivos, 
 * a quantidade de valores negativos e o percentual de valores negativos e positivos.*/

import java.util.Scanner;

public class ex3 {
	
	int contador = 0;
	int valores = 0;
	int soma = 0;
	int negativos = 0;
	int positivos = 0;
	float media = 0; // se colocar double fica um número muito grande
	int percentualP = 0; // percentual positivo
	int percentualN = 0; // percentual negativo
	
	public int valoresAleatorios() {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.printf((contador + 1) + " Digite um número: ");
			valores = input.nextInt();
			contador++;
			
			if(valores > 0) {
				soma += valores;
				positivos++;
			} else if (valores < 0) {
				negativos++;
			}
			
			if (valores == 0) { // definir um número porque se não nunca vai parar,
				break;          //poderia ter colocado no parametro do while também
			}
		} // fim while
		
        media = soma / contador;
        percentualP = (positivos * 100) / contador;
        percentualN = (negativos * 100) / contador;
        
      
        
        return contador;
		
	} // fim do metodo
	
	public void mostraTudo() {
		    System.out.println("A quantidade de números digitados foi " + contador);
	        System.out.println("A média é " + media); 
	        System.out.println("O percentual positivo é " + percentualP + "%");
	        System.out.println("O percentual negativo é " + percentualN + "%") ;
	} // fim do metodo 
	
}
