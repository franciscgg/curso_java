import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] agrs){
        Double nota1, nota2, notaFinal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL: %.1f%n", notaFinal);

        if(notaFinal < 60.0){
            System.out.print("REPROVADO");
        }
        else{
            System.out.print("APROVADO");
        }
        sc.close();
    }
}
