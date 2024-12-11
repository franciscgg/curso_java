import java.util.Scanner;

public class soma {
    public static void main(String[] args){
        int x;
        int y;
        int soma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.println("SOMA = " + soma);
    }
}
