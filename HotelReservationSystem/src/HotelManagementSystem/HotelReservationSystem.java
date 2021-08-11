/******************************************************************************************************************
 *
 *  Start with Displaying Welcome to Hotel Reservation Program in HotelReservation class
 *  Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
 *  Ability to add weekday and weekend rates for each Hotel - For Lakewood Weekday
 *
 * @author : Immanuvel Jeeva
 * @Since  : 11-08-2021
 *
 ******************************************************************************************************************/
package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    static ArrayList<Hotel> HotelsList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void MainMenu() {

        System.out.println("==================================================================================");
        System.out.println("Hotel Reservation System\n");
        System.out.println("1 . Add a New Hotel ");
        System.out.println("2 . Find cheapest Hotel ");
        System.out.println("3 . Find cheapest Hotel ");
        System.out.println("4 . View Hotel List");
        System.out.println("5 . Exit ");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                Uc3.addNewHotel(HotelsList);
                MainMenu();
            }
            case 2 -> {
                Uc2.findCheapHotel(HotelsList);
                MainMenu();
            }
            case 3 -> {
                Uc4.FindCheapestHotel(HotelsList);
                MainMenu();
            }
            case 4 -> {
                view();
                MainMenu();
            }

            case 5 -> System.out.println("Thank You");
            default -> System.out.println("Enter proper Input");
        }
    }

    // To view total HotelList
    public static void view() {
        for (Hotel i : HotelsList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Hotel LakeWood = new Hotel();
        LakeWood.setHotelName("LakeWood");
        LakeWood.setWeekDayRate(110);
        LakeWood.setWeekEndRate(90);
        HotelsList.add(LakeWood);

        Hotel RidgeWood = new Hotel();
        RidgeWood.setHotelName("RidgeWood");
        RidgeWood.setWeekDayRate(150);
        RidgeWood.setWeekEndRate(50);
        HotelsList.add(RidgeWood);

        Hotel BridgeWood = new Hotel();
        BridgeWood.setHotelName("BridgeWood");
        BridgeWood.setWeekDayRate(220);
        BridgeWood.setWeekEndRate(150);
        HotelsList.add(BridgeWood);

        MainMenu();
    }
}
