import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Que horas são? ");
        hora = sc.nextInt();

        if(hora < 12){
            System.out.printf("Bom dia");
        }
        else if (hora < 18) {
            System.out.printf("Boa tarde");
        }
        else{
            System.out.printf("Boa noite");
        }
    }
}