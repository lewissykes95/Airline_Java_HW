public enum PlaneType {
    BOEING747(300, 41000),
    BOEING777(200, 39000),
    BOEING737MAX(500, 46000);

    private final int capacity;

    private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

}
