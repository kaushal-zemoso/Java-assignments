package assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrences {

    public static void main(String[] args) throws IOException {

        CountWordOccurrences countWordOccurrences = new CountWordOccurrences();

        Scanner scan = new Scanner(System.in);   //  src/assignment11/input.txt

        System.out.println("Enter the file name: ");
        String fileName = scan.nextLine();

        countWordOccurrences.countCharOccurrences(fileName);
    }
}
