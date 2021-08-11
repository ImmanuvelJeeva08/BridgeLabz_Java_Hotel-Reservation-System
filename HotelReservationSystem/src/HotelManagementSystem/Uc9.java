/******************************************************************************************************************
 *
 *  Ability to add special rates for reward customers as a part of Loyalty Program
 *  - For Lakewood for Reward Customer Weekday & Weekend Rates per day is $80 & $80
 *  - For Bridgewood $110 and $50
 *
 * @author : Immanuvel Jeeva
 * @Since  : 11-08-2021
 *
 ******************************************************************************************************************/
package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc9 {

    public static void addNewHotel(ArrayList<Hotel> hotelsList) {

        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter HotelName");
        String hotelName = scanner.next();
        hotel.setHotelName(hotelName);

        System.out.println("Enter the Customer Category");
        System.out.println("Press 1 - Reword");
        System.out.println("Press 2 - Regular");
        int foodTaste = scanner.nextInt();

        if(foodTaste == 1)
            hotel.setCustomerType(Hotel.Customer.REWORD);
        else if(foodTaste == 2)
            hotel.setCustomerType(Hotel.Customer.REGULAR);

        System.out.println("Enter Rating of the Hotel");
        int rate = scanner.nextInt();
        hotel.setRating(rate);

        System.out.println("Enter Rate in WeekDays");
        int weekDays = scanner.nextInt();
        hotel.setWeekDayRate(weekDays);

        System.out.println("Enter Rate in WeekEnds");
        int weekEnds = scanner.nextInt();
        hotel.setWeekEndRate(weekEnds);

        hotelsList.add(hotel);
    }
}
