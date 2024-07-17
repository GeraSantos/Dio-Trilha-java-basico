import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe{

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + altura + " de altura");
            System.out.println("Tenho " + idade + " de idade");

            sc.close();

        } catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisa ser numericos");

        }

    }
}