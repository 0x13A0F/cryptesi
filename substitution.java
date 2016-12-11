import java.util.Scanner;
public class substitution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Message to encrypt: ");
    String message = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
    String ciphertext="";
    System.out.println("Alphabet Utilisee : ");
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alpha = sc.nextLine().toUpperCase().replaceAll("^[A-Z]","");
    for (int i=0; i < message.length(); i++){
      ciphertext += alpha.charAt(alphabet.indexOf(message.charAt(i)));
    }
    System.out.println("Message : "+message+"\nCiphertext: "+ciphertext);
  }
}
