package gr.aueb.cf.ch8;

public class StringDeclaration {
    public static void main(String[] args) {
        String alice="Alice";
        String alice2="Alice";
        String bob=new String("Bob");

        System.out.println(alice);
        System.out.printf("%s", alice2);
        System.out.println(alice+" "+bob);

    }
}
