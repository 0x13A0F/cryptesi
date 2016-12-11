import java.util.Scanner;
public class cesar_bruteforce {
    public static void main(String[] args){
      System.out.println("Message to decrypt: ");
      Scanner sc = new Scanner(System.in);
      String plaintext="";
      String ciphertext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
      for (int key=1; key < 26; key++){
        plaintext="";
        for (int i=0; i < ciphertext.length(); i++){
          int m = ciphertext.charAt(i) - 65;
          plaintext += (char)((m+26-key)%26 + 65);
        }
        System.out.println("Plaintext : "+plaintext);
      }
    }
}
