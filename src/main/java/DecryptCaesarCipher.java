import java.lang.reflect.Array;

public class DecryptCaesarCipher {
    private int key;
    private String phrase;

    public DecryptCaesarCipher(int key, String phrase){
        this.key = key;
        this.phrase = phrase;
    }

    public int getKey() {
        return this.key;
    }

    public String getPhrase() {
        return this.phrase;
    }

    public String decryption(int key, String phrase) {
        String decryptedPhrase = "";
        String alphabetListString = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetList = alphabetListString.toCharArray();
        for(Integer i = 0; i < alphabetList.length; i++)
            if (key < alphabetList.length && key > 0){
                decryptedPhrase = "";
                char decryptedArr[] = new char[phrase.length()];
                char[] phraseCharArray = phrase.toCharArray();
                for(char phraseChar : phraseCharArray){
                    int positionAlphabetListString = alphabetListString.indexOf(phraseChar);
                    int decryptedPosition = positionAlphabetListString - key;
                   
                    char decryptedPhraseChar = alphabetList[decryptedPosition];
                    String decryptedPhraseStr = Character.toString(decryptedPhraseChar);
                    decryptedPhrase += decryptedPhraseStr;
                }

            } else if (key > alphabetList.length) {
                key = key % alphabetList.length;
                decryptedPhrase = "";
                char decryptedArr[] = new char[phrase.length()];
                char[] phraseCharArray = phrase.toCharArray();
                for(char phraseChar : phraseCharArray) {
                    int positionAlphabetListString = alphabetListString.indexOf(phraseChar);
                    int decryptedPosition =  positionAlphabetListString - key;


                    char decryptedPhraseChar = alphabetList[decryptedPosition];
                    String decryptedPhraseStr = Character.toString(decryptedPhraseChar);
                    decryptedPhrase += decryptedPhraseStr;
                }
            } else {
                System.out.println("Invalid Key");
            }

        return null;
    }
}
