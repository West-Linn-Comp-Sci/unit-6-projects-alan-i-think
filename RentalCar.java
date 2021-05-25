public class RentalCar extends Car
{
    private double ratePerMile;
    private double amountOwed;
    private String currentRenter;
    public RentalCar(double ratePerMile, String currentRenter)
    {
        super();
        this.ratePerMile = ratePerMile;
        this.currentRenter = currentRenter;
    }
    @Override
    public void drive(int miles)
    {
        amountOwed += miles * ratePerMile;
        super.drive(miles);
    }
    public void setRate(double ratePerMile)
    {
        this.ratePerMile = ratePerMile;
    }
    public void setCurrent(String currentRenter)
    {
        this.currentRenter = currentRenter;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\n" + "Rate: " + ratePerMile + " Owed: " + amountOwed + " Renter: " + currentRenter;
    }
}
