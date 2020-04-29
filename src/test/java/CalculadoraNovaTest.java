import com.test.CalculadoraNova;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarDoisValores(){
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        CalculadoraNova calc1 = new CalculadoraNova();

        int soma = calc1.somar(valorA, valorB, valorC);

        assertEquals(6, soma);
    }
}
