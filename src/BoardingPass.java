import java.util.Objects;
import java.util.Scanner;

public class BoardingPass {

    public static final Boolean[] seatsArray = new Boolean[10];

    public BoardingPass(String firstName, String lastName) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter passenger first name: ");
        String firstName1 = input.nextLine();
        System.out.print("Enter passenger last name: ");
        String lastName1 = input.nextLine();
        System.out.println("**********************");
    }
    //ENROL IN SEAT

    private boolean seats(int i, int i1, String firstClass) {

        return false;
    }

    private boolean offerAlternateClass(int i, int i1, String Economy) {

        return false;
    }

    public void enrol () {
        // get inside a loop, keep enrolling and hit Q to exit when they are done.
        do {
            System.out.print("Enter sitting class to board, (Q to quit): ");
            System.out.println("1 - First Class\n2 - Economy\nEnter boarding class: ");
            Scanner input = new Scanner(System.in);
            int sittingClass = input.nextInt();
                if (sittingClass == 1) {
                    if (!seats(0, 4, "First Class")) {
                        if (offerAlternateClass(5, 9, "Economy")) {
                            seats(5, 9, "Economy");
                        }
                    }
                }
            else {
                break;
            }
        }
        while (1 != 0);
    }


        /** System.out.println("Please type 1 for First Class or 2 for Economy");
        int passengerClass = input.nextInt();
        System.out.println(passengerClass);
        for (int i = 0; i < array.length; i++) {
            if (passengerClass == 1 ){
                for (int j = 0; j < array.length; j++) {
                    array[]

                }
            }

        }**/
}


