import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Scanner para entrada de dados

        String x;
        x = sc.next(); //entrada de uma string
        System.out.println("Vocẽ digitou: " + x);

        int y;
        y = sc.nextInt(); //entrada de um número inteiro
        System.out.println("Você digitou: " + y);

        double z;
        z = sc.nextDouble(); //entrada de um número flutuante
        System.out.println("Você digitou: " + z); //parar sair com . tem que usar o locale para converter para US

        char a;
        a = sc.next().charAt(0); //entrada de caractere | charAT(0) vai pegar somente o primeiro caractere
        System.out.println("Você digitou: " + a);

        String b;
        int c;
        double d;
        b = sc.next();
        c = sc.nextInt();
        d = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        sc.close();//para encerrar o Scanner

    }
}