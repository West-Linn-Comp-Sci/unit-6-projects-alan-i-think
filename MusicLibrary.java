
public class MusicLibrary
 {
  private int x = 0;
  private Album[] albums = new Album[20];
  public void printOut()
  {
     for(int y = 0; y < x; y++){
     System.out.print("\n" + getSong(y) + "\n" + getNames(y) + "\n" + getTracks(y)+ "\n" + getPlayTime(y) + "\n"); 
    }
  }
  public void add(Album album)
  {
     this.albums[x] = album;
     x++;
  }
   public String getSong(int x){
     return albums[x].songNames;
  }
  public String getNames(int x){
     return albums[x].artistNames;
  }
  public int getTracks(int x){
     return albums[x].numberOfTracks;
  }
  public double getPlayTime(int x){
     return albums[x].totalPlayTime;
  }
  public void remove(int z)
  {
      for(int y = z; this.x-1 >= y; y++)
      {
          albums[z] = albums[y+1];
          z++;
      }
      this.x --;
  }
  public Album linearArtist(String name){
      for(Album album : albums)
      {
        if(album.getNames().equals(name)) return album;
      }
      System.out.println("Name not found, returning NULL");
      return null;
  }
  public Album linearSong(String name){
      for(Album album : albums)
      {
        if(album.getSong().equals(name)) return album;
      }
      System.out.println("Name not found, returning NULL");
      return null;
  }
  public void insertionSort(){
      for (int i = 1; i < x; i++) {
            String s = albums[i].getSong();
            int j = i - 1;
            while (j >= 0 && s.compareTo(albums[j].getSong()) < 0) {
                Album temp = new Album("","",-1,-1.0);
                temp = albums[j+1];
                albums[j+1] = albums[j];
                albums[j] = temp;
                j--;
            }
            String y = albums[j+1].getSong();;
            y = s;
        }
    }
  public void selectionSort(){
    Album temp = new Album("","",-1,-1.0);
    for (int i = 0; i < x; i++) 
        {
            for (int j = i + 1; j < x; j++) { 
                if (albums[i].getNames().compareToIgnoreCase(albums[j].getNames())>0) 
                {
                    temp = albums[i];
                    albums[i] = albums[j];
                    albums[j] = temp;
                }
            }
     }
  }
  public int binarySearchArtist(String target){
    int low = 0, high = x-1, middle = (low + high)/2;
   System.out.println("X is " + x);
   while (!albums[middle].getNames().equals(target) && low <= high){
       if(albums[middle].getNames().compareTo(target) < 0){
           high = middle - 1;
           System.out.println("Too low");
           System.out.println(low + " is low " + middle + " is middle     " + high);
           System.out.println("Album Artist is: " + albums[middle].getNames());
        }else{
       System.out.println(low + " is low " + middle + " is middle     " + high);
       System.out.println("Too high");
       System.out.println("Album Artist is: " + albums[middle].getNames());
           low = middle + 1;
       middle = (low + high)/2;
    }
   }
  
   if (albums[middle].getNames().equals(target))
       return middle;
   else
       return -1;
  }
}