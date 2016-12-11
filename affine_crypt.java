import java.util.Scanner;
public class affine_crypt{
  public static void main(String[] args){
    String ciphertext="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Message to encrypt: ");
    String plaintext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
    sc.reset();
    System.out.println("a : ");
    int a=sc.nextInt();
    System.out.println("b : ");
    int b = sc.nextInt();
    for (int i=0; i < plaintext.length(); i++){
      int m = plaintext.charAt(i) - 65;
      ciphertext += (char)((a*m + b)%26 + 65);
    }
    System.out.println("==========\nMessage: "+plaintext);
    System.out.println("a = "+a+"\nb = "+b);
    System.out.println("Ciphertext : \n"+ciphertext);
  }
}
