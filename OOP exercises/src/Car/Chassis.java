package Car;

public class Chassis
{
    private int numberOfDoors;
    private int numberOfWindows;
    private boolean isConvertible;


    public Chassis(int numberOfDoors, int numberOfWindows, boolean isConvertible)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.isConvertible = isConvertible;
    }


    public int getNumberOfDoors()
    { return numberOfDoors; }

    public void setNumberOfDoors(int numberOfDoors)
    { this.numberOfDoors = numberOfDoors; }

    public int getNumberOfWindows()
    { return numberOfWindows; }

    public void setNumberOfWindows(int numberOfWindows)
    { this.numberOfWindows = numberOfWindows; }

    public boolean isConvertible()
    { return isConvertible; }

    public void setConvertible(boolean convertible)
    { isConvertible = convertible; }
}
