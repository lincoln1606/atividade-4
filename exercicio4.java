
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir variáveis
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaHomens = 0;
        int totalHomens = 0;
        int totalMulheres = 0;

        // Iterar sobre os dados de cada pessoa
        for (int i = 0; i < 10; i++) {
            System.out.print("Altura da pessoa " + (i+1) + ": ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer de entrada

            System.out.print("Sexo da pessoa " + (i+1) + " (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                somaAlturaHomens += altura;
                totalHomens++;
            } else {
                totalMulheres++;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        // Calcular média de altura dos homens
        double mediaAlturaHomens = totalHomens > 0 ? somaAlturaHomens / totalHomens : 0;

        // Escrever resultados
        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + totalMulheres);

        scanner.close();
    }
}
