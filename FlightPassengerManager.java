
    import java.util.ArrayList;
    public class FlightPassengerManager {
        public static void main(String[] args) {
            ArrayList<String> passenger = new ArrayList<>();
            ArrayList<String> seat = new ArrayList<>();

            passenger.add("Taylor");
            seat.add("11A");
            passenger.add("Ashton");
            seat.add("11B");
            passenger.add("Anna");
            seat.add("11C");
            passenger.add("Rakhee");
            seat.add("11F");
            passenger.add("XYZ");
            seat.add("12F");
            //Print the passenger list with seat assignments.
            System.out.println("Passenger List with seats assignments ");
            for (int i = 0; i < passenger.size(); i++) {
                System.out.println(passenger.get(i) + "-" + seat.get(i));

            }
            //Search for a passenger by name and display their seat.
            System.out.println("Taylor's seat Number:-");
            if (passenger.contains("Taylor")) {
                System.out.println( seat.get(0));
            }
            //Remove a passenger (simulate cancellation).

            int cancelIndex = passenger.indexOf("XYZ");
            if (cancelIndex != -1) {
                passenger.remove(cancelIndex);
                seat.remove(cancelIndex);
            }System.out.println("Passenger" + " "+ "XYZ,"+ " "+ "cancelled the ticket");


            //Print the updated manifest.
            int pcount=0;
            System.out.println("Updated manifest after 1 cancellation:-");
            for (int i = 0; i < passenger.size(); i++) {
                System.out.println(passenger.get(i) + "-" + seat.get(i));
                pcount++;

            }System.out.println("Total passenger-"+ pcount);

        }

    }


