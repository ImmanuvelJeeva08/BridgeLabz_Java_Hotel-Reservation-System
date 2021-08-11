/******************************************************************************************************************
 *
 *  Start with Displaying Welcome to Hotel Reservation Program in HotelReservation class
 *  Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
 *  Ability to add weekday and weekend rates for each Hotel - For Lakewood Weekday
 *  Ability to add ratings to each Hotel Lakewood is 3, Bridgewood is 4 and Ridgewood is 5
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

    // MainMenu of Hotel Reservation System
    public static void MainMenu() {

        System.out.println("==================================================================================");
        System.out.println("Hotel Reservation System\n");
        System.out.println("1 . Add a New Hotel ");
        System.out.println("2 . Find cheapest Hotel ");
        System.out.println("3 . Find cheapest Hotel based on weekDays and WeekEnds");
        System.out.println("4 . Find cheapest Hotel with Best Ratings");
        System.out.println("5 . View Hotel List");
        System.out.println("6 . Exit ");
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
                Uc6.cheapHotelBestRate(HotelsList);
                MainMenu();
            }
            case 5 -> {
                view();
                MainMenu();
            }

            case 6 -> System.out.println("Thank You");
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
        LakeWood.setRating(3);
        HotelsList.add(LakeWood);

        Hotel BridgeWood = new Hotel();
        BridgeWood.setHotelName("BridgeWood");
        BridgeWood.setWeekDayRate(150);
        BridgeWood.setWeekEndRate(50);
        BridgeWood.setRating(4);
        HotelsList.add(BridgeWood);

        Hotel RidgeWood = new Hotel();
        RidgeWood.setHotelName("RidgeWood");
        RidgeWood.setWeekDayRate(220);
        RidgeWood.setWeekEndRate(150);
        RidgeWood.setRating(5);
        HotelsList.add(RidgeWood);

        MainMenu();
    }
}
