import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crie uma instância de Scanner para entrada do teclado.

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Leia uma linha de texto do teclado.
        System.out.println("Olá, " + nome + "!");

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Leia um número inteiro do teclado.
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Digite a primeira nota: ");
        int nota = scanner.nextInt();
        System.out.println("digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println(nota + nota2);
        int media = (nota + nota2/2);
        System.out.println("Sua média é: " + media + "!!");
        if (media>= 8) {
            System.out.println("voce está aprovado!!");
        }   else { 
            System.out.println("voce foi reprovado!!");
        }
         
        scanner.close(); // Feche o Scanner quando não precisar mais dele.

    }
}

    
        
