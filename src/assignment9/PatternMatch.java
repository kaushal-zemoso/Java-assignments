package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatch {

    public boolean matchPattern(String sentence) {

        String regex = "^[A-Z].*[.]$";
        boolean match = Pattern.matches(regex, sentence);

        return match;
    }

/*
    This class takes input from the in main() and checks whether the sentence start with a capital letter
    and ends with a period using matchPattern() method.
*/

    public static void main(String[] args) {

        PatternMatch patternMatch = new PatternMatch();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Enter sentence: ");
        String sentence = scanner.next();

        boolean checkPattern = patternMatch.matchPattern(sentence);

        if (checkPattern) {
            System.out.println(sentence+": Starts with capital letter and ends with a period");
        } else {
            System.out.println("It doesn't match with the pattern");
        }
    }
}
