package Strings;

/**
 * Created by Extr on 02.12.2016.
 */
// Delete all chars 'a' from string
public class DelSimbolFromString {
    public static void main(String[] args) {
        String str = "abababa";
        System.out.println(str);
        System.out.println(removeChar(str, 'a'));

    }

    static String removeChar(String str, char ch) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(ch), "");
    }
}
