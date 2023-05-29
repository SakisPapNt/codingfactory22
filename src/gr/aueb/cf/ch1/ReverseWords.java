package gr.aueb.cf.ch1;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class ReverseWords {
    public static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output
    }
}