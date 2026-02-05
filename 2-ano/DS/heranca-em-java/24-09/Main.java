import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Armazenando filmes e séries
        ArrayList<Conteudo> catalogo = new ArrayList<>();

        // Adicionando exemplos de filmes e séries
        catalogo.add(new Filme("Filme", "O Rei Leão", 120));
		catalogo.add(new Filme("Filme", "O Senhor dos Anéis - O Retorno do Rei", 90));
		catalogo.add(new Filme("Filme", "Batman - O Cavaleiro Das Trevas", 140));
		catalogo.add(new Filme("Filme", "Vingadores: Ultimato", 90));
		catalogo.add(new Filme("Filme", "Parasita", 100));

		catalogo.add(new Serie("Série", "Game of Thrones", 50, 20, 8));
		catalogo.add(new Serie("Série", "Mad Men ", 60, 30, 7));
		catalogo.add(new Serie("Série", "Breaking Bad.", 60, 40, 10));
		catalogo.add(new Serie("Série", "Stranger Things", 50, 40, 5));
		catalogo.add(new Serie("Série", "Impuros", 40, 20, 4));


        // Laço para exibir a descrição de cada conteúdo presente no catálogo
        for (Conteudo conteudo : catalogo) {
            System.out.println(conteudo.descricao());
        }
    }
}
