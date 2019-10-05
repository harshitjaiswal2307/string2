package stringhandling;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String string = obj.next();
        String substring = obj.next().trim();
        string newsubstring = obj.nextLine();
        System.out.println(string.replace(substring, newsubstring));

    }
}


