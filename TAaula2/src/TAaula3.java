package src;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TAaula3 {
    public static void main(String[] args) {
        System.out.println(idade(1980));
        System.out.println(div(16, 4));
        System.out.println(isEven(5));
        System.out.println(isPositive(45));

        //repeat();
        //System.out.println(getWheels());
        //System.out.println(getGrade());
        //System.out.println(mes());
        // System.out.println(signo());
        crescente();

    }

    public static int idade(int ano) {
        int idade = 2023 - ano;
        return idade;
    }

    public static double div(double n1, double n2) {
        double result = n1 / n2;
        if (n2 == 0) return 0;
        return result;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }

    public static boolean isPositive(double num) {
        if (num >= 0) return true;
        return false;
    }

    public static void repeat() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("escreva algo");
        String input = keyboard.nextLine();
        System.out.println(input);
    }

    public static int getWheels() {
        int nWheels = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("diga um veículo");
        String veiculo = in.nextLine();
        switch (veiculo) {
            case "bicicleta", "moto":
                nWheels = 2;
                break;
            case "automóvel":
                nWheels = 4;
                break;
            case "triciclo":
                nWheels = 3;
                break;
            case "camião":
                nWheels = 6;
                break;
            case "monociclo":
                nWheels = 1;
                break;
            default:
                nWheels = 0;
                break;
        }
        return nWheels;
    }

    public static String getGrade() {
        String notaQuali;
        Scanner in2 = new Scanner(System.in);
        System.out.println("entre a nota");
        double nota = in2.nextInt();
        if (nota >= 90 && nota <= 100) {
            notaQuali = "Excelente";
        } else if (nota < 90 && nota >= 80) {
            notaQuali = "Muito bom";
        } else if (nota < 80 && nota >= 70) {
            notaQuali = "Bom";
        } else if (nota < 70 && nota >= 50) {
            notaQuali = "Suficiente";
        } else if (nota < 50 && nota >= 30) {
            notaQuali = "Insuficiente";
        } else if (nota < 30 && nota >= 0) {
            notaQuali = "Muito insuficiente";
        } else {
            notaQuali = "Nota inválida";
        }
        return notaQuali;
    }

    public static int mes() {
        int mesN = 0;
        Scanner in3 = new Scanner(System.in);
        System.out.println("entre um mês");
        String mes = in3.nextLine();
        switch (mes) {
            case "janeiro":
                mesN = 1;
                break;
            case "fevereiro":
                mesN = 2;
                break;
            case "março":
                mesN = 3;
                break;
            case "abril":
                mesN = 4;
                break;
            case "maio":
                mesN = 5;
                break;
            case "junho":
                mesN = 6;
                break;
            case "julho":
                mesN = 7;
                break;
            case "agosto":
                mesN = 8;
                break;
            case "setembro":
                mesN = 9;
                break;
            case "outubro":
                mesN = 10;
                break;
            case "novembro":
                mesN = 11;
                break;
            case "dezembro":
                mesN = 12;
                break;
            default:
                mesN = 0;
                break;
        }
        return mesN;
    }

public static String signo() {
    Scanner in4 = new Scanner(System.in);

    System.out.println("entre o mês de nascimento");
    String mesNascimento = in4.nextLine();
    System.out.println("entre o dia de nascimento");
    int diaNascimento = in4.nextInt();

    String signo = "";
    switch (mesNascimento) {
        case "janeiro":
            if (diaNascimento < 19) {
                signo = "capricórnio";
            }
            else {
                signo = "aquário";
            }
            break;
        case "fevereiro":
            if (diaNascimento < 20) {
                signo = "capricórnio";
            }
            else {
                signo = "peixes";
            }
            break;
        case "março":
            if (diaNascimento < 22) {
                signo = "peixes";
            }
            else {
                signo = "áries";
            }
            break;
        case "abril":
            if (diaNascimento < 21) {
                signo = "áries";
            }
            else {
                signo = "touro";
            }
            break;
        case "maio":
            if (diaNascimento < 22) {
                signo = "touro";
            }
            else {
                signo = "gêmeos";
            }
            break;
        case "junho":
            if (diaNascimento < 22) {
                signo = "gêmeos";
            }
            else {
                signo = "câncer";
            }
            break;
        case "julho":
            if (diaNascimento < 24) {
                signo = "câncer";
            }
            else {
                signo = "leão";
            }
            break;
        case "agosto":
            if (diaNascimento < 24) {
                signo = "leão";
            }
            else {
                signo = "virgem";
            }
            break;
        case "setembro":
            if (diaNascimento < 24) {
                signo = "virgem";
            }
            else {
                signo = "libra";
            }
            break;
        case "outubro":
            if (diaNascimento < 24) {
                signo = "libra";
            }
            else {
                signo = "escorpião";
            }
            break;
        case "novembro":
            if (diaNascimento < 23) {
                signo = "escorpião";
            }
            else {
                signo = "sagitário";
            }
            break;
        case "dezembro":
            if (diaNascimento < 23) {
                signo = "sagitário";
            }
            else {
                signo = "aquário";
            }
            break;
        default:
            System.out.println("error");
            break;
    }
    return signo;
}

//nao funciona
    public static void crescente() {
        Scanner in5 = new Scanner(System.in);
        System.out.println("diga o primeiro número");
        int n1 = in5.nextInt();
        System.out.println("diga o segundo número");
        int n2 = in5.nextInt();
        System.out.println("diga o terceiro número");
        int n3 = in5.nextInt();

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        }
        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            }
        }
        if (n3 < n1 && n3 < n2) {
            if (n1 < n2) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }
        }
    }
}
