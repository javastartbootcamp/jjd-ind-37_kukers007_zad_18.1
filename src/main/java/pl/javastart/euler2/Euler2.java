package pl.javastart.euler2;

public class Euler2 {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int limit = 4_000_000;
        long sumEvenFibonacci = fibonacci.sumOfEvenFibonacci(limit);
        System.out.println("Sum of even Fibonacci numbers below " + limit + ": " + sumEvenFibonacci);
    }
}
