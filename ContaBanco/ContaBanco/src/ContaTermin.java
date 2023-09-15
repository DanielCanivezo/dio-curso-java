import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTermin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25.000;
        DecimalFormat formatoMoeda = new DecimalFormat("");
        
        System.out.println("Por favor, Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, Digite o número de sua agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite sua conta bancária: ");
        double conta = scanner.nextDouble();
        String saldoFormatado = formatoMoeda.format(saldo);
        String mensagem = "Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é: ")
                                  .concat(agencia).concat(" conta: ").concat(String.valueOf(conta))
                                  .concat(", e o seu saldo R$ ").concat(saldoFormatado).concat(" já está disponível para saque");
        
        System.out.println(mensagem);
        
        scanner.close();
    }
}

