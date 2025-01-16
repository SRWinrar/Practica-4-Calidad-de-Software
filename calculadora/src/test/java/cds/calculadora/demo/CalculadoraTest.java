package cds.calculadora.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private final Calculadora calculadora = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(4, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    void testDividirPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(6, 0));
        assertEquals("División por cero no permitida", exception.getMessage());
    }

}
