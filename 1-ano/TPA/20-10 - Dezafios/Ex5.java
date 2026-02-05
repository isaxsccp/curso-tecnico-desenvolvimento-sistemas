public class Ex5 { 
    public static void main(String[] args) { 

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; 
        int[] vetorB = new int[vetorA.length]; 

        System.out.println("Vetor A:"); 
        for (int i = 0; i < 15; i++) { 
            System.out.print(vetorA[i] + " "); 
        } 

        System.out.println(); 
        System.out.println("Vetor B (fatoriais):"); 

        for (int i = 0; i < 15; i++) { 
            int fatorial = 1; 
            for (int j = 1; j <= vetorA[i]; j++) { 
                fatorial *= j; 
            } 
            vetorB[i] = fatorial; 
            System.out.print(fatorial + " "); 
        } 
        System.out.println(); 
    } 
