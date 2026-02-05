import java.util.Scanner;
public class Prova {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       final int TAM = 20;
       //criou a constante TAM de tamanho 20
       int[] A = new int[TAM];
       int[] B = new int[TAM];  //criou 2 vetores de tipo inteiro de 20 posições
       int par = 0;  //variavel par iniciando com 0 q é o primeiro par
       int impar = TAM - 1;  //variavel impar iniciada com valor do TAM(tamanho) -1 pq é impar
       System.out.println("Digite os numeros do vetor A:");
       for (int i = 0; i < TAM; i++) {  //abriu o laço, iniciou o contador valendo 0 e enquanto o valor digitado for menor q TAM ele vai incrementar e apres. o syso abaixo/ler o num
           System.out.print("Nuemro " + (i + 1) + ": ");
           A[i] = scanner.nextInt(); //leu ate os 20 (TAM) blz
       }
       for (int i = 0; i < TAM; i++) { //outro laço p calcular os pares
           if (A[i] % 2 == 0) { //se o num digitado for divisível por 2..
               B[par] = A[i]; //..o vetor b[par] recebe os valores digitados
               par++; //incrementa o par
           } else {
               B[impar] = A[i]; //senao (b[impar] recebe os valores digitados
               impar--; // desincrementa o impar
           }
       }
       System.out.print("Vetor B (pares e ímpares): ");
       for (int i = 0; i < TAM; i++) {
           System.out.print(B[i] + " ");
       }
   }
}
