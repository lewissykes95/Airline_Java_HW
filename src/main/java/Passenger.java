import java.util.ArrayList;

public class Passenger {
    private String name;
    private int numberOfBags;
    private Flight flight;

    private int seatNumber;

    public Passenger(String name, int numberOfBags, Flight flight) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
        this.seatNumber = getSeatNumber();
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

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public ArrayList<Object> setRandomSeatNumber() {
        int min = 1;
        int max = 50;
        this.seatNumber = (int)Math.floor(Math.random()*(max-min+1)+min);

    }
}
