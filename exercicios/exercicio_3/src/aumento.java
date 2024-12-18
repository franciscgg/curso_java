import java.util.Locale;
import java.util.Scanner;

public class aumento {
    public static void main(String[] agrs){
        Double salario, novoSal, aumento;
        int porcetagem;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000.00){
            porcetagem = 20;
        } else if (salario <= 3000.00) {
            porcetagem = 15;
        } else if (salario <= 8000.00) {
            porcetagem = 10;
        }else {
            porcetagem = 5;
        }

        aumento = salario * porcetagem / 100;
        novoSal = salario + aumento;
        System.out.printf(
                "Novo salario: R$ %.2f\n"+
                "Aumento: R$ %.2f\n" +
                "Porcetagem: %d %%",novoSal,aumento,porcetagem);
    }
}
