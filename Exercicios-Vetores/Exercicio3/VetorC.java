/*
	Escreva um programa parar ler um vetor C de N posições, onde 
	N é menor ou igual a 20 e imprimir seus elementos. Usuário deve informar o número de posições e os elementos 
 */


import java.util.Scanner;
public class VetorC {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamanhoVetor = 0;
		
		System.out.print("Digite o tamanho do vetor : " );
		tamanhoVetor = sc.nextInt();
		
		if(tamanhoVetor > 0 && tamanhoVetor <= 20)
		{
		
				int[]vetorC = new int[tamanhoVetor];
				
				
				for(int i = 0; i < tamanhoVetor; i++)
				{
				
				System.out.print("Digite o valor da posição " + (i+1) + " : ");
				vetorC[i] = sc.nextInt();	
				
				
				}
				
				System.out.println("Elementos");
				
				for(int i = 0; i < tamanhoVetor; i++){
					
					System.out.print(vetorC[i] + ", ");
					
					}
				
					
				
			
		}
		else{
			 System.out.println("o numero tem que ser maior que zero ou menor ou igual a 20");
			 System.exit(0);
			}
		
			
			
		
	
	
		
	}
}

