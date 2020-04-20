public class NotificationSystem {
    void onBooking(int bookingID, String userID)
    {
        System.out.println("Sending notification to user"+userID+" on bookingID"+bookingID);
    }
    void onBookingCancelled(int bookingID, String userID)
    {
        System.out.println("Sending notification to user"+userID+" on bookingID"+bookingID);
    }
    void onNewRelease(int movieID)
    {
        System.out.println("Sending notification to all registered users for movieID"+movieID);
    }
}
