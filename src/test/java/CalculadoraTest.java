import com.test.Calculadora;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
    }

    @Test
    public void testeSomarComMock(){
        Calculadora calculadora = mock(Calculadora.class);

        vhen(calculadora.somar("1+2")).thenReturn(10);

        int resultado = calculadora.somar("1+2");

        assertEquals(10, resultado);
    }
}
