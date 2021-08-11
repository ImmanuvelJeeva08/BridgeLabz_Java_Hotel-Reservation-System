package HotelManagementSystem;

public class InvalidEntryException extends Exception {

    // To check the Entries or valis or Not
    enum ExceptionType {
        INVALID,VALID
    }

    public InvalidEntryException(String message) {
        super(message);
    }
}
