import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        //Conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in);



        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, informe o numero da conta! ");
        numeroConta = Integer.parseInt(sc.nextLine());

        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Informe agora o número da Agência! ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente! ");
        nomeCliente = sc.nextLine();

        System.out.println("Agora, informe o saldo da conta! ");
        saldo = sc.nextDouble();
        

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma nova conta conosco, sua agência é " +
        agencia + ", conta " + numeroConta + " e seu saldo "
        + saldo + " já está disponível para movimentação.");


        sc.close();
    }
}
