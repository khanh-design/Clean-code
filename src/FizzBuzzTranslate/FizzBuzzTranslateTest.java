package FizzBuzzTranslate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void fizzBuzz() {
        assertEquals("Fizz", FizzBuzzTranslate.fizzBuzz(3), "3 should return Fizz");
        assertEquals("Buzz", FizzBuzzTranslate.fizzBuzz(5), "5 should return Fizz");
        assertEquals("FizzBuzz", FizzBuzzTranslate.fizzBuzz(15), "15 should return Fizz");
        assertEquals("7", FizzBuzzTranslate.fizzBuzz(7), "7 should return Fizz");

    }
}