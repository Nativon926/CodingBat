public class Main {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        String str = "xxx";

        for(int i = 0; i < n; i++) {
            if(str.substring(i, i + 2).equals("xx")) {
                count = count + 1;
            }
        }

        System.out.println("the number of xx in " + str + " is " + count);
    }
}