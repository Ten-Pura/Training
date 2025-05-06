package Car_02;

public enum CarType {
    SPORTS(300),
    SEDAN(180),
    TRUCK(120);

    private final int maxSpeed;

    CarType(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}