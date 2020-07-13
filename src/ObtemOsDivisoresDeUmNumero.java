import java.util.Scanner;

public class ObtemOsDivisoresDeUmNumero {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroDividendo = obterNumeroDividendo("Programa que diz os divisores de um número\nDigite um número para saber os seus divisores:");
        mostrarOsDivisores(numeroDividendo);
    }

    private static int obterNumeroDividendo(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }

    private static void mostrarOsDivisores(int numeroDividendo) {
        for (int divisor = 1; divisor <= numeroDividendo; divisor++) {
            if (numeroDividendo % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}
