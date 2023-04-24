package lista2;

/*Implemente um programa que leia uma quantidade desconhecida de números e 
 * conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
 * A entrada de dados deve terminar quando for lido um número negativo.*/

import java.util.Scanner;

public class ex4 {
	int valor = 0;
	int contador = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int soma = 0;
	
	public int intervalos() {
		
		Scanner input = new Scanner(System.in);
		
		while(valor >= 0) { // condição para parar quando entrar um número negativo
			System.out.printf((contador + 1) + " Digite um número: ");
			valor = input.nextInt();
			contador++;
			
			if(valor >= 0 && valor <= 25) {
				soma += valor;
				a++;
			} else if(valor >= 26 && valor <= 50) {
				soma += valor;
				b++;
			} else if(valor >= 51 && valor <= 75) {
				soma += valor;
				c++;
			} else if(valor >= 76 && valor <= 100) {
				soma += valor;
				d++;
		    } else {
		    	System.out.println("** Esse número não está entre nenhum intervalo");
		    } // caso for digitado um número maior que 100 ou um número negativo, mas ai se for negativo a contagem para
	    } //fim while
		
			return valor;
	} //fim metodo
	public void mostraIntervalo() {
		    System.out.println("A quantidade de números no intervalo [0 - 25] é:  " + a);
	        System.out.println("A quantidade de números no intervalo [26 - 50] é: " + b); 
	        System.out.println("A quantidade de números no intervalo [51 - 75] é: " + c);
	        System.out.println("A quantidade de números no intervalo [76 - 100] é: " + d);
	}
}