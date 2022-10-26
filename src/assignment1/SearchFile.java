package assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SearchFile {

    // In this function, We are returning the count whenever the file is found.
    private static int findFile(File file, String regex){

        boolean fileFound = false;
        int count = 0;
        File[] filesList = file.listFiles();
        
        for(File files : filesList){
            if(files.isDirectory()) {
                count += findFile(files,regex);
            } else if(files.isFile()) {

                String fileName = files.getName();    // It stores the name of the file.
                fileFound = Pattern.matches(regex, fileName);   // Returns true if pattern matches.

                if(fileFound) {

                    System.out.println(files.getAbsolutePath());   // It prints the absolute path of the file.
                    count++;
                }

            }

        }

        return count;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = null;
        String homeDirectory = System.getProperty("user.home");  // It retrieves the home directory path.
        File rootFolder = new File(homeDirectory);
        
        int count=0;
        while(true){
            System.out.println("Enter a regular expression to search files, to quit enter -1");
            inputString = scanner.nextLine();

            if(inputString.equals("-1")){
                break;
            }

            count += findFile(rootFolder,inputString);	// searches for file names in root folder.

            if(count==0){
                System.out.println("File not found!");
            }
        }
    }
}
