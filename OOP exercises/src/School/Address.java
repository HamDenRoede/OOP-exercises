package School;

public class Address
{
    private String streetName;
    private int houseNumber;
    private int floorNumber;
    private String side;
    private int zipCode;
    private String country;

    public Address(String streetName, int houseNumber, int floorNumber, String side, int zipCode, String country)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.floorNumber = floorNumber;
        this.side = side;
        this.zipCode = zipCode;
        this.country = country;
    }
}
