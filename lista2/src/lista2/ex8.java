package lista2;

import java.util.Scanner;

/*Implemente um programa que leia um valor inicial A e imprima a sequência de 
 * valores do cálculo de A! e o seu resultado. Ex: 5! = 5 ∗ 4 ∗ 3 ∗ 2 ∗ 1 =120*/

//calculo de fatorial
public class ex8 {

	public int fatorial(){
		 Scanner input = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int a = input.nextInt();

	        while (a < 0) {
	            System.out.print("Número inválido");
	            a = input.nextInt();
	        } // fim while

	        int fatorial = 1;
	        System.out.printf("%d! = ", a);
	        for (int contador = a; contador >= 1; contador--) {
	            fatorial *= contador;
	            if (contador == 1) {
	                System.out.printf("%d = %d", contador, fatorial);
	            } else {
	                System.out.printf("%d * ", contador);
	            }
	        } // fim for
			return a;	       
	    } //fim metodo
	}

