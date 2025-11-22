public class ReversedString {
    public static void main(String[] args) {
        String str = "kishan";
        String result = reverseStrings(str);
        System.out.println(result);
    }

    private static String reverseStrings(String str) {
        char ch;
        String nstr = "";
        for (int i = 0;  i< str.length();  i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
}
