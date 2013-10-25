import java.util.ArrayList;


public class BookingService {

	public Reservation makeBookingRequest(ReservationRequest reservationRequest){
		return new Reservation("", new ArrayList<Seat>(), "");
	}
}
