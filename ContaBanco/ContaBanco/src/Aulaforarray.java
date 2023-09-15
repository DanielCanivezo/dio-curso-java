import java.util.Scanner;

public class Aulaforarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sonhos[] = { "Dev", "Backend", "Homeoffice" };
        
        for (String Sonho : sonhos) {
            System.out.println("Estudando para alcançar o meu sonho de " + Sonho);
            if (Sonho.equals("Backend")) {
                System.out.println("Você acredita que está próximo de realizar seu sonho? ");
                String x = scanner.nextLine();
                System.out.println("");
                if (x.equals("sim")) {
                    System.out.println("Eu também acho!");
                }
            }
        }
    }
}


