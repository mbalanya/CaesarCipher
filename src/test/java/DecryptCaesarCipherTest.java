import org.junit.*;
import static org.junit.Assert.*;

public class DecryptCaesarCipherTest {
    @Test
    public void newDecryptCaesarCipher_instantiatesCorrectly() {
        DecryptCaesarCipher testDecryptCaesarCipher = new DecryptCaesarCipher(2, "test");
        assertEquals(true, testDecryptCaesarCipher instanceof DecryptCaesarCipher);
    }

    @Test
    public void newCaesarCipher_getsKey_2() {
        DecryptCaesarCipher testDecryptCaesarCipher = new DecryptCaesarCipher(2, "test");
        assertEquals(2, testDecryptCaesarCipher.getKey());
    }

    @Test
    public void newCaesarCipher_getsPhrase_test() {
        DecryptCaesarCipher testDecryptCaesarCipher = new DecryptCaesarCipher(2, "test");
        assertEquals("test", testDecryptCaesarCipher.getPhrase());
    }

    @Test
    public void newCaesarCipher_encryption_g() {
        DecryptCaesarCipher testDecryptCaesarCipher = new DecryptCaesarCipher(2, "test");
        assertEquals("hi", testDecryptCaesarCipher.decryption(20, "bc"));
    }

    @Test
    public void newCaesarCipher_encryption_d() {
        DecryptCaesarCipher testDecryptCaesarCipher = new DecryptCaesarCipher(2, "test");
        assertEquals("book", testDecryptCaesarCipher.decryption(30, "fsso"));
    }

}
