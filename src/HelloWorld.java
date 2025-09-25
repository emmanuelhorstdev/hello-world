import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Para cadastro na plataforma, por favor, digite seu nome COMPLETO:");
        String nome = scanner.nextLine();

        System.out.println("Agora seu CPF (Cadastro de Pessoa Física):");
        String cpf = scanner.nextLine();

        System.out.println("Agora sua Idade:");
        int idade = scanner.nextInt();

        System.out.println("Agora sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Agora seu peso:");
        double peso = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("E por último, digite seu estado civil:");
        String estadoCivil = scanner.nextLine();;


    }

}
