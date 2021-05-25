public class Vehicle
{
    private int doorNum;
    private boolean motorized;
    private String color;
    public Vehicle(int doorNum, boolean motorized, String color)
    {
        this.doorNum = doorNum;
        this.motorized = motorized;
        this.color = color;
    }
    public int getDoors(){
        return doorNum;
    }
    public boolean getMotor(){
        return motorized;
    }
    public String getColor(){
        return color;
    }
    public void setDoors(int doors){
        doorNum = doors;
    }
    public void setMotor(boolean motor){
        motorized = motor;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "Number of doors: " + doorNum + ". Motorized: " + motorized + ". Color: " + color + " ";
    }
}
