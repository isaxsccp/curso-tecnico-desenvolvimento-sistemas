import java.util.Scanner; 
public class Ex7 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        int tamanho = 10; 
        int[] vetorA = new int[tamanho]; 
        int[] vetorB = new int[tamanho]; 
        int[] vetorC = new int[tamanho]; 

        // Preencher vetor A com valores fornecidos pelo usuário 

        System.out.println("Digite os valores para o vetor A:"); 

        for (int i = 0; i < tamanho; i++) { 
            System.out.print("Valor " + (i + 1) + ": "); 
            vetorA[i] = scanner.nextInt(); 
        } 
        // Preencher vetor B com valores fornecidos pelo usuário 

        System.out.println("Digite os valores para o vetor B:"); 

        for (int i = 0; i < tamanho; i++) { 
            System.out.print("Valor " + (i + 1) + ": "); 
            vetorB[i] = scanner.nextInt(); 
        } 

        // Encontrar a diferença dos conjuntos A e B 

        int tamanhoC = 0; 
      
        for (int i = 0; i < tamanho; i++) { 
            int elementoA = vetorA[i]; 
            int j = 0; 

            // Verificar se o elementoA pertence a vetorB 

            while (j < tamanho && vetorB[j] != elementoA) { 
                j++; 
            } 
          
            // Se j atingir o tamanho, o elemento não pertence a vetorB 

            if (j == tamanho) { 
                vetorC[tamanhoC++] = elementoA; 
            } 
        } 

        // Exibir vetor C (diferença dos conjuntos A e B) 

        System.out.println("Vetor C (Diferença de A e B):"); 
      
        for (int i = 0; i < tamanhoC; i++) { 
            System.out.print(vetorC[i] + " "); 
        } 
    } 
}
} 
