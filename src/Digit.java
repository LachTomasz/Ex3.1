public class Digit {
    public static void main(String[] args) {
        char[] digit = new char[10];
        for (int i = 0; i < 10; i++)
            digit[i] = (char) (i + 48);
        for (char x : digit) {
            System.out.print(x);
        }
        System.out.println();
        for (int i = 48; i < 58; i++)
            digit[i-48] = (char) i;
        System.out.println(digit);
    }
}
