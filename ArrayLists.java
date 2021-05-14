import java.util.ArrayList;
public class ArrayLists{
  public static void removeZeros(ArrayList<Integer> list){
    for(int index = 0; index < list.size(); index++)
    {
      if(list.get(index) == 0){

       list.remove(index);
       index --;
      }
    }
  }
  public static int countLetters(ArrayList<String> list){
    int total = 0;
    for(int index = 0; index < list.size(); index ++)
    {
      total += list.get(index).length();
    }
    return total;
  }
  public static int findPosition(int keyValue, ArrayList<Integer> list){
    int pos = -1;
    for(int index = 0; index < list.size(); index++){
      if(keyValue == list.get(index)){
        return index;
      }
    }
    return pos;
  }
  public static ArrayList<String> parseIntoArrayList(String input){
    ArrayList<String> list = new ArrayList<String>();
    for(int index = 0; index < input.length(); index ++){
      list.add(index, input.substring(index,index+1));
    }
    return list;
  } 
  public static String findMin(ArrayList<Person> person){
    int[] ages = new int[person.size()];
    String[] names = new String[person.size()];
    int index = 0;
    for(Person per : person)
    {
      ages[index] = per.getAge();
      names[index] = per.getName();
      index ++;
    }
    int temp = 0;
    String temp2 = "";
    for (int i = 0; i < ages.length; i++) {     
          for (int j = i+1; j < ages.length; j++) {     
              if(ages[i] > ages[j]) {      
                 temp = ages[i];    
                 ages[i] = ages[j];    
                 ages[j] = temp;    
                 temp2 = names[i];    
                 names[i] = names[j];    
                 names[j] = temp2;    
               }     
            }     
        }   
    return names[0];
  }
  
}