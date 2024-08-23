import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O número do exercício (1:30): ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println(Main.Ex01());
                break;
            case 2:
                System.out.println(Main.Ex02());
                break;
            case 3:
                System.out.println("IMC: " + Main.Ex03());
                break;
            case 4:
                System.out.println("Média Ponderada: " + Main.Ex04());
                break;
            case 5:
                System.out.println("Você possui aproximadamente " + Main.Ex05() + " dias de vida");
                break;
            case 6:
                System.out.println("Seu novo salário: " + Main.Ex06());
                break;
            case 7:
                System.out.println(Main.Ex07());
                break;
            case 8:
                System.out.println(Main.Ex08());
                break;
            case 9:
                System.out.println(Main.Ex09());
                break;
            case 10:
                System.out.println(Main.Ex10());
                break;
            case 11:
                System.out.println(Main.Ex11());
                break;
            case 12:
                System.out.println(Main.Ex12());
                break;
            case 13:
                System.out.println(Main.Ex13());
                break;
            case 14:
                System.out.println(Main.Ex14());
                break;
            case 15:
                System.out.println(Main.Ex15());
                break;
            case 16:
                System.out.println(Main.Ex16());
                break;
            case 17:
                System.out.println(Main.Ex17());
                break;
        }

    }
}
