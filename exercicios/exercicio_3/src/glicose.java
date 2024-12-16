import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String [] agrs){
        Double glicose;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        System.out.print("Classificação: ");
        if(glicose <= 100){
            System.out.println("normal");
        } else if (glicose <= 140) {
            System.out.println("elevado");
        } else{
            System.out.println("diabetes");
        }
        sc.close();
    }
}
