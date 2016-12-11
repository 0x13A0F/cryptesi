import java.util.Scanner;
public class viginere_decrypt{
        public static void main(String[] args){
                System.out.println("Message to decrypt : ");
                Scanner sc = new Scanner(System.in);
                String ciphertext = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","") , plaintext="";
                System.out.println("Key : ");
                String key = sc.nextLine().toUpperCase();
                for (int i=0 ; i < ciphertext.length(); i++){
                        int c = (int) (ciphertext.charAt(i) - 65);
                        int k = (int) (key.charAt(i%key.length()) - 65);
                        plaintext += (char)(Math.floorMod(c-k,26)+65);
                }
                System.out.println("Plaintext: "+plaintext);
        }
}
