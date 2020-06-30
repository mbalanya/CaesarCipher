import java.io.Console;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();

        System.out.println("---------------------------");
        System.out.println("-+-CAESAR CIPHER ENCRYPT-+-");
        System.out.println("---------------------------");
        System.out.println("Type e to Encrypt or d to decrypt");
        String entryInput = myConsole.readLine();
        if (entryInput.equals("e")){
            System.out.println("Welcome to Encryption. Enter sentence to be Encrypted: ");
            String encryptSentence = myConsole.readLine();
            System.out.println("Welcome to Encryption. Enter key to be used for Encryption: ");
            String encryptKeyString = myConsole.readLine();
            int encryptKey = Integer.parseInt(encryptKeyString);
            encryptSentence = encryptSentence.toLowerCase();
            String[] words = encryptSentence.split("\\s+");
            for (int i = 0; i < words.length; i++){
                words[i] = words[i].replaceAll("^\\s", "");
            }
            ArrayList<String> encryptResultArray = new ArrayList<String>();
            for (String dataToBeDecrypted : words){
                CaesarCipher encryptedData = new CaesarCipher(encryptKey, dataToBeDecrypted);
                String encryptResult = encryptedData.encryption(encryptKey, dataToBeDecrypted);
                encryptResultArray.add(encryptResult);
            }
            String joinedString = String.join(" ", encryptResultArray);
            System.out.println("Your encrypted code is: " + joinedString.toUpperCase());
        } else if (entryInput.equals("d")){
            System.out.println("Welcome to Decryption. Enter sentence to be Decrypted: ");
            String encryptSentence = myConsole.readLine();
            encryptSentence = encryptSentence.toLowerCase();
            String[] words = encryptSentence.split("\\s+");
            for (int i = 0; i < words.length; i++){
                words[i] = words[i].replaceAll("^\\w", "");
            }
        } else {
            System.out.println("Invalid Input!");
        }



        System.out.println("Your decrypted code is: ");

    }
}
