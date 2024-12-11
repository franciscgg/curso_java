import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2 , s3;

        x = sc.nextInt();
        sc.nextLine(); //para resolver só colocar um nextLine antes
        s1 = sc.nextLine(); //nextline consumiu uma linha e deixa em branco
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}