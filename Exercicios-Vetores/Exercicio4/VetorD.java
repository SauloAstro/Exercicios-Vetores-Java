/*
	Escreva um programa para ler um vetor D de N posições, onde N é menor ou igual a 20 e imprimir seus elementos
	o usuário deve informar o número de posições e os elementos. o programa deve valida a quantidade de posições, não permitindo que
	o usuario forneça um valor inválido
 */


import java.util.Scanner;
public class VetorD {
	
	public static void main (String[] args) {
		
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nInsira a quantidade de elementos dentro de um vetor : ");
		
		do{
		
			n = sc.nextInt();
			
			if(n > 0 && n <= 20 )
			{
			
			int[] vetorD = new int[n];
			
			for(int i = 0;  i < vetorD.length; i++)
			{
					
				System.out.print("Digite o valor da posição " + (i+1) + " : ");
				vetorD[i] = sc.nextInt();
			}
			
			for(int i = 0;  i < vetorD.length; i++)
			{
				
			System.out.println(vetorD[i]);
			
			}
			
			break;
			
			
				
				
			}
			
			
			
			
			else{
				
				System.out.print("Quantidade Invalida tente novamente : ");
				
				}
		
		
			
		
		
		
			
			
		}while( !(n < 0) || !(n > 20));
	}
}

