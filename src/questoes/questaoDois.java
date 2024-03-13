package questoes;

import java.util.Scanner;

public class questaoDois {

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static boolean isInFibonacciSequence(int n) {
        int a = 0;
        int b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite até onde deseja ser receber a sequência de Fibonacci, e veja se o número que digitou pertence a mesma");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Esses números pertencem a sequência de Fibonacci:" + fibonacci(i));
        }

        System.out.println("**************************************************************");

        if (isInFibonacciSequence(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
