import java.util.Scanner;

public class MesEEstacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12 (mês): ");
        int mes = sc.nextInt();

        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        String estacao;
        if (mes == 12 || mes == 1 || mes == 2) {
            estacao = "Verão";
        } else if (mes >= 3 && mes <= 5) {
            estacao = "Outono";
        } else if (mes >= 6 && mes <= 8) {
            estacao = "Inverno";
        } else if (mes >= 9 && mes <= 11) {
            estacao = "Primavera";
        } else {
            estacao = "Mês inválido";
        }

        if (mes >= 1 && mes <= 12) {
            System.out.println("Mês: " + meses[mes - 1]);
            System.out.println("Estação: " + estacao);
        } else {
            System.out.println("Número de mês inválido.");
        }

        sc.close();
    }
}
