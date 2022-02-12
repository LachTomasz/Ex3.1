import static java.lang.System.*;
public class DemoCharacter {
    public static void main(String[] args) {
        /*Information about the method*/
        out.println("Klasa: java.lang.Character");
        out.println("Metoda statyczna: digit\n");
        out.println("static int digit(int ch, int radix)");
        out.println("Returns the numeric value of the character ch in the specified radix.");
        out.println();
        /*Example of a char table*/
        char[] znak = {'E','u','r','o',' ','2','0','2','2'};
        /*Demonstracja działania metody*/
        out.println("Wartość znaku jako cyfry w układzie dziesiętkowym (radix = 10)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+Character.digit(z,10));
        out.println("Uwaga: -1 oznacza, że znak nie jest cyfrą w tym układzie liczbowym");
        out.println();
        out.println("Wartość xnaku jako cyfry w układzie szesnastkowym (radix = 16)");
        for(char z : znak)
            out.println("Znak: "+z+" Cyfra: "+Character.digit(z,16));
        out.println("Uwaga: -1 oznacza, że znak nie jest cyfrą w tym układzie liczbowym");
        out.println();
    }
}
