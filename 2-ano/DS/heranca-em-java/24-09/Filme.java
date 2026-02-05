public class Filme extends Conteudo {
    private int duracao;

    public Filme(String categoria, String titulo, int duracao) {
        super(categoria, titulo);
        this.duracao = duracao;
    }

    // Sobreescrita do método
    @Override
    public String descricao() {
        return super.descricao() + "// Duração: " + this.duracao + " minutos";
    }
}
