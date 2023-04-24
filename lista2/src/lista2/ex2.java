package lista2;

import java.util.Scanner;

/*Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e mostrar:
• A menor altura do grupo;
• A maior altura do grupo.*/

//Para a contagem quando 15 pessoas inserirem a altura
// Condição de passar todas as alturas e selecionar o menor e o maior número
// variaveis para altura, contador, menor e maior alturas

public class ex2 {
	
	public double alturaPessoas() {
		
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		double altura = 0, maior = 0, menor = 0;
		
		for(contador = 0; contador < 15; contador++) {
			System.out.printf((contador + 1) + " Digite sua altura: ");
			altura = input.nextDouble();
			
			if(contador == 0) { // se não usar esse if a menor altura vai retornar 0.0 sempre
				maior = altura;
				menor = altura;
			} else {
			if (altura < menor){
	               menor = altura;
	           } 
			if (altura > maior) {
                  maior = altura;
           } 
			} // fim else
			
		      } //fim for
		System.out.println("A maior altura do grupo é de " + maior + " , e a menor é de " + menor);
		
		return altura;
	} // fim metodo
}
