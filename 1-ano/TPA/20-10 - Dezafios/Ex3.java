package javatpa;
import java.util.Scanner;
public class Ex3 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
			int a[];
	        a = new int[10];
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Digite o numero " + (i + 1) + ": ");
	            a[i] = in.nextInt();
	            if (a[i] <= 1) {
	                System.out.println(a[i] + " não é primo");
	            } else {
	                int j;
	                for (j = 2; j < a[i]; j++) {
	                    if (a[i] % j == 0) {
	                        System.out.println(a[i] + " não é primo");
	                        break;
	                    }
	                }
	                if (j == a[i]) {
	                    System.out.println(a[i] + " é primo");
	                }
	            }
	        }
	    }

	}
