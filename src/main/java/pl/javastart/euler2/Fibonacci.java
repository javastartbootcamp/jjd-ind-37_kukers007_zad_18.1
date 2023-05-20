package pl.javastart.euler2;

public class Fibonacci {

    public int sumOfEvenFibonacci(int limit) {
        int previous = 1;
        int next = 2;
        int totalSum = 0;

        while (previous <= limit) {
            if (previous % 2 == 0) {
                totalSum += previous;
            }
            int temp = previous;
            previous = next;
            next = temp + next;
        }

        return totalSum;
    }
}