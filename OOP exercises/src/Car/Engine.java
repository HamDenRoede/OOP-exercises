package Car;

public class Engine
{
    private int cylinders;
    private String gasolinType;


    public Engine(int cylinders, String gasolinType)
    {
        this.cylinders = cylinders;
        this.gasolinType = gasolinType;
    }


    public int getCylinders()
    { return cylinders; }

    public void setCylinders(int cylinders)
    { this.cylinders = cylinders; }

    public String getGasolinType()
    { return gasolinType; }

    public void setGasolinType(String gasolinType)
    { this.gasolinType = gasolinType; }
}
