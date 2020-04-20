

import java.io.Console;


public class AppRectangle{
    public static void main (String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        Console myConsole = System.console();

            System.out.println("=========Welcome to DISCOVER RECTANGLE!=============");

            System.out.print("What is your name? ");
                String enteredName = myConsole.readLine();
//                char[] charName = enteredName.toCharArray();
                System.out.println(enteredName.toCharArray());

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

    }
}