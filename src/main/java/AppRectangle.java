

import java.io.Console;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AppRectangle{
    public static void main(String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        Console myConsole = System.console();
//        char[] charName = {};

            System.out.println("=========Welcome to DISCOVER RECTANGLE!=============");

            System.out.print("What is your name? ");
                String enteredName = myConsole.readLine();
//                charName = enteredName.toCharArray();
//                System.out.println(enteredName.toCharArray());

            System.out.print("Hello " + enteredName + ", enter the dimensions below: ");

            System.out.print("Enter the length: ");
                int enteredLength = Integer.parseInt(myConsole.readLine());
            System.out.print("Enter the width: ");
                int enteredWidth = Integer.parseInt(myConsole.readLine());

            Rectangle newRectangle = new Rectangle(enteredLength, enteredWidth);

            newRectangle.ifSquare();

            if (newRectangle.ifSquare() == true) {
                System.out.println("----------------");
                System.out.println("The dimensions are for a square");
            } else if (newRectangle.ifSquare() == false) {
                System.out.println("----------------");
                System.out.println("The dimensions are for a rectangle");
            } else {
                System.out.println("----------------");
                System.out.println("The dimensions are not valid!");
            }

//            To print the date rn
        String inputDate = "08/27/2001";
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date inputDateConverted = new Date();

        inputDateConverted = df.parse(inputDate);
        SimpleDateFormat sdf = new SimpleDateFormat("E, MMMM d, yyyy");
        System.out.println(enteredName + "Your date of birth is: " + sdf.format(inputDateConverted));

    }
}