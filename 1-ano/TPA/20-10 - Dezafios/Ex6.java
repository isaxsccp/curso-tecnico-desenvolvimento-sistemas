import java.util.Scanner; 
public class Ex6 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        int[] vetorA = new int[10]; 
        int[] vetorB = new int[10]; 
        int[] vetorC = new int[10]; 

        // Preencher vetor A com valores fornecidos pelo usuário 
        System.out.println("Digite os valores para o vetor A:"); 

        for (int i = 0; i < 10; i++) { 
            System.out.print("Valor " + (i + 1) + ": "); 
            vetorA[i] = scanner.nextInt(); 
        } 

        // Preencher vetor B com valores fornecidos pelo usuário 

        System.out.println("Digite os valores para o vetor B:"); 

        for (int i = 0; i < 10; i++) { 
            System.out.print("Valor " + (i + 1) + ": "); 
            vetorB[i] = scanner.nextInt(); 
        } 

        int tamanhoC = 0; 
      
        // Encontrar a interseção dos vetores A e B 

        for (int elementoA : vetorA) { 
            for (int elementoB : vetorB) { 
                if (elementoA == elementoB) { 
                    vetorC[tamanhoC++] = elementoA; 
                    break; // Avança para o próximo elemento em A 
                } 
            } 
        } 
      
        // Exibir vetor C (interseção) 

        System.out.println("Vetor C (Interseção de A e B):"); 

        for (int i = 0; i < tamanhoC; i++) { 
            System.out.print(vetorC[i] + " "); 
        } 
    } 
} 
