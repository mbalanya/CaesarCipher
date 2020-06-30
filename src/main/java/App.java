import java.io.Console;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();

        System.out.println("---------------------------");
        System.out.println("-+-CAESAR CIPHER ENCRYPT-+-");
        System.out.println("---------------------------");
        System.out.println("Type e to Encrypt or d to decrypt");
        String entryInput = myConsole.readLine();
        if (entryInput == "e"){
            System.out.println("Welcome to Encryption. Enter sentence to be Encrypted: ");
            String encryptSentence = myConsole.readLine();
            encryptSentence = encryptSentence.toLowerCase();
            String[] words = encryptSentence.split("\\s+");
            for (int i = 0; i < words.length; i++){
                words[i] = words[i].replaceAll("^\\w", "");
            }
        } else if (entryInput == "d"){
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

        System.out.println("Your encrypted code is: ");

        System.out.println("Your decrypted code is: ");

    }
}
