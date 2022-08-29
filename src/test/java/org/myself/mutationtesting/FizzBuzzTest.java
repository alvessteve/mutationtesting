package org.myself.mutationtesting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void shouldreturnFizz(){
        String result = Fizzbuzz.fizzbuzz(9);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void shouldreturnBuzz() {
        String result = Fizzbuzz.fizzbuzz(20);
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void shouldreturnFizzBuzz() {
        String result = Fizzbuzz.fizzbuzz(15);
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void shouldreturnnumber() {
        String result = Fizzbuzz.fizzbuzz(98);
        Assertions.assertThat(result).isEqualTo("98");
    }
}