import java.util.Scanner;
public class Ex04Vetores {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			   
		       final int TAM=10;
		       int a[], b[], i, soma=0;
		       double media;
		       a = new int[TAM];
		       
		       for (i=0; i<TAM; i++) {
					System.out.println("Digite o "+(i+1)+"° valor de A");
					a[i] = in.nextInt();
					soma = a[i]+soma;
		
		       }
		       media = soma/TAM;
		       System.out.println("A média dos valores de A é: "+media);
			   
		       }
   }
