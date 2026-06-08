import java.util.Scanner;

    public class FlightPass {
        public static void main(String[] args) {
            boolean[] seats = new boolean[10]; // false means seat is available
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Please type 1 for First Class");
                System.out.println("Please type 2 for Economy");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    if (!assignSeat(seats, 0, 4, "First Class")) {
                        System.out.println("First Class is full. Would you like to be placed in Economy? (yes/no)");
                        String response = scanner.next();
                        if (response.equalsIgnoreCase("yes")) {
                            if (!assignSeat(seats, 5, 9, "Economy")) {
                                System.out.println("Economy is also full. Next flight leaves in 3 hours.");
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                } else if (choice == 2) {
                    if (!assignSeat(seats, 5, 9, "Economy")) {
                        System.out.println("Economy is full. Would you like to be placed in First Class? (yes/no)");
                        String response = scanner.next();
                        if (response.equalsIgnoreCase("yes")) {
                            if (!assignSeat(seats, 0, 4, "First Class")) {
                                System.out.println("First Class is also full. Next flight leaves in 3 hours.");
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            }
        }

        // Helper method to assign a seat
        public static boolean assignSeat(boolean[] seats, int start, int end, String section) {
            for (int i = start; i <= end; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    System.out.println("Boarding pass: Seat #" + (i + 1) + " - " + section);
                    return true;
                }
            }
            return false;
        }
    }