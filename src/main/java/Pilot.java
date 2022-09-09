public class Pilot {

    private String name;

    private Rank rank;

    private String licenseNumber;


    public Pilot(String name, Rank rank, String licenseNumber) {
        this.name = name;
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String flyPlane(Pilot pilot) {
        if(pilot.getRank() == Rank.CAPTAIN) {
            return "Can Fly!";
        }else {
            return "Can Not Fly!";
        }
    }
}
