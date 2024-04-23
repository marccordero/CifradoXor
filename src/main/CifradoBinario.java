package main;
import java.util.Scanner;

public class CifradoBinario {

    private static String encryptDecrypt(String inputString, String key) {
        StringBuilder outputString = new StringBuilder();

        int keyLength = key.length();
        for (int i = 0; i < inputString.length(); i++) {
            char inputChar = inputString.charAt(i);
            char keyChar = key.charAt(i % keyLength);
            char outputChar = (char) (inputChar ^ keyChar);
            outputString.append(outputChar);
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje: ");
        String message = scanner.nextLine();

        System.out.print("Ingrese la clave: ");
        String key = scanner.nextLine();

        System.out.println("Mensaje original: " + message);

        String encryptedMessage = encryptDecrypt(message, key);
        System.out.println("Mensaje cifrado: " + encryptedMessage);

        String decryptedMessage = encryptDecrypt(encryptedMessage, key);
        System.out.println("Mensaje descifrado: " + decryptedMessage);

        scanner.close();
    }
}
