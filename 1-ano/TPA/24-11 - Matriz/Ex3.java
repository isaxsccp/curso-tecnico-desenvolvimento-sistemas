import java.util.Scanner; 
public class Ex3 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        // Solicitar os valores da matriz ao usuário 

        System.out.println("Digite os valores da matriz (3x3):"); 
        int[][] matriz = new int[3][3]; 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Matriz[" + i + "][" + j + "]: "); 
                matriz[i][j] = scanner.nextInt(); 
            } 
        } 

        // Calcular a soma das linhas e atualizar a última coluna 

        for (int i = 0; i < 3; i++) { 
            int soma = 0; 
            for (int j = 0; j < 3; j++) { 
                soma += matriz[i][j]; 
            } 
            matriz[i][3] = soma; 
        } 

        // Imprimir a matriz resultante 
        System.out.println("Matriz resultante:"); 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.print(matriz[i][j] + " "); 
            } 

            System.out.println(); 
        } 
    } 
} 
