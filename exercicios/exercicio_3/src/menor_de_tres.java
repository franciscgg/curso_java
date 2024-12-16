import java.util.Scanner;

public class menor_de_tres {
    public static void main(String [] agrs){
        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        num1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        num2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        num3 = sc.nextInt();

        if(num1 < num2){
            System.out.print("Menor: " + num1);
        } else if (num3 < num2) {
            System.out.print("Menor: " + num3);
        } else {
            System.out.print("Menor: " + num2);
        }
    }
}
