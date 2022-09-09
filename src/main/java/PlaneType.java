public enum PlaneType {
    BOEING747(250, 35000.00),
    BOEING777(200, 39000.00),
    BOEING737MAX(300, 46000.00);

    private final int capacity;

    private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
