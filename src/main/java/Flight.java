import java.util.ArrayList;

public class Flight {

    private Pilot pilot;

    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private ArrayList<Passenger> bookedPassengers;

    private Plane plane;

    private String flightNumber;

    private String destination;

    private String departureAirport;

    private String departureTime;


    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.bookedPassengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int getBookedPassengers() {
        return bookedPassengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if(this.plane.getPlaneCapacity() > this.bookedPassengers.size()) {
            this.bookedPassengers.add(passenger);
        }
    }
}
