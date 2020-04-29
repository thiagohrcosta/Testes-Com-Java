import com.test.Person;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MacherTest {

    @Test
    public void givenBean_checkToString(){
        Person person = new Person("Joao", "Silva");
        String atr=person.toString();
        assertThat(person, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists(){
        Person person = new Person("John", "Doe");
        assertThat(person, HasProperty.hasProperty("name");
    }
}
