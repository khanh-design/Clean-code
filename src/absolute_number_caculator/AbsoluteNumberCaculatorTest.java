package absolute_number_caculator;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCaculatorTest {

    @org.junit.jupiter.api.Test
    void testfindAbsolute() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCaculator.findAbsolute(number);
        assertEquals(expected, result);
    }


    @org.junit.jupiter.api.Test
    void TestfindAbsolute1() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCaculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void TestfindAbsolute2() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCaculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    public static void main(String[] args) {

    }
}