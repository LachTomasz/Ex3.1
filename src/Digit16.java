public class Digit16 {
    public static void main(String[] args) {
        char[] digit = new char[16];
        for(int i = 0; i < 16; i++)
            digit[i] = Character.toUpperCase(Character.forDigit(i,16));
        System.out.println(digit);
    }
}
