package Car;

public class Driver
{
    private int driverWeightKg;
    private boolean isWearingSunglasses;


    public Driver(int driverWeightKg, boolean isWearingSunglasses)
    {
        this.driverWeightKg = driverWeightKg;
        this.isWearingSunglasses = isWearingSunglasses;
    }


    public int getDriverWeightKg()
    { return driverWeightKg; }

    public void setDriverWeightKg(int driverWeightKg)
    { this.driverWeightKg = driverWeightKg; }

    public boolean isWearingSunglasses()
    { return isWearingSunglasses; }

    public void setWearingSunglasses(boolean wearingSunglasses)
    { isWearingSunglasses = wearingSunglasses; }
}