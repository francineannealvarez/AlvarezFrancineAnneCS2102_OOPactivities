import java.util.Scanner;
public class GettingGreater {
    public static void main(String[] args) {
        System.out.println("Getting the Greater Value");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first character: ");
        char ch1 = input.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2 = input.next().charAt(0);

        int Ascii_1 = (int) ch1;
        int Ascii_2 = (int) ch2;

        char MaxAscii = (char) Math.max(ch1, ch2);

        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + MaxAscii);
        System.out.println("-------------------------------------------");
        System.out.println("Showing the ASCII codes");
        System.out.println(ch1 + " : " + Ascii_1);
        System.out.println(ch2 + " : " + Ascii_2);

        input.close();
    }

}
