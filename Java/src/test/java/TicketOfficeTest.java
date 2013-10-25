import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;


public class TicketOfficeTest {

	@Test
	public void reserveSeats() {
		// TODO: Write this code!

	}

	@Ignore
	@Test
	public void shouldReturnReservationDetailsForABookingOnAParticularTrain() {
		List<Seat> reservedSeats = new ArrayList<Seat>();
		reservedSeats.add(new Seat("", 1));
		Reservation expectedReservationDetails = new Reservation("trainId", reservedSeats, "bookingId");
		
		Reservation reservationDetails = new BookingService().makeBookingRequest(new ReservationRequest("trainId", 1));
		
		assertThat(reservationDetails, is(expectedReservationDetails ));
	}
}
