package lista2;

/*Implemente um programa que gera e escreve os números ímpares entre 100 e 200.*/

public class ex6 {
	
public int impares(){
		
		int impar = 100;
		
		while(impar < 200) {
			if(impar % 2  != 0) { 
				System.out.println(impar);
			}
		impar++;

		}//fim while
		
		return impar;
	}//fim metodo
		}

