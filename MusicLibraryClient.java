public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("Eve Of Destruction", "Barry McGuire", 10, 42.5);
        Album a5 = new Album("Bad Moon Rising", "Green River", 9, 36);
        Album a6 = new Album("Just Dropped In", "The First Edition", 12, 39.1);
        Album a7 = new Album("Apple Blossom", "De Stjil", 10, 42.5);
        Album a8 = new Album("The Old Dun Cow", "Seamus Kennedy", 9, 36);
        Album a9 = new Album("La vie", "Ichon", 12, 39.1);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);

        myLibrary.printOut();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.printOut();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        myLibrary.printOut();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println("The song is: " + myLibrary.linearArtist("one Guy").getSong());

        System.out.println("The artist is: " + myLibrary.linearSong("First").getNames());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println("Selection Sort:");
        myLibrary.selectionSort();
        myLibrary.printOut();
        System.out.println();
        System.out.println("Insertion Sort:");
        myLibrary.insertionSort();
        myLibrary.printOut();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Binary Search for artist 'Green River'");
        int artistIndex = myLibrary.binarySearchArtist("Green River");
        System.out.println("Found at index: " + artistIndex);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}