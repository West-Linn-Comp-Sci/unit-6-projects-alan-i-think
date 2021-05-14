public class Person{
  private int myAge = -1;
  private String myName = "NULL";
  public Person(int age, String name){
    this.myAge = age;
    this.myName  = name;
  }
  public int getAge(){
    return this.myAge;
  }
  public String getName(){
    return this.myName;
  }
}