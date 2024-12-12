import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args){
        int distPercorrida;
        Double combGasto;
        Double distanciaTotal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Distância percorrida: ");
        distPercorrida = sc.nextInt();
        System.out.println("Combustível gasto: ");
        combGasto = sc.nextDouble();

        distanciaTotal = distPercorrida / combGasto;
        System.out.printf("Consumo medio = %.3f", distanciaTotal);
    }
}
