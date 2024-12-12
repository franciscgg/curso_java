import java.util.Scanner;

public class duracao {
    public static void main (String[] args){
        int duracSeg;
        int horas;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a duração em segundos: ");
        duracSeg = sc.nextInt();

        horas = duracSeg / 3600;
        minutos = (duracSeg % 3600) / 60;
        segundos = duracSeg % 60;

        System.out.printf("%d:%d:%d", horas,minutos,segundos);
    }
}
