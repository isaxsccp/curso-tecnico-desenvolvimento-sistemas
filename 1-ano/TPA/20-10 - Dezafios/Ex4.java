import java.util.Scanner;
public class Ex4 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       final int TAM = 11;
       int[] a = new int[TAM];
       for (int i = 0; i < TAM; i++) {
           a[i] = 1 << i;
       }
       for (int i = 0; i < TAM; i++) {
           System.out.println("A[" + i + "] = " + a[i]);
       }
   }
}
