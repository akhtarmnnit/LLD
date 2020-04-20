import java.util.*;
public class BookingController {
    Map<Integer,Show> allRunningshowMap;//Load this with all active shows
    Ticket book(int showID,List<Seat> seats)//Get all details of the show and return movie ticket
    {
        Ticket ticket = new Ticket();
        Show show = getShow(showID);
        show.reserveSeat(seats);
        return ticket;
    }
    Show getShow(int showID)
    {
        return allRunningshowMap.get(showID);
    }
}
