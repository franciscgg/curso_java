import java.util.Locale;
import java.util.Scanner;

public class idades {
    public static void main(String[] args){
        String nome1;
        int idade1;
        String nome2;
        int idade2;
        Double media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();
        sc.close();

        media = (double) ((idade1 + idade2) / 2.0);

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

    }
}
