import java.util.Scanner;

public class AirlineReservationsSystem {
    public static void main(String[] args) {
	boolean[] seats = new boolean[10];
        Scanner keyboard = new Scanner(System.in);


	while (true){
        System.out.println("Kindly type 1 for First Class or 2 for Economy:");
            int choice = keyboard.nextInt();
		if (choice != 1 && choice != 2) {
            	    System.out.println("Invalid choice. Please enter 1 for First Class or 2 for Economy.");
            	    continue;
		}


            int seatIndex = -1;
            if (choice == 1) {
            	for (int i = 0; i < 5; i++) {
                    if (!seats[i]) {
                    	seats[i] = true;
                    	seatIndex = i;
                   	break;
                    }
            	}

            	if (seatIndex == -1) {
                    System.out.println("Do you want an Economy seat, First Class is currently full. reply (Y/N)");
                    String answer = keyboard.next();
                    if (answer.equalsIgnoreCase("Y")) {
                        for (int i = 5; i < 10; i++) {
                            if (!seats[i]) {
                                seats[i] = true;
                                seatIndex = i;
                                break;
                            }
                        }

                    } else {

                          System.out.println("Next flight leaves in 3 hours.");

                    }
            	}


            } else if (choice == 2) {
            	for (int i = 5; i < 10; i++) {
                    if (!seats[i]) {
                    	seats[i] = true;
                    	seatIndex = i;
                    	break;
               	     }
            	}

            	if (seatIndex == -1) {
                    System.out.println("Do you want a First Class seat, Economy is currently full. (Y/N)");
                	String answer = keyboard.next();
                	if (answer.equalsIgnoreCase("Y")) {
                            for (int i = 0; i < 5; i++) {
                                if (!seats[i]) {
                            	    seats[i] = true;
                            	    seatIndex = i;
                            	    break;
                        	 }
                    	    }

                	} else {

                    	    System.out.println("Next flight leaves in 3 hours.");
                	}
            	}

	    }

        if (seatIndex != -1) { 
            String coach = "";

            if (seatIndex < 5) {

                coach = "First Class";
            } else {
                coach = "Economy";

            }

            System.out.println();
            System.out.println("=============================================================");
            System.out.println("BOARDING PASS");
            System.out.println("=============================================================");
            System.out.println("Seat Number: " + (seatIndex + 1));
            System.out.println("COACH: " + coach);
            System.out.println("=============================================================");
            System.out.println();

        }

    }


	}


}


