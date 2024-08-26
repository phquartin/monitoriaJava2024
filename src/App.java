import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String loop;
        boolean boo = true;
        do {
            System.out.println("O número do exercício (1:30): ");
            int x = sc.nextInt();
            switch (x) {
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
                case 18:
                    System.out.println(Main.Ex18());
                    break;
                case 19:
                    System.out.println(Main.Ex19());
                    break;
                case 20:
                    System.out.println(Main.Ex20());
                    break;
                case 21:
                    System.out.println(Main.Ex21());
                    break;
                case 22:
                    System.out.println(Main.Ex22());
                    break;
                case 23:
                    System.out.println(Main.Ex23());
                    break;
                case 24:
                    System.out.println(Main.Ex24());
                    break;
                case 25:
                    System.out.println(Main.Ex25());
                    break;
                case 26:
                    System.out.println(Main.Ex26());
                    break;
                case 27:
                    System.out.println(Main.Ex27());
                    break;
                case 28:
                    System.out.println(Main.Ex28());
                    break;
                case 29:
                    System.out.println(Main.Ex29());
                    break;
                case 30:
                    System.out.println(Main.Ex30());
                    break;
                default:
                    System.out.println("Digite um exercício válido!");
            }
            System.out.println("Deseja fazer mais um exercício?(S/N): ");
            loop = sc.next();
            if (loop.equalsIgnoreCase("s")) {
                System.out.println("Continuando...");
            }else if (loop.equalsIgnoreCase("n")) {
                boo = false;
            }else{
                System.out.println("Erro na digitação!\n");
                System.out.println("Deseja fazer mais um exercício?(S/N): ");
                loop = sc.next();
            }
        }while(boo);
        System.out.println("Fim!");
    }
}
