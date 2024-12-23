import java.util.Scanner;

public class operadora {
    public static void main(String [] agrs){
        int minutos;
        Double valor = 50.00;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        if(minutos > 100){
            valor += (minutos - 100) * 2;
        }
        System.out.printf("Valor a pagar: R$ %.2f", valor);
        sc.close();
    }
}
