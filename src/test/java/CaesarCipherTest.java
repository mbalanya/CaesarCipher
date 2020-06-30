import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testCaesarCipher = new CaesarCipher(2, "test");
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_getsKey_2() {
        CaesarCipher testCaesarCipher = new CaesarCipher(2, "test");
        assertEquals(2, testCaesarCipher.getKey());
    }
}
