import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Produto p1 = new Produto();
		
		System.out.println("Informe o nome do produto");
		p1.setNome (in.next());
		System.out.println("Informe o preço de custo do produto");
		p1.setPrecoCusto (in.nextDouble());
		System.out.println("Informe o preço de venda do produto");
		p1.setPrecoVenda (in.nextDouble());
		
		System.out.println("O nome do Produto é: "+p1.getNome());
		System.out.println("A margem de lucro do produto é R$ "+ p1.calcularMargemLucro());
		System.out.println("A porcetagem da margem de lucro do produto é de "+p1.getMargemLucroPorcentagem()+"%");
	}
	}
