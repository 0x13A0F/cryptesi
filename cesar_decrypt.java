import java.util.Scanner;
public class cesar_decrypt {
    public static void main(String[] args){
      System.out.println("Message to decrypt: ");
      Scanner sc = new Scanner(System.in);
      String plaintext="";
      String ciphertext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
      System.out.println("Key (1-25): ");
      int key = sc.nextInt();
      for (int i=0; i < ciphertext.length(); i++){
        int m = ciphertext.charAt(i) - 65;
        plaintext += (char)((m+26-key)%26 + 65);
      }
      System.out.println("===============");
      System.out.println("Ciphertext : "+ciphertext+"\nKey: "+key);
      System.out.println("Plaintext : "+plaintext);
    }
}
