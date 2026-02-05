import java.util.Scanner; 
public class Ex9 { 
    public static void main(String[] args) { 

        int[] vetorA = new int[10]; 
        Scanner scanner = new Scanner(System.in); 
        int tamanhoVetor = vetorA.length; 

        for (int i = 0; i < 10; i++) { 
            System.out.print("Digite o elemento " + (i + 1) + ": "); 
            vetorA[i] = scanner.nextInt(); 
        } 

        int i; 

        for (i = 0; i < tamanhoVetor / 2; i++) { 
            if (vetorA[i] != vetorA[tamanhoVetor - 1 - i]) { 
                System.out.println("O vetor não é um palíndromo."); 
                break; 
            } 
        } 

        if (i == tamanhoVetor / 2) { 
            System.out.println("O vetor é um palíndromo."); 
        } 
    }
}
