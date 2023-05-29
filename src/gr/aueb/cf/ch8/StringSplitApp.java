package gr.aueb.cf.ch8;

/**
 * Splits a string.
 */
public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens            Uni if Econ and Business";

        String[] tokens = s.split(" ");

        for(String token : tokens){
            System.out.println(token);
        }
    }
}
