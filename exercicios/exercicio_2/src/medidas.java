import java.util.Locale;
import java.util.Scanner;

public class medidas {
    public static void main(String[] args){
        Double A;
        Double B;
        Double C;
        Double areaQuadrado;
        Double areaTriangulo;
        Double areaTrapezio;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a medida A: ");
        A = sc.nextDouble();
        System.out.println("Digite a medida B: ");
        B = sc.nextDouble();
        System.out.println("Digite a medida C: ");
        C = sc.nextDouble();

        areaQuadrado = A * A;
        areaTriangulo = (A * B) / 2;
        areaTrapezio = ((A + B) * C) / 2;

        System.out.printf("AREA DO QUADRADO: %.4f%n", areaQuadrado);
        System.out.printf("AREA DO TRIANGULO: %.4f%n", areaTriangulo);
        System.out.printf("AREA DO TRAPEZIO: %.4f", areaTrapezio);
    }
}
