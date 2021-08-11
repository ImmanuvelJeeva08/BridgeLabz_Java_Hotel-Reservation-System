/******************************************************************************************************************
 *
 *  Start with Displaying Welcome to Hotel Reservation Program in HotelReservation class
 *  Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
 *
 * @author : Immanuvel Jeeva
 * @Since  : 11-08-2021
 *
 ******************************************************************************************************************/
package HotelManagementSystem;

import java.util.ArrayList;

public class HotelReservationSystem {

    static ArrayList<Hotel> HotelsList = new ArrayList<>();

    // To view total HotelList
    public static void view() {
        for (Hotel i : HotelsList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Hotel LakeWood = new Hotel();
        LakeWood.setHotelName("LakeWood");
        LakeWood.setRatePerDay(110);
        HotelsList.add(LakeWood);

        Hotel RidgeWood = new Hotel();
        RidgeWood.setHotelName("RidgeWood");
        RidgeWood.setRatePerDay(150);
        HotelsList.add(RidgeWood);

        Hotel BridgeWood = new Hotel();
        BridgeWood.setHotelName("BridgeWood");
        BridgeWood.setRatePerDay(220);
        HotelsList.add(BridgeWood);

        view();
        Uc2.findCheapHotel(HotelsList);

    }
}
