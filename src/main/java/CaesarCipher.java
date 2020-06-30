import java.lang.reflect.Array;

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

    public String encryption(int key, String phrase) {
        String encryptedPhrase = "";
        String alphabetListString = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetList = alphabetListString.toCharArray();
        for(Integer i = 0; i < alphabetList.length; i++)
            if (key < alphabetList.length && key > 0){
                encryptedPhrase = "";
                char encryptedArr[] = new char[phrase.length()];
                char[] phraseCharArray = phrase.toCharArray();
                for(char phraseChar : phraseCharArray){
                    int positionAlphabetListString = alphabetListString.indexOf(phraseChar);
                    int encryptedPosition = key + positionAlphabetListString;
                    encryptedPosition = encryptedPosition %alphabetList.length;
                    char encryptedPhraseChar = alphabetList[encryptedPosition];
                    String encryptedPhraseStr = Character.toString(encryptedPhraseChar);
                    encryptedPhrase += encryptedPhraseStr;
                }

            } else if (key > alphabetList.length) {
                key = key % alphabetList.length;
                encryptedPhrase = "";
                char encryptedArr[] = new char[phrase.length()];
                char[] phraseCharArray = phrase.toCharArray();
                for(char phraseChar : phraseCharArray) {
                    int positionAlphabetListString = alphabetListString.indexOf(phraseChar);
                    int encryptedPosition = key + positionAlphabetListString;
                    encryptedPosition = encryptedPosition %alphabetList.length;
                    char encryptedPhraseChar = alphabetList[encryptedPosition];
                    String encryptedPhraseStr = Character.toString(encryptedPhraseChar);
                    encryptedPhrase += encryptedPhraseStr;
                }
            } else {
                System.out.println("Invalid Key");
            }

        return encryptedPhrase;
    }
}
