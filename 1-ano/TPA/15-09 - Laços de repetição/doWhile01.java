public class DoWhile01 {
   public static void main(String[] args) {
       int numero = 0;
       do {
           if (numero % 2 == 0) {
               System.out.println(numero);
           }
           numero++;
       } while (numero <= 500);
   }
}
