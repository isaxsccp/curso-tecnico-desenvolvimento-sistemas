import java.util.Random; 
public class Ex2 { 
    public static void main(String[] args) { 
        
        int v[][] = new int[3][4]; 
        int maior = -100; 
        int menor = 100; 
        int linhaMA = 0, colunaMA = 0; 
        int linhaME = 0, colunaME = 0; 
        int numInfo = 0; 

        Random in = new Random(); 

            System.out.println("digita ae mano"); 
            numInfo= in.nextInt(); 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                v[i][j] = in.nextInt() % 10; 
            } 
        } 

        for (int i = 0; i < 3; i++) { 
            System.out.println(); 
            for (int j = 0; j < 3; j++) { 
                System.out.print("[ " + v[i][j] + "] "); 
            } 
        } 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                if (v[i][j] > maior) { 
                    maior = v[i][j]; 
                    linhaMA = i + 1; 
                    colunaMA = j + 1; 
                } 

                if (v[i][j] < menor) { 
                    menor = v[i][j]; 
                    linhaME = i + 1; 
                    colunaME = j + 1; 
                } 
            } 
        } 

        System.out.println(" "); 
        System.out.println(" "); 
        System.out.println("O número maior é: " + maior + " localizado na linha " + linhaMA + " e na coluna " + colunaMA); 
        System.out.println("O número menor é: " + menor + " localizado na linha " + linhaME + " e na coluna " + colunaME); 
    } 
} 
 

