import java.util.Scanner;
public class GettingInputs{
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int Year = year.nextInt();

        Scanner genre = new Scanner(System.in);
        System.out.print("Enter the genre: ");
        String Genre = genre.nextLine();

        Scanner album = new Scanner(System.in);
        System.out.print("Enter the album: ");
        String Album = album.nextLine();

        Scanner title = new Scanner(System.in);
        System.out.print("Enter the song title: ");
        String Title = title.nextLine();

        Scanner artist = new Scanner(System.in);
        System.out.print("Enter the artist: ");
        String Artist = artist.nextLine();

        System.out.println("--------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------");
        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album );
        System.out.println("Title: \"" + Title + "\"");
        System.out.println("Artist: " + Artist );

        year.close();
        genre.close();
        album.close();
        title.close();
        artist.close();
    }
}
