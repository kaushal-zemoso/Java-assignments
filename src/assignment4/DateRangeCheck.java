package assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRangeCheck {

    public boolean validateDate(String date) {

        boolean validDate = false;
        if(date.length()==10) {
            validDate = true;
        }
        return validDate;
    }
    public static void getRangeOfDates(String signup, String current) throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        simpleDateFormat.setLenient(false);

        Date signupDate = null, currentDate = null;

        try{
            signupDate = simpleDateFormat.parse(signup);
            currentDate = simpleDateFormat.parse(current);
        }
        catch(Exception e){
            System.out.println("Date is Invalid!");
        }


        if(signupDate.after(currentDate)) {

            System.out.println("No Range");
        }
        else{

            Calendar signUpDateCalendar = GregorianCalendar.getInstance();
            signUpDateCalendar.setTime(signupDate);


            Calendar currentDateCalendar = GregorianCalendar.getInstance();
            currentDateCalendar.setTime(currentDate);



            int years = currentDateCalendar.get(Calendar.YEAR) - signUpDateCalendar.get(Calendar.YEAR);
            signUpDateCalendar.add(GregorianCalendar.YEAR, years);

            signUpDateCalendar.add(GregorianCalendar.DAY_OF_MONTH, -30);

            System.out.print(simpleDateFormat.format(signUpDateCalendar.getTime())+" ");

            signUpDateCalendar.add(GregorianCalendar.DAY_OF_MONTH, 60);



            if(signUpDateCalendar.before(currentDateCalendar)) {

                System.out.println(simpleDateFormat.format(signUpDateCalendar.getTime()));
            }
            else {

                System.out.println(simpleDateFormat.format(currentDateCalendar.getTime()));
            }

        }

    }
}
