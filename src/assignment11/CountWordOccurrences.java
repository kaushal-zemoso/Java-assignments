package assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrences {

    public static void countCharOccurrences(String file) throws IOException {

        int count, charValue;
        File inputFile = new File(file);
        FileReader fileReader = new FileReader(inputFile);

        Map<Character, Integer> countChar = new HashMap<Character, Integer>();

        while ((charValue = fileReader.read()) != -1) {

            char ch = (char) charValue;

            if (countChar.containsKey(ch)) {
                countChar.put(ch, countChar.get(ch) + 1); // If char is present in countChar incrementing the count by 1
            } else {
                countChar.put(ch, 1);  // If char is not present in countChar, putting this char to countChar with 1 as it's value
            }
        }

        PrintWriter output = new PrintWriter("output.txt");

        for (Map.Entry m : countChar.entrySet()) {

            //System.out.println(m);
            String result = "Character "+m.getKey()+" occurred "+m.getValue()+" times.";

            System.out.println(result);
            output.println(result);
        }
    }
}
