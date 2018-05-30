import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Hnin Ei Hlaing";

        Stack<String> myStack = new Stack<String>();
        StringTokenizer st = new StringTokenizer(s);

        while (!myStack.empty()) {
            System.out.print(myStack.pop());
            System.out.print(' ');
        }
        System.out.println("");
    }
}