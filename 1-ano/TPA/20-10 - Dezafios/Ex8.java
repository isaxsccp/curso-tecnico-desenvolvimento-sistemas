import java.util.Scanner; 
public class Ex8 { 
    public static void main(String[] args) { 

        int[] vetorA = new int[10]; 
        int tamanhoVetor = 10; 

        // Preencher o vetor com 10 elementos inteiros 

        Scanner scanner = new Scanner(System.in); 

        for (int i = 0; i < tamanhoVetor; i++) { 
            System.out.print("Digite o elemento " + (i + 1) + ": "); 
            vetorA[i] = scanner.nextInt(); 
        } 

        // Pedir ao usuário para inserir o elemento a ser buscado 

        System.out.print("Digite o elemento a ser buscado: "); 
        int elementoX = scanner.nextInt(); 

        // Realizar a busca 
      
        int i; 

        for (i = 0; i < tamanhoVetor; i++) { 
            if (vetorA[i] == elementoX) { 

                // Elemento encontrado 

                System.out.println("O elemento " + elementoX + " está presente no vetor."); 
                break; // Sai do loop ao encontrar o elemento 
            } 
        } 

        // Se i atingir o tamanho do vetor, significa que o elemento não foi encontrado 

        if (i == tamanhoVetor) { 
            System.out.println("O elemento " + elementoX + " não está presente no vetor."); 
        } 
    } 
} 
