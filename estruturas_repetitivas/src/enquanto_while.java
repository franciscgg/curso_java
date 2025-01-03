import java.util.Scanner;

public class enquanto_while {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0; //tem que iniciar com 0 número neutro para atribuir

        while(x != 0){ //enquanto for verdade = executa e volta \ falso = pula fora
            soma += x;
            x = sc.nextInt();
        }
        System.out.print(soma); //quando pula fora do loop
        sc.close();
    }
}