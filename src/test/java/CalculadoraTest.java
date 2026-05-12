import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private static final double EPSILON = 1e-9;

    @Test
    void testeAdicionar() {
        Calculadora calc = new Calculadora();

        assertEquals(5.0, calc.adicionar(2, 3), EPSILON);
        assertEquals(1.0, calc.adicionar(-2, 3), EPSILON);
    }

    @Test
    void testeSubtrair() {
        Calculadora calc = new Calculadora();

        assertEquals(2.0, calc.subtrair(5, 3), EPSILON);
    }

    @Test
    void testeMultiplicar() {
        Calculadora calc = new Calculadora();

        assertEquals(6.0, calc.multiplicar(2, 3), EPSILON);
    }

    @Test
    void testeDividir() {
        Calculadora calc = new Calculadora();

        assertEquals(2.0, calc.dividir(6, 3), EPSILON);
    }

    @Test
    void testeDivisaoPorZero() {
        Calculadora calc = new Calculadora();

        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(5, 0));
    }

    @Test
    void testeSen() {
        Calculadora calc = new Calculadora();

        assertEquals(1.0,
                calc.sen(Math.PI / 2),
                EPSILON);
    }

    @Test
    void testeCos() {
        Calculadora calc = new Calculadora();

        assertEquals(-1.0,
                calc.cos(Math.PI),
                EPSILON);
    }
}