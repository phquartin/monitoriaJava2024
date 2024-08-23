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
    public static String Ex09(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite o preço do produto: ");
        float preco = sc.nextFloat();
        str = "R$ " + preco * 0.9 + " é o valor do seu desconto";
        return str;
    }
    public static String Ex10(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite seu peso em KG: ");
        float peso = sc.nextFloat();
        str = "Seu peso em libras é: " + peso * 2.2046;
        return str;
    }
    public static String Ex11(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            str = num1 + " é maior que " + num2;
        } else if (num2 > num1) {
            str = num2 + " é maior que " + num1;
        } else {
            str = "Eles são iguais!";
        }
        return str;
    }
    public static String Ex12(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num3 = sc.nextInt();
        if (num1 < num2 && num2 < num3) {
            str = "O menor é " + num1;
        } else if (num2 < num1 && num2 < num3) {
            str = "O menor é " + num2;
        } else if (num3 < num1 && num3 < num2) {
            str = "O menor é " + num3;
        } else {
            str = "Todos são iguais! Que chato ;(";
        }
        return str;
    }
    public static String Ex13(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        str = (num % 2 == 0) ? "PAR" : "ÍMPAR";
        return str;
    }
    public static String Ex14(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.println("Digite seu peso em kg: ");
        float peso = sc.nextFloat();
        double IMC;
        IMC =  peso / (altura * altura);
        if (IMC > 18.5 && IMC < 24.9) {str = "Seu IMC é " + IMC + " você está no peso ideal! ;D ";}
        else {str = "Seu IMC é " + IMC + " você não está no seu peso ideal! :( ";}
        return str;
    }
    public static String Ex15(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {str = num + " é multiplo de 3 e 5! ";}else{str = num + " não é multiplo de 3 e 5! ";}
        return str;
    }
    public static String Ex16(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        if (num1 >= 0 && num2 >= 0) {str = "" + num1 * num2;}else{str = "" + (num2 + num1);}
        return str;
    }
    public static String Ex17(){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();
        str = (salario >= 1000) ? "Seu novo sálario é " + ((salario * 0.05) + salario) : "Seu novo salário é " + ((salario * 0.1) + salario);
        return str;
    }
}
