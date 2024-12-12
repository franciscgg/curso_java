import java.util.Locale;
import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Double r;
        Double areaCirculo;
        Double pi = Math.PI;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio do circulo: ");
        r = sc.nextDouble();

        areaCirculo = pi*Math.pow(r,2);
        System.out.printf("AREA = %.3f", areaCirculo);
    }
}
