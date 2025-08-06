import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //cria o scanner para ler os dados do terminal
        var scanner = new Scanner(System.in);

        //inicia as variáveis para a conta
        int numeroConta;
        float saldo;
        String agencia;
        String nomeCliente;

        //Exibe as mensagens para o usuário
        //Alimenta as variáveis com os dados inseridos pelo usuário 
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da da sua conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, insira o valor do seu depósito inicial:");
        saldo = scanner.nextFloat();

        //Exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

    }
}
