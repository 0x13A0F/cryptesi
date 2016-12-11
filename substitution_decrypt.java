import java.util.Scanner;
public class substitution_decrypt{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Message to decrypt: ");
    String ciphertext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
    String plaintext="";
    System.out.println("Alphabet Utilisee : ");
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alpha = sc.nextLine().toUpperCase().replaceAll("^[A-Z]","");
    for (int i=0; i < ciphertext.length(); i++){
      plaintext += alphabet.charAt(alpha.indexOf(ciphertext.charAt(i)));
    }
    System.out.println("Message : "+ciphertext+"\nCiphertext: "+plaintext);
  }
}
