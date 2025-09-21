import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria(1000.00); // Saldo inicial de R$1000

        int opcao;
        do {
            System.out.println("\n--- Simulador de Caixa Eletrônico ---");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + minhaConta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o simulador. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}