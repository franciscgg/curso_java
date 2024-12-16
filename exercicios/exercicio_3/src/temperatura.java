import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] agrs){
        Double fahrenheit, celsius;
        char escala;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        escala = sc.next().charAt(0);

        escala = Character.toUpperCase(escala); //ignorar maiúsculas e minúsculas

        if(escala == 'F'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            fahrenheit = sc.nextDouble();

            celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.printf("Temperatura equivalente em Celsius: %.2f", celsius);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = sc.nextDouble();

            fahrenheit = celsius * 9.0 / 5.0 + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahrenheit);
        }else {
            System.out.print("Opção inválida! Use F ou C.");
        }
        sc.close();
    }
}
