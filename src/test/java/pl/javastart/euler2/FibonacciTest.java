package pl.javastart.euler2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    void shouldReturn0for0() {
        //when
        int result = fibonacci.sumOfEvenFibonacci(0);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void shouldReturn34for10() {
        //when
        int result = fibonacci.sumOfEvenFibonacci(10);
        //then
        Assertions.assertEquals(10, result);
    }

    @Test
    void shouldReturn44for34() {
        //when
        int result = fibonacci.sumOfEvenFibonacci(34);
        //then
        Assertions.assertEquals(44, result);
    }

    @Test
    void shouldReturn4_613_732for4_000_000() {
        //when
        int result = fibonacci.sumOfEvenFibonacci(34);
        //then
        Assertions.assertEquals(44, result);
    }


}