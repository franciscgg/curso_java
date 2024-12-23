import java.util.Locale;
import java.util.Scanner;

public class coordenadas {
    public static void main(String[] agrs){
        Double x,y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.print("Origem");
        } else if (x != 0 && y == 0) {
            System.out.print("Eixo X");
        } else if (y != 0 && x == 0) {
            System.out.print("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.print("Q1");
        } else if (x < 0 && y > 0){
            System.out.print("Q2");
        } else if (x < 0 && y < 0) {
            System.out.print("Q3");
        } else if (x > 0 && y < 0) {
            System.out.print("Q4");
        }

        sc.close();
    }
}
