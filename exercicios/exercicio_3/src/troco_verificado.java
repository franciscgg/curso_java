import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] agrs){
        Double precoUni, dinRecebido, total,faltante;
        int qtd;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        precoUni = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinRecebido = sc.nextDouble();

        total = precoUni * qtd;
        faltante = total - dinRecebido;

        if(dinRecebido < total){
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", faltante);
        } else{
            System.out.printf("TROCO = %.2f", faltante);
        }
        sc.close();
    }
}
