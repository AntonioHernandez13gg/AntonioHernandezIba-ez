import java.util.Scanner;

public class metodos {
    public static void determinarParImpar() {
        System.out.printf("Escribe un número entre 0 y 10:");

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if (i < 0 || i > 10) {
            System.out.printf("Inválido");
        } else if (i % 2 == 0) {
            System.out.printf("Es par");
        } else {
            System.out.printf("Es impar");
        }
    }
}
