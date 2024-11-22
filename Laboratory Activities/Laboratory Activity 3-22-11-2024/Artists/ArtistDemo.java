public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();
        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Claude Monet", "French", 86, "Painting", Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("William Shakespeare", "English", 52, "Writing", WritingStyle.DRAMA);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Misty Copeland", "American", 41, "Dancing", DanceStyle.BALLET);
        dancer.displayInfo();
    }
}