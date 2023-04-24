package lista2;

/*Implemente um programa que leia um valor para uma variável N de 1 a 10 e 
 * calcule a tabuada de N. 
 * Mostre a tabuada na forma: 0 ∗ N = 0, 1 ∗ N = 1N, 2 ∗ N = 2N, · · · , 10 ∗ N = 10N.*/

import java.util.Scanner;

public class ex7 {

	public int tabuada(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número entre 1 e 10: ");
        int n = input.nextInt();

        while (n < 1 || n > 10) {
            System.out.print("Número inválido, digite um número entre 1 e 10: ");
            n = input.nextInt();
        } // fim while

        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("%d * %d = %d\n", contador, n, contador * n); 
        } // fim for
		return n;
	} //fim metodo
	
}
