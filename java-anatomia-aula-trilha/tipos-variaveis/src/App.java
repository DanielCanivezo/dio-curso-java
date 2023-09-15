import java.util.Scanner;

public class App { 
    
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu salario: ?");
        int salario = scanner.nextInt();
        int reajuste = (salario*10/100);
        int novoSalario = salario+reajuste;
        System.out.println("seu novo salario com reajuste é: "+ novoSalario);
        scanner.close();

        
       


    }
}

    

