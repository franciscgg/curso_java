import java.util.Locale;
import java.util.Scanner;

public class baskara {
    public static void main(String [] agrs){
        Double a, b, c, x1, x2, delta, baskara;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if(delta <0){
            System.out.print("Está equacao não possui raizes reais");
        }
        else{
            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f", x2);
        }
    }
}
