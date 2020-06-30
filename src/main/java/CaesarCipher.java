public class CaesarCipher {
    private int key;
    private String phrase;

    public CaesarCipher(int key, String phrase){
        this.key = key;
        this.phrase = phrase;
    }

    public int getKey() {
        return this.key;
    }

    public String getPhrase() {
        return this.phrase;
    }
}
