import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    /*
    @Rule
    public ExpectException thrown = ExpectException.none();


    @Test
    public void shouldTestExceptionMessage() throws  IndexOutOfBoundsException{
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Array vazio");
        list.get(0);
    }
    */

    @Test
    public void testExceptionMessage(){
        try{
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOfBounds Exception seja lançada");
        }catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
