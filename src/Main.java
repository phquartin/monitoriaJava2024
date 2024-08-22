import java.util.Scanner;

public class Main {

    public static int Ex01() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int num1 = sc.nextInt();
    System.out.println("Digite outro numero: ");
    int num2 = sc.nextInt();
    System.out.println("Digite outro numero: ");
    int num3 = sc.nextInt();
    return num1 + num2 + num3;
    }
    public static String Ex02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        int x = num1 * 2;
        int y = num1 * 3;
        int z = num1 * 4;
        String str = x + " " + y + " " + z;
        return str;
    }
    public static float Ex03() {
        float IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.println("Digite seu peso em kg: ");
        float peso = sc.nextFloat();
        IMC = peso / (altura * altura);
        return IMC;
    }
    public static double Ex04(){
        double mediaPonderada;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float num1 = sc.nextInt();
        System.out.println("Digite outro valor: ");
        float num2 = sc.nextInt();
        System.out.println("Digite outro valor: ");
        float num3 = sc.nextInt();
        mediaPonderada = num1 * 2 + num2 * 3 + num3 * 5 / (2 + 3 + 5);
        return mediaPonderada;
    }
    public static int Ex05() {
        Scanner sc = new Scanner(System.in);
        int dias;
        System.out.println("Digite sua idade em anos: ");
        int ano = sc.nextInt();
        dias = ano * 360;
        return dias;
    }
    public static double Ex06() {
        Scanner sc = new Scanner(System.in);
        double salarioNovo;
        System.out.println("Digite seu salário: ");
        float salario = sc.nextFloat();
        salarioNovo = salario * 0.15;
        return salarioNovo + salario;
    }
    public static String Ex07() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        str = "Sucessor " + (numero + 1) + " " + "\nAntecessor " + (numero - 1);
        return str;
    }
    public static String Ex08() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite os dias trabalhados: ");
        int dias = sc.nextInt();
        System.out.println("Digite sua diária: ");
        float salario = sc.nextFloat();
        str = "Seu salário vai ser igual: " + (salario * dias);
        return str;
    }
    public s
}
