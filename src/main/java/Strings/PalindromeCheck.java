package Strings;

/**
 * Created by Extr on 02.12.2016.
 */
public class PalindromeCheck {
    public static void main(String[] args) {

        String strPalin = "aba";
        String str = "a";

        System.out.println("StringBuilder check");
        System.out.println("Does string " + strPalin + " is palindrome? " + palindromBuilderCheck(strPalin));
        System.out.println("Does string " + str + " is palindrome? " + palindromBuilderCheck(str));

        System.out.println("Native check");
        System.out.println("Does string " + strPalin + " is palindrome? " + palindromNativeCheck2(strPalin));
        System.out.println("Does string " + str + " is palindrome? " + palindromNativeCheck2(str));


    }

    static boolean palindromBuilderCheck(String str) {
        StringBuilder builder = new StringBuilder(str);
        if (str == null) return false;
        builder.reverse();
        return (builder.toString().equals(str));
    }

    static boolean palindromNativeCheck(String str) {
        if (str == null) return false;
        String revStr = "";
        char[] strChar = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += strChar[i];
        }
        return revStr.equals(str);
    }

    static boolean palindromNativeCheck2(String str) {
        if (str == null) return false;
        int length = str.length();
        for (int i = length - 1; i >= length / 2; i--) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
