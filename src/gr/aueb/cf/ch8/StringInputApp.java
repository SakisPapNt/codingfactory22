package gr.aueb.cf.ch8;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
        //s = in.next();//ends with whitespace(space, \t, \n)
        s=in.nextLine();

        System.out.println(s);
    }
}
