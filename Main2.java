import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scn.nextLine();
        String reversed = "";
        // Read characters from the last position to the first
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        System.out.println("Reversed string:" + reversed);
        scn.close();
    }
}