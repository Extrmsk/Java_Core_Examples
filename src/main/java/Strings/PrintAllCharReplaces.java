package Strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Extr on 02.12.2016.
 */

// Find all unique combinations chars in string
public class PrintAllCharReplaces {

    private static Set<String> set;
    private static int count = 0;

    public static void main(String[] args) {
        String str = "aac";
        set = new HashSet<String>();

        recursion("", str);
        System.out.println(set);
        System.out.println("Number of iterations = " + count);
        System.out.println("Number of combinations = " + set.size());
    }


    static void recursion(String begin, String end) {
        if (end.length() == 2) {
            count++;
            set.add(begin + end.charAt(0) + end.charAt(1));
            set.add(begin + end.charAt(1) + end.charAt(0));
        } else {
            int endLength = end.length();
            for (int i = 0; i < endLength; i++) {
                recursion(begin + end.charAt(i), remCharFromString(end, i));
            }
        }
    }

    static String remCharFromString(String str, int index) {
        int strLength = str.length();
        String result;
        if (index == 0) {
            result = str.substring(1);
        } else if (index == strLength - 1) {
            result = str.substring(0, strLength - 1);
        } else {
            result = str.substring(0, index) + str.substring(index + 1, strLength);
        }
        return result;
    }
}
