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

    @Test
    public void newCaesarCipher_getsPhrase_test() {
        CaesarCipher testCaesarCipher = new CaesarCipher(2, "test");
        assertEquals("test", testCaesarCipher.getPhrase());
    }

    @Test
    public void newCaesarCipher_encryption_g() {
        CaesarCipher testCaesarCipher = new CaesarCipher(2, "test");
        assertEquals("b", testCaesarCipher.encryption(20, "h"));
    }

    @Test
    public void newCaesarCipher_encryption_d() {
        CaesarCipher testCaesarCipher = new CaesarCipher(2, "test");
        assertEquals("fsso", testCaesarCipher.encryption(30, "book"));
    }

}
