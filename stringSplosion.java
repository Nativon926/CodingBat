public class stringSplosion {
    public static void main(String[] args) {
        String first = "Code";
        System.out.println("After first method: " + stringSplosionMethod(first));
        System.out.println("After second method: " + stringSplosionMethodLoop(first));
    }

    public static String stringSplosionMethod(String str) {
        String newStr = "";

        newStr = newStr + str.substring(0, 1);
        System.out.println(newStr);

        newStr = newStr + str.substring(0, 2);
        System.out.println(newStr);

        newStr = newStr + str.substring(0, 3);
        System.out.println(newStr);

        newStr = newStr + str.substring(0, 4);
        System.out.println(newStr);

        return newStr;
    }

    public static String stringSplosionMethodLoop(String str) {
        String newStr = "";

        for(int i = 1; i < str.length() + 1; i++) {
            newStr = newStr + str.substring(0, i);
        }

        return newStr;
    }
}