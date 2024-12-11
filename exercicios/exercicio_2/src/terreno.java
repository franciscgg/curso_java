import java.util.Locale;
import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        double largura;
        double comprimento;
        double areaTerreno;
        double valorTerreno;
        double valorTotal;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();

        System.out.print("Digite o valot do metro quadrado: ");
        valorTerreno = sc.nextDouble();

        areaTerreno = largura * comprimento;
        valorTotal = areaTerreno * valorTerreno;

        System.out.printf("Área do terreno: R$ %.2f", areaTerreno);
        System.out.printf("\nPreço do terreno: R$ %.2f", valorTotal);
        sc.close();

    }
}