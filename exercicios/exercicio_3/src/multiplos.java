import java.util.Scanner;

public class multiplos {
    public static void main(String[] agrs){
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.print("Sao multiplos");
        }else{
            System.out.print("Nao sao multiplos");
        }
    }
}
