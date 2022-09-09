public enum Rank {
    CAPTAIN(1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4);

    private final int value;
    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
