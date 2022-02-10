import java.lang.Character;
public class Informatik {
    public static void main(String[] args) {
        char[] wort = new char[]{'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};
        //Waagrecht
        System.out.println();
        for(int i=0; i < wort.length; i++){
            System.out.print(wort[i] + " ");
        }
        System.out.println();
        linie();
        //Senkrecht
        for(char x : wort){
            System.out.println(x);
        }
        linie();
        //Waagrecht kleinen buchstaben
        for(char x : wort){
            System.out.print(Character.toLowerCase(x));
        }
        System.out.println();
        linie();
        //Waagrecht grossen buchstaben
        for(char x : wort){
            System.out.print(Character.toUpperCase(x));
        }
        System.out.println();
        linie();
    }
    static void linie(){
        System.out.println();
        System.out.println("*********************************");
        System.out.println();
    }
}
