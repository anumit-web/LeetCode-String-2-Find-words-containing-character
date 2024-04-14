/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Find words containing character");

        Solution solution = new Solution();

        String[] words1 =  {"leet","code"};
        char x1 = 'e';
        List<Integer> output1 = solution.findWordsContaining(words1, x1);
        System.out.println("Output = " + output1);

        String[] words2 =  {"abc","bcd","aaaa","cbc"};
        char x2 = 'a';
        List<Integer> output2 = solution.findWordsContaining(words2, x2);
        System.out.println("Output = " + output2);




    }
}
