public class CabinCrewMember {
    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }



    public String messagePassengers(CabinCrewMember cabinCrewMember) {
        if(cabinCrewMember.getRank() == Rank.FLIGHTATTENDANT) {
            return "Can you fasten your seatbelts?";
        }else{
            System.out.println("Not Flight Attendant");
            return "Nothing";
        }
    }
}
