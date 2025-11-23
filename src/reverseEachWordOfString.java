public class reverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Java is good programming languages";
        String result  = reverseEachWordOfStrings(str);
        System.out.println(result);
    }

    private static String reverseEachWordOfStrings(String str) {
        String[] strArray = str.split(" ");
        String finalString = "";
        for (int i = 0; i < strArray.length; i++){
            String word = strArray[i];
            char ch;
            String iStr = "";
            for (int j = 0; j < word.length(); j++){
                ch = word.charAt(j);
                iStr= ch + iStr;
            }
            finalString = finalString + iStr + " ";
        }
        return finalString;
    }
}
