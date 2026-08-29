public class doubleX {
    public static void main(String[] args) {
        System.out.println("doubleX attempt - string \"axxbb\" - first instance of x is followed by an x is "
                + doubleX("axxbb"));
        System.out.println("doubleX2 attempt - string \"xaxxx\" - first instance of x is followed by an x is "
                + doubleX2("xaxxx"));
        System.out.println("doubleX3 attempt - string \"xxxx\" - first instance of x is followed by an x is "
                + doubleX3("xxxx"));
    }

    public static boolean doubleX(String str) {
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'x') {
                if(str.charAt(i + 1) == 'x') {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean doubleX2(String str) {
        int i = str.indexOf('x'); // find the first x location
        if (i == -1) {
            return false; // -1 means there are no 'x's
        }

        if(i + 1 >= str.length()) {
            return false; // Out of bounds
        }

        return str.substring(i+1, i+2).equals("x"); // if the next letter is x, true
    }

    public static boolean doubleX3(String str) {
        int i = str.indexOf("x");
        if(i == -1) {
            return false;
        }

        String x = str.substring(i);
        return x.startsWith("xx"); // determines if string starts with specified characters
    }
}