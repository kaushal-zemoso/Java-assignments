package assignment2;

public class Alphabets {

    public static void main(String[] args) {

        String inputString = "The quick brown fox jumps over the la dog";
        int count = 0;

        inputString = inputString.toLowerCase();

        boolean flag = false;
        for(char ch = 'a';ch <= 'z'; ch++) {
            if(!inputString.contains(String.valueOf(ch))) {
                flag = true;
                break;
                //count += 1;
            }
        }

        if (flag)
            System.out.println("Input String doesn't contains all alphabets");
        else
            System.out.println("Input String contains all alphabets");
    }
}
