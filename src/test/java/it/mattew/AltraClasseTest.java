package it.mattew;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AltraClasseTest {

    @Test
    void divisioneStupida() {
        AltraClasse divido = new AltraClasse();
        double actual = divido.divisioneStupida(2, 2);
        assertEquals(1, actual);
    }

    @Test
    void divisioneStupida2() {
        AltraClasse divido = new AltraClasse();
        Executable shouldThrow = () -> divido.divisioneStupida(1, 0);
        assertThrows(IllegalArgumentException.class, shouldThrow);
    }
}