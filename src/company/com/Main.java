package company.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String artist = "";
        String title = "";
        Song song;
        String searchText = "blue"; // use lower case
        for (int i=0; i<3; i++){
            // Check for blanks
            System.out.println("What is the title of the Song you wish to add to you Database?");
            title = sc.nextLine();
            System.out.println("Who is the artist of the Song you are adding to you Database?");
            artist = sc.nextLine();
            song = new Song(artist, title);
            songs.add(song);
        }

        // Print all of the songs
        for (Song s:songs){
            System.out.println(s.display());
        }

        for (Song s:songs){
            String titleStr = s.getTitle().toLowerCase();
            if (titleStr.contains(searchText)) {
                System.out.println("I found the song title which contains: " + searchText + "   " + s.display());
            }
        }
    }
}
