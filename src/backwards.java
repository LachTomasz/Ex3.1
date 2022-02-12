public class backwards {

    public static void main(String[] args) {
        char[] backwards = new char[]{'p','r','o','g','r','a','m','o','w','a','n','i','e'};
        for(int i = backwards.length-1; i>=0; i--){
            System.out.print(backwards[i]);
        }
        System.out.println();
    }
}
