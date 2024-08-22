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
        }

    }
}
