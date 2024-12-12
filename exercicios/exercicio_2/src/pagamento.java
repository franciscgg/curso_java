import java.util.Locale;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        String nome;
        Double valorHora;
        int horasTrabalhadas;
        Double pagamento;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Valor por hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        pagamento = valorHora * horasTrabalhadas;
        System.out.printf("O pagamento para %s deve ser de R$%.2f", nome, pagamento);

    }
}
