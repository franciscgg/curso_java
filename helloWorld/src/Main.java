import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        String nome = "Francisco";
        int idade = 19;
        double renda = 7000.0;


        System.out.println(y);
        System.out.printf("%.2f%n", x); //para texto formatado %2f para quebra de linha %n
        Locale.setDefault(Locale.US); //Configura a localização do programa
        System.out.printf("%.2f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
    }
}