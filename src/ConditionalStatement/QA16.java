package ConditionalStatement;

import java.util.Scanner;

public class QA16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.next();

        System.out.print("Enter Password: ");
        int pass = sc.nextInt();

        if (user.equals("adi")) {
            System.out.println("USERNAME IS CORRECT");

            if (pass == 432) {
                System.out.println("PASSWORD IS CORRECT");
            } else {
                System.out.println("PASSWORD IS WRONG");
            }

        } else {
            System.out.println("USERNAME IS WRONG");
        }

    }
}
