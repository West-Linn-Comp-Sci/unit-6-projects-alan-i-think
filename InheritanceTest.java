public class InheritanceTest
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle(4, true, "blue");
        
        Car v2 = new Car();
        v2.setColor("Green");
        v2.setDoors(2);
        v2.setMPG(30);
        v2.setMilesTraveled(20000);
        
        RentalCar v3 = new RentalCar(.15 , "Joseph Smith");
        v3.setMPG(30);
        v3.setMilesTraveled(20000);
        v3.drive(300);
        v3.setCurrent("John Doe");
        
        System.out.println(v1.toString());
        System.out.println();
        System.out.println(v2.toString());
        System.out.println();
        System.out.println(v3.toString());
    }
}
