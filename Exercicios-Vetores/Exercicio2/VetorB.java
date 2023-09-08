/*
	Escreva um programa para ler um vetorB de 15 posições e imprimir em ordem invertida.
 */


public class VetorB {
	
	public static void main (String[] args) {
		
		int[] vetorB = new int[]{
			
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
			
			};
		
		
		for(int i = 14;  i >= 0; i-- ){
			 
			 System.out.println(vetorB[i]);
			
			}
		
		
		
		
	}
}

