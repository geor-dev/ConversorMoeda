import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dólares: ");
        double valorEmDolares = scanner.nextDouble();

        // Taxa de câmbio fixa (apenas um exemplo)
        double taxaDeCambio = 0.85;

        // Conversão
        double valorEmEuros = converterParaEuros(valorEmDolares, taxaDeCambio);

        System.out.println("O valor em euros é: " + valorEmEuros);

        scanner.close();
    }

    // Método para converter dólares para euros
    private static double converterParaEuros(double valorEmDolares, double taxaDeCambio) {
        return valorEmDolares * taxaDeCambio;
    }
}
