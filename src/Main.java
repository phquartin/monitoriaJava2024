import java.util.Scanner;

import static java.lang.Thread.sleep;

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
        String str;
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        int x = num1 * 2;
        int y = num1 * 3;
        int z = num1 * 4;
        str = x + " " + y + " " + z;
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
    public static String Ex18(){
        Scanner sc = new Scanner(System.in);
        boolean whie = true;
        String str;
        str = "Erro";
        do{
            System.out.println("Digite um número entre 1&7: ");
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                    whie = false;
                    str = "Domingo";
                    break;
                case 2:
                    whie = false;
                    str = "Segunda";
                    break;
                case 3:
                    whie = false;
                    str = "Terca";
                    break;
                case 4:
                    whie = false;
                    str = "Quarta";
                    break;
                case 5:
                    whie = false;
                    str = "Quinta";
                    break;
                case 6:
                    whie = false;
                    str = "Sexta";
                    break;
                case 7:
                    whie = false;
                    str = "Sabado";
                    break;
                default:
                    str = "Erro";
                    System.out.println("Digite um número válido!");
                    break;

            }
        }while(whie);
        return str;
    }
    public static String Ex19(){
        Scanner sc = new Scanner(System.in);
        String str;
        float[] num = new float[3];
        float menorNumero = 0, maiorNumero = 0, medioNumero = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            num[i] = sc.nextFloat();
        }for (int i = 0 ; i < 3; i++) {
            if (i == 0){
                menorNumero = num[0];
                maiorNumero = num[0];
            } else if (num[i] < menorNumero) {
                menorNumero = num[i];
            } else if (num[i] > maiorNumero) {
                maiorNumero = num[i];
            }
        }for (int i = 0 ; i < 3; i++)
            if(maiorNumero != num[i] && menorNumero != num[i])
                medioNumero = num[i];
    return "Os números em ordem crescente são: " + menorNumero + ", " + medioNumero +", "+ maiorNumero;
    }
    public static String Ex20(){
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            str = "Adulto";
        }else if (idade >= 14) {
            str = "Juvenil";
        }else if (idade >= 10) {
            str = "Infantil";
        } else{
            str = "Mirim";
        }
        return str;
    }
    public static String Ex21() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Contagem Regressiva!");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            sleep(500);
        }
        return " ";
    }
    public static String Ex22(){
        for(int i = 2 ; i <= 20 ; i++)
            if (i % 2 == 0)
                System.out.println(i);
        return " ";
    }
    public static String Ex23(){
        for(int i = 1 ; i <= 20 ; i++)
            if (i % 2 == 1)
                System.out.println(i);
        return " ";
    }
    public static String Ex24(){
        for(int i = 0 ; i <= 30 ; i++)
            if (i % 3 == 0)
                System.out.println(i);
        return " ";
    }
    public static String Ex25() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Contagem Decressiva!");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            sleep(500);
        }
        return " ";
    }
    public static String Ex26(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para descobrir sua tabuada: ");
        int num = sc.nextInt();
        for (int i = 0 ; i <= 10 ; i++)
            System.out.println(num + " x "+ i + " = " + (num * i));
        return " ";
    }
    public static String Ex27(){
        for(int i = 0 ; i <= 100 ; i++){
            if (i % 3 == 0 & i % 2 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 2 == 0){
                System.out.println("Buzz");
            }else
                System.out.println(i);
        }
        return " ";
    }
    public static String Ex28(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber seus divisores: ");
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    return " ";
    }
    public static String Ex29(){
        Scanner sc = new Scanner(System.in);
        int num, i = 0, soma = 0;
        do{
            System.out.println("(" + i + " Números digitados) | Digite um número e descubra a média deles! (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                i++;
                soma = soma + num;
            }
        }while(num != 0);
        return "A média é: "+ (soma / i);
    }
    public static String Ex30(){
        Scanner sc = new Scanner(System.in);
        int num = -1, maiornum = 0;
        for (int i = 0; num != 0; i++) {
            System.out.println("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (i == 0){
                maiornum = num;
            }else if (num > maiornum)
                maiornum = num;
        }
        return "O maior número é: " + maiornum;
    }
}
