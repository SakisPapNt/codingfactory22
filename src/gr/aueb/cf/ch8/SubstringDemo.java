package gr.aueb.cf.ch8;

public class SubstringDemo {
    public static void main(String[] args) {
        String s="Athens Uni of Economics and Bus";

        for(int i=0;i< s.length();i++){
            System.out.print(s.substring(i,i+1));
        }
    }
}
