import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER ANY ALPHABET : ");
        char alpha = in.next().charAt(0);
        switch (alpha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                      System.out.println(alpha+" IS A VOWEL !");
                      break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                      System.out.println(alpha+" IS A VOWEL !");
                       break;
            default:
            System.out.println(alpha+"  IS A CONSONANT !");
               
        }
    }
}
