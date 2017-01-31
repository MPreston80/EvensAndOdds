import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String userName = scan1.nextLine();

        String userinput2 = "yes";
        do {
            System.out.println("Please enter an integer between 1 and 100: ");

            int userInput = scan1.nextInt();


            if (userInput < 1 || userInput > 100) {
                System.out.println("Invalid entry!");
                break;
            }

            if (userInput % 2 != 0) {
                System.out.println(userName + ", you entered: " + userInput + ", an odd number.");
            } else if ((userInput % 2 == 0) && (userInput >= 2 && userInput <= 25)) {
                System.out.println("Even and less than 25");
            } else if ((userInput % 2 == 0) && (userInput >= 26 && userInput <= 60)) {
                System.out.println("Even");
            } else if ((userInput % 2 == 0) && (userInput > 60)) {
                System.out.println(userName + ", you entered: " + userInput + ", an even number.");
            }



            System.out.println("Keep playing " + userName + "?  Enter yes or no:");
            scan1.nextLine();
            userinput2 = scan1.nextLine();


        }




        while (userinput2.equalsIgnoreCase("yes"));






        return;
    }
}
