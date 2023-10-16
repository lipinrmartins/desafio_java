import java.util.Scanner;

public class DesafioProposto {
    public static void main(String[] args) {
        String nome = "Fulano de Tal";
        String tipoDeConta = "Conta Corrente";
        double saldoConta = 1599.00;
        int escolhaOperacao = -1;

        while (escolhaOperacao != 4){
            String menuOperacoes = String.format("""
                    Operações:
                    1 - Consultar saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair Aplicação
                    
                    Digite a opção desejada:""");
            System.out.println(menuOperacoes);
            int operacao = new Scanner(System.in).nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Saldo da conta R$ " + saldoConta);
                    continue;

                case 2:
                    System.out.println("Informe o valor do Depósito:");
                    double receberValor = new Scanner(System.in).nextDouble();
                    saldoConta += receberValor;
                    System.out.println("Você depositou a importância de R$ " + receberValor);
                    System.out.println("Saldo Atulizado R$ " + saldoConta);
                    continue;

                case 3:
                    System.out.println("Informe o valor da Transferência:");
                    double transferirValor = new Scanner(System.in).nextDouble();
                    if (transferirValor > saldoConta){
                        System.out.println("Você não possui saldo suficiente para essa transação! Verifique seu saldo.");
                    } else {
                        System.out.println("Você transferiu a importância de R$ " + transferirValor);
                        saldoConta -= transferirValor;
                        System.out.println("Saldo Atualizado R$ " + saldoConta);
                    }
                    continue;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Operação Encerrada");
            break;
        }
    }
}
