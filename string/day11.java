package string;
import java.util.Scanner;
public class day11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();

        // explain string builder methods
        // StringBuilder is mutable, meaning it can be changed after it is created
        // String is immutable, meaning it cannot be changed after it is created
        // StringBuilder is more efficient than String when it comes to concatenation
        // StringBuilder is not thread-safe, meaning it is not safe to use in a multi-threaded environment
        // String is thread-safe, meaning it is safe to use in a multi-threaded environment
        // StringBuilder is faster than String when it comes to concatenation
        // StringBuilder is slower than String when it comes to searching for a substring


        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        
        // sb.append("hello"); // this will append "hello" to the end of the string
        // System.out.println(sb);
        // sb.insert(0, "hi"); // this will insert "hi" at the specified index
        // System.out.println(sb);
        // sb.replace(0, 2, "hiii"); // this will replace the specified index with "hi"
        // System.out.println(sb);
        // sb.delete(0, 2); // this will delete the specified index
        // System.out.println(sb);
        // sb.deleteCharAt(2); // this will delete the character at the specified index
        // System.out.println(sb);
        // System.out.println(sb.reverse()); // this will reverse the string
        // System.out.println(sb.length()); // this will return the length of the string
        // // char ch = sb.charAt(1); // this will return the character at the specified index
        // System.out.println(sb.charAt(1));
        // sb.setCharAt(1, 'a'); // this will set the character at the specified index
        // System.out.println(sb);
        // String y = sb.substring(0, 3); // this will return the substring from the specified index
        // System.out.println(sb.substring(3));
        // System.out.println(y);
        // System.out.println(sb.indexOf("h")); // this will return the index of the specified character
        // System.out.println(sb.lastIndexOf("a")); // this will return the last index of the specified character
        // sb.setLength(2);
        // System.out.println(sb); // this will set the length of the string

        // String s1 = "SITHA";
        // String s2="RAMA";
        // System.out.println((int)'S');
        // System.out.println((int)'R');
        // System.out.println(s1.charAt(0)>s2.charAt(0)); 

        sc.close();
    }
}
