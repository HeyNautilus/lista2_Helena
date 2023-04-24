package lista2;

/*Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de três e 
 * que se encontram no conjunto dos números de 1 até 500.*/

public class ex1 {
	
	public int efetuaSomaImpares(){
		
		int contador = 1;
		int total=0;
		while(contador < 500) {
			int resto= contador %3;
			int impar = contador %2; // se for 0 é par, se não, é impar
			if(resto == 0 && impar == 1) { //sou multiplo de 3
				total = total + contador;
			}
			contador++;
		}//fim while
		
		return total;
	}//fim metodo
}
