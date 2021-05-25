public class Car extends Vehicle //implements Comparable<Vehicle>
{
    private int MPG;
    private double milesTraveled;
    public Car()
    {
        super(4, true, "White");
    }
    public void drive(int miles)
    {
        milesTraveled += miles;
    }
    public void setMPG(int MPG)
    {
        this.MPG = MPG;
    }
    public void setMilesTraveled(double miles)
    {
        this.milesTraveled = miles;
    }
    public int getMPG()
    {
        return MPG;
    }
    public double getMiles()
    {
        return milesTraveled;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\n" + "MPG: " + MPG + " Miles Traveled: " + milesTraveled;
    }
}
