import java.util.Scanner;
public class affine_decrypt{
  public static int inverse_mod(int a){
    for (int i=1; i < 26; i++)
      if ((a*i)%26 == 1) return i;
    return -1;
  }
  public static void main(String[] args){
    String plaintext="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Message to encrypt: ");
    String ciphertext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
    sc.reset();
    System.out.println("a : ");
    int a=sc.nextInt();
    System.out.println("b : ");
    int b = sc.nextInt();
    for (int i=0; i < ciphertext.length(); i++){
      int c = ciphertext.charAt(i) - 65;
      plaintext += (char)(Math.floorMod((c-b)*inverse_mod(a),26) + 65);
    }
    System.out.println("==========\nMessage: "+ciphertext);
    System.out.println("a = "+a+"\nb = "+b);
    System.out.println("Plaintext : \n"+plaintext);
  }
}
