public class backwards2 {
    public static void main(String[] args) {
        char[] wort = new char[]{'p','r','o','g','r','a','m','m','i','n','g'};
        char temp;
        System.out.println(wort);
        for(int i = 0, j = wort.length - 1;  i<j ; i++,j--){
            temp = wort[i];
            wort[i] = wort[j];
            wort[j] = temp;
            System.out.println("Step" + i);
            System.out.println(wort);
        }
    }
}
