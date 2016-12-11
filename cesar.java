import java.util.Scanner;
public class cesar {
    public static void main(String[] args){
      System.out.println("Message to enter: ");
      Scanner sc = new Scanner(System.in);
      String ciphertext="";
      String message = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
      System.out.println("Key (1-25): ");
      sc.reset();
      int key = sc.nextInt();
      for (int i=0; i < message.length(); i++){
        int m = message.charAt(i) - 65;
        ciphertext += (char)((m+key)%26 + 65);
      }
      System.out.println("===============");
      System.out.println("Message : "+message+"\nKey: "+key);
      System.out.println("Ciphertext : "+ciphertext);
    }
}
