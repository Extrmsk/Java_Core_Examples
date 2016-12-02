package Strings;
import java.util.Stack;
/**
 * Created by Extr on 02.12.2016.
 */
// Examples of reverse String
public class StringReverse {
        public static void main(String[] args) {
            String str = "abcde";
            System.out.println("String = " + str);

            //1 Use Char[] array
            String res = "";
            char[] ch = str.toCharArray();
            for (int i=ch.length-1; i>=0; i--) {
                res += ch[i];
            }
            System.out.println("1) " + res);

            //2 Use StringBuffer
            StringBuffer buf = new StringBuffer(str);
            System.out.println("2) " + buf.reverse());

            //3 Use StringBuilder
            StringBuilder builder = new StringBuilder();
            char[] ch2 = str.toCharArray();
            for (int i=str.length()-1; i>=0; i--) {
                builder.append(str.charAt(i));
            }
            System.out.println("3) " + builder.toString());

            //4 Use recursion
            System.out.println("4) " + recursionRev(str));

            //5 Use Stack
            System.out.println("5) " + stackRev(str));
        }

        static String recursionRev(String s) {
            if ((s == null) || (s.length() < 1)) {
//            System.out.println("end recursion " + s);
                return s;
            }
//        System.out.println("next iteration " + s);
            return recursionRev(s.substring(1)) + s.charAt(0);
        }

        static String stackRev(String s) {
            Stack<Character> st = new Stack<Character>();
            for (Character character: s.toCharArray()) {
                st.push(character);
            }
            StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()){
                sb.append(st.pop());
            }
            return sb.toString();
        }
    }
