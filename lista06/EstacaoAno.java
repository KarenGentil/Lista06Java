package lista06;

import java.util.Scanner;

public class EstacaoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 4: ");
        int num1 = sc.nextInt();

        switch (num1){
            case 1 -> System.out.println("Primavera");
            case 2 -> System.out.println("Verão");
            case 3 -> System.out.println("Outono");
            case 4 -> System.out.println("Inverno");
            default -> System.out.println("Erro");
        }
        sc.close();
    }
}
