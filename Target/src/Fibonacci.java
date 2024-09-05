import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência de Fibonacci: ");
        int n = input.nextInt();
        System.out.println("Sequência de Fibonacci");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
