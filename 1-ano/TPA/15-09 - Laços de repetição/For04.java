public class For04 {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int idadeMaisVelho = 0;
       int idadeMaisNovo;

       for (int i = 1; i <= 10; i++) {
           System.out.print("Digite o ano atual: ");
           int anoAtual = scanner.nextInt();

           System.out.print("Digite o ano de nascimento do usuário " + i + ": ");
           int anoNascimento = scanner.nextInt();

           int idade = anoAtual - anoNascimento;

           if (idade > idadeMaisVelho) {
               idadeMaisVelho = idade;
           }
           if (idade < idadeMaisNovo) {
               idadeMaisNovo = idade;
           }

           System.out.println("A idade do usuário " + i + " é " + idade + " anos.");
       }

       System.out.println("A idade do mais velho é " + idadeMaisVelho + " anos.");
       System.out.println("A idade do mais novo é " + idadeMaisNovo + " anos.");

       scanner.close();
   }
