import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25.000;
        DecimalFormat formatoMoeda = new DecimalFormat("#,##0.00");
        System.out.println("Por favor, Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, Digite o número de sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite sua conta bancaria: ");
        double conta = scanner.nextDouble();
        String saldoFormatado = formatoMoeda.format(saldo);
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + conta + ", e o seu saldo R$ " + saldo + " já está disponível para saque.");
        
        scanner.close();

    }
}
