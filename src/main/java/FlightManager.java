public class FlightManager {


    public int calculateWeight(Flight flight) {
        Plane plane = flight.getPlane();
        double planeWeight = plane.getPlaneWeight();
        double baggageWeight = planeWeight / 2;
        int capacity = plane.getPlaneCapacity();
        double totalForOnePassenger = baggageWeight / capacity;
        if (totalForOnePassenger > 75) {
            return 30;
        }else {
            return 20;
        }
    }


    public int bookBaggage(Flight flight, Passenger passenger) {
        int bagWeight = calculateWeight(flight);
        if(passenger.getNumberOfBags() > 2 && bagWeight == 30) {
            return 30;
        } else {
            return 20;
        }
    }


    public double checkRemainingWeight(Flight flight, Passenger passenger) {
        int eachBagWeight = bookBaggage(flight, passenger);
        Plane plane = flight.getPlane();
        double totalBaggageWeight = plane.getPlaneWeight() / 2;
        return totalBaggageWeight - eachBagWeight;

    }
}
