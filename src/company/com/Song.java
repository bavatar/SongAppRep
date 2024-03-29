package company.com;

public class Song {
    private String artist;
    private String title;

    public Song() {
    }

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String display(){
        // display song
        return "Song Title: " + getTitle() + "  Artist: " + getArtist() + "\n";
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
