package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        WordInspection s = new WordInspection( new File("src/wordList.txt") );
        System.out.println(s.wordsContainingZ());

    }
}
