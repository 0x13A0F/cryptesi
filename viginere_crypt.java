import java.util.Scanner;
public class viginere_crypt{
        public static void main(String[] args){
                System.out.println("Message to encrypt : ");
                Scanner sc = new Scanner(System.in);
                String message = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","") , ciphertext="";
                System.out.println("Key : ");
                String key = sc.nextLine().toUpperCase();
                for (int i=0 ; i < message.length(); i++){
                        int m = (int) (message.charAt(i)-65);
                        int k = (int) (key.charAt(i%key.length())-65);
                        ciphertext += (char)((m+k)%26+65);
                }
                System.out.println(ciphertext);
        }
}
