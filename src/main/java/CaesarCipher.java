public class CaesarCipher {
    private int key;

    public CaesarCipher(int key, String phrase){
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }
}
