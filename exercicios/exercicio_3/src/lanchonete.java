import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] agrs){

        int cod, qtd;
        Double valor,produto = 0.0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        cod = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        qtd = sc.nextInt();

        if(cod == 1){
            produto = 5.00;
        } else if (cod == 2) {
            produto = 3.50;
        } else if (cod == 3) {
            produto = 4.80;
        } else if (cod == 4) {
            produto = 8.90;
        } else if (cod == 5) {
            produto = 7.32;
        }else {
            System.out.print("Erro! Digite um codigo valido (1 a 5).");
        }

        valor = produto * qtd;
        System.out.printf("Valor a pagar: R$ %.2f", valor);
        sc.close();
    }
}
