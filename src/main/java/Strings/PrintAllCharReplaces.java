package Strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Extr on 02.12.2016.
 */
public class PrintAllCharReplaces {
    private static Set<String> set;
    private static int count = 0;

    public static void main(String[] args) {
        String str = "abcdefg";
        set = new HashSet<String>();

        recursion("",str);

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("Number of iterations = " + count);
        System.out.println("Number of combinations = " + set.size());

    }

    static void recursion(String begin, String end) {
        if (end.length() == 2) {
            count++;
            String str1 = begin + end.charAt(0) + end.charAt(1);
            String str2 = begin + end.charAt(1) + end.charAt(0);
            set.add(str1);
            set.add(str2);
        } else {
            for (Character ch : end.toCharArray()) {
                recursion((begin + ch), end.substring(0, end.length() - 1));
            }
        }
    }
}
