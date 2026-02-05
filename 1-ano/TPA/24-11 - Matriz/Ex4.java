import java.util.Random; 
import java.util.Scanner; 
public class Ex4 { 
    public static void main(String[] args) { 


      // fiquei com muita duvid nao tenho eclipse pra testar ai vamo na fé vem mb
        int[][] cartela = new int[4][4]; 
        Random random = new Random(); 
        int rodadas = 0; 
        int numerosRestantes = 16 * 75; // Total de números possíveis 

        // Preencher cartela aleatoriamente 

        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                cartela[i][j] = random.nextInt(75) + 1; 
            } 
        } 

        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.print(cartela[i][j] + "\t"); 
            } 
            System.out.println(); 
        } 

        // Jogar Bingo 
        while (numerosRestantes > 0) { 

            Scanner scanner = new Scanner(System.in); 
            System.out.print("Digite o número chamado (ou 0 para sair): "); 
            int numeroChamado = scanner.nextInt(); 

            if (numeroChamado == 0) { 
                System.out.println("Você saiu do jogo."); 
                break; 
            } 
          
            int acertos = 0; 

            // Verificar se o número está na cartela 

            for (int i = 0; i < 4; i++) { 
                for (int j = 0; j < 4; j++) { 

                    if (numeroChamado == cartela[i][j]) { 
                        acertos++; 
                        cartela[i][j] = 0; // Marcar número na cartela 
                        numerosRestantes--; 
                        break; 
                    } 
                } 
            } 

            if (acertos > 0) { 
                System.out.println("Parabéns, você acertou " + acertos + " número(s)!"); 
            } else { 
                System.out.println("Número não encontrado na cartela."); 
            } 
            rodadas++; 
        } 

        System.out.println("BINGO! Você acertou todos os números."); 
        System.out.println("Você jogou " + rodadas + " rodadas."); 
    } 
} 
