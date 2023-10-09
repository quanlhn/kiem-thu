import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Apptest {

    @Test
    public void isPrimeTest() {
        boolean test = App.isNumberPrime(4);
        assertEquals(false, test);
    }
}
