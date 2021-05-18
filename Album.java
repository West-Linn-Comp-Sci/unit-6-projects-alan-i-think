public class Album {
  private int x = 0;
  String songNames;
  String artistNames;
  int numberOfTracks;
  double totalPlayTime;
    public Album(String song, String artist, int tracks, double playTime) {
    this.songNames = song;
    this.artistNames = artist;
    this.numberOfTracks = tracks;
    this.totalPlayTime = playTime;
    }
    public String getSong() {
    return this.songNames;
    }
    public String getNames() {
    return this.artistNames;
    }
    public int getTracks() {
    return this.numberOfTracks;
    }
    public double getPlayTime() {
    return this.totalPlayTime;
    }
    public String toString() {
    return "";
    }
}