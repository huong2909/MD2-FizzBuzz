import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testTranslate() {
        int a = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }
    @Test
    void testTranslate1() {
        int a = 31;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }
    @Test
    void testTranslate2() {
        int a = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }
}