public class FlightManager {


    public int calculateWeight(Flight flight) {
        Plane plane = flight.getPlane();
        double weight = plane.getPlaneWeight();
        int capacity = plane.getPlaneCapacity();
        double totalForOnePassenger = weight / capacity;
        if (totalForOnePassenger > 150) {
            int baggageAllowance = 30;
            return baggageAllowance;
        }else {
            int baggageAllowance = 20;
            return baggageAllowance;
        }
    }
}
