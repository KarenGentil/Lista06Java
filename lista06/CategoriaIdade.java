package lista06;

import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolecente");
        } else if (idade <= 59) {
            System.out.println("Adulto");

        }else {
            System.out.println("Idoso");
        }
        sc.nextLine();
    }
}
