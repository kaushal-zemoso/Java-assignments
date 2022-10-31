package assignment4;

import java.util.Scanner;

public class KycWindow {

    public static void main(String[] args)  {

        DateRangeCheck dateRangeCheck = new DateRangeCheck();

        System.out.println("Enter number of inputs: ");

        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();

        String dateSet[][] = new String[numberOfInputs][2];
        System.out.println("Enter the dates: ");

        String signupDate = null;
        String currentDate = null;

        for(int i = 0;i < numberOfInputs; i++) {

            signupDate = scanner.next();
            currentDate = scanner.next();
            dateSet[i][0] = signupDate;
            dateSet[i][1] = currentDate;
        }


        for(int i = 0;i < numberOfInputs; i++){
            try {
                if(dateRangeCheck.validateDate(dateSet[i][0]) && dateRangeCheck.validateDate(dateSet[i][1])){
                    dateRangeCheck.getRangeOfDates(dateSet[i][0], dateSet[i][1]);
                }
            } catch (Exception e) {
                System.out.println("Date is Invalid");
            }
        }

    }
}
