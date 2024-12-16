import java.util.Scanner;

public class operadora {
    public static void main(String [] agrs){
        int minutos;
        Double valor, valorPagar;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        valor = 50.00;

        if(minutos < 100){
            System.out.printf("Valor a pagar: R$ %.2f", valor);
        }else {
            valorPagar = valor + (minutos - 100) * 2;
            System.out.printf("Valor a pagar: R$ %.2f", valorPagar);
        }
        sc.close();
    }
}
