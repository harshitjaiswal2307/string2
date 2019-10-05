package stringhandling;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        System.out.println("index:");
        for (int i = 0; i < string.length(); i++) {
            System.out.println("\t" + i);

        }
        System.out.println("\n");
        System.out.println("chars:");
        for (int i = 0; i < string.length(); i++) {
            System.out.println("\t" + string.substring(0 + i, i + 1));
        }
    }
}
