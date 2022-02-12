import java.lang.Character;
public class Programmierung {
    public static void main(String[] args) {
        char[] wort = new char[]{'p','r','o','g','r','a','m','m','i','e','r','u','n','g'};
        System.out.println();
        for(int i=0; i < wort.length; i++){
            if (i==0) {
                System.out.print(Character.toUpperCase(wort[i]));
                i++;
            }
                System.out.print(wort[i]);
        }
        System.out.println();
        for (char x : wort) {
            System.out.print(Character.toUpperCase(x));
        }
    }
}
