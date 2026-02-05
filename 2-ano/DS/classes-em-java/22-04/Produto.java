public class Produto {

	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	String getNome() {

		return this.nome;
		}

	void setNome(String nome) {
		this.nome = nome;
	}

	double getPrecoCusto() {
		return this.precoCusto;

		}

	void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	double getPrecoVenda() {
		return this.precoVenda;

		}

	void setPrecoVenda(double precoVenda) {

		if (precoVenda > precoCusto) {
			this.precoVenda = precoVenda;

		}else {
			System.out.println("ERRO : O preço de venda não pode ser inferior ao preço de custo.");
		}
	}

	double getMargemLucro() {
		return this.margemLucro;
		}

	void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
		
	}

	double  calcularMargemLucro() {

		double margem = this.precoVenda - this.precoCusto;
		this.setMargemLucro(margem);

		return getMargemLucro();

	}

	double  getMargemLucroPorcentagem() {

		return (this.getMargemLucro() / this.precoCusto)*100;

	}
}
