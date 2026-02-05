import java.util.Scanner;
public class Ex02Vetores {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	final int TAM=10;
	int a[], b[], c[], i;
	a = new int [TAM];
	b = new int [TAM];
	c = new int [TAM];
	for (i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+"° valor de A");
		a[i] = in.nextInt();
	}
	for (i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+"° valor de B");
		b[i] = in.nextInt();
		c[i] = a[i]+b[i];
	}
    System.out.print("\nC = [ ");
    for (i=0; i<TAM; i++) {
    	System.out.print(c[i]+ " ");
    }
System.out.println("]");
	}
}
