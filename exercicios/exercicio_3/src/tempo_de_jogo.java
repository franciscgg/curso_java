import java.util.Scanner;

public class tempo_de_jogo {
    public static void main(String[] agrs){
        int horaInicial, horaFinal, duracao;

        Scanner sc = new Scanner(System.in);
        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if(horaFinal > horaInicial){
            duracao = horaFinal - horaInicial; // hora final for maior que hora inicial
        }else {
            duracao = (horaFinal + 24) - horaInicial; // 24h atravessou meia noite
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
    }
}
