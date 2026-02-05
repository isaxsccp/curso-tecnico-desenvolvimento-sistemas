public class DoWhile02 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char sexo;
       double pesoIdeal, altura;
       int continuar;

       do {
           System.out.print("Informe o sexo (F - Feminino ou M - Masculino): ");
           sexo = scanner.next().charAt(0);

           System.out.print("Informe a altura em centímetros: ");
           altura = scanner.nextDouble();

           if (sexo == 'M') {
               pesoIdeal = 52 + (0.75 * altura - 152.4);
           } else {
               pesoIdeal = 52 + (0.67 * altura - 152.4);
           }
           System.out.println("O seu peso ideal é: " + pesoIdeal + " kg");

           System.out.print("Deseja continuar a execução? (1 - SIM ou 2 - NÃO): ");
           continuar = scanner.nextInt();

       } while (continuar != 2);

       scanner.close();
   }
}
