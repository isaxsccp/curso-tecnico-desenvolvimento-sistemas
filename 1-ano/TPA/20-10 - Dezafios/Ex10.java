import java.util.Scanner; 
public class Ex10 { 
    public static void main(String[] args) { 

        int[] vetorA = new int[10]; 
        Scanner scanner = new Scanner(System.in); 

        // Ler o vetor A 

        for (int i = 0; i < 10; i++) { 
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: "); 
            vetorA[i] = scanner.nextInt(); 
        } 

        // Ordenar o vetor A em ordem crescente 

        for (int i = 0; i < vetorA.length - 1; i++) { 
            for (int j = i + 1; j < vetorA.length; j++) { 
                if (vetorA[i] > vetorA[j]) { 

                    // Trocar os elementos se estiverem fora de ordem 

                    int temp = vetorA[i]; 
                    vetorA[i] = vetorA[j]; 
                    vetorA[j] = temp; 
                } 
            } 
        } 

        // Exibir o vetor A ordenado 

        System.out.print("Vetor A em ordem crescente: "); 

        for (int i = 0; i < 10; i++) { 
            System.out.print(vetorA[i] + " "); 
        } 
    } 
} 
