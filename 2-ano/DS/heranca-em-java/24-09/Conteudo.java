public class Conteudo {
    private String categoria;
    private String titulo;

    public Conteudo(String categoria, String titulo) {
        this.categoria = categoria;
        this.titulo = titulo;
    }

    // Getters e Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método Descrição
    public String descricao() {
        return "Categoria: " + this.categoria + "// Título: " + this.titulo;
    }
}
