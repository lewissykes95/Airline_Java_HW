public class Passenger {
    private String name;
    private int numberOfBags;
    private Flight flight;

    private int seatNumber;

    public Passenger(String name, int numberOfBags, Flight flight, int seatNumber) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


    public int getSeatNumber() {
        return this.seatNumber;
    }
}
