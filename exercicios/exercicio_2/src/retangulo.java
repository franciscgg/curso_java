import java.util.Locale;
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Base do retangulo: ");
        base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("ÁREA = %.2f", area);


    }
}