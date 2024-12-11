import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args){
        Double preco;
        Double dinheiro;
        Double troco;
        int qtd;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Preço unitário do produto: ");
        preco = sc.nextDouble();
        System.out.println("Quantidade comprada: ");
        qtd = sc.nextInt();
        System.out.println("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();
        sc.close();

        troco = dinheiro - (preco * qtd);
        System.out.printf("TROCO: R$ %.2f", troco);
    }
}
