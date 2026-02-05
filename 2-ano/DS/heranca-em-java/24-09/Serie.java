public class Serie extends Conteudo {
    private int duracaoPorEpisodio;
    private int quantEpisodios;
    private int quantTemporadas;

    public Serie(String categoria, String titulo, int duracaoPorEpisodio, int quantEpisodios, int quantTemporadas) {
        super(categoria, titulo);
        this.duracaoPorEpisodio = duracaoPorEpisodio;
        this.quantEpisodios = quantEpisodios;
        this.quantTemporadas = quantTemporadas;
    }

    // Sobreescrita do método 
    @Override
    public String descricao() {
        return super.descricao() + "// Duração por Episódio: " + this.duracaoPorEpisodio +
               " minutos// Episódios: " + this.quantEpisodios + "// Temporadas: " + this.quantTemporadas;
    }
}
