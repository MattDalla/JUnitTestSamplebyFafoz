package it.mattew;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    Converter sut; //system Under Test

    @BeforeEach
    void setUp() {
        sut = new Converter();
        System.out.println("before each");
    }

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 6})
    void shouldConvertYardToFeet(int value) {
        int actual = sut.yardToFeet(value);

        assertEquals(3 * value, actual);
    }

    @Test
    void shouldConvertYardToFeet() {
        int actual = sut.yardToFeet(1);

        assertEquals(3, actual);
    }

    @Test
    void shouldConvertInchesToCentimeters() {
        double actual = sut.inchToCm(1);

        assertEquals(2.54, actual);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 3, 5})
    void shouldConvertInchesToCentimeters2(double value) {
        double actual = sut.inchToCm(value);

        assertEquals(value * 2.54, actual);
    }
}
