public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("Song 1", 3.5, "Rock");
        Music music2 = new Music("Song 2", 4.2, "Pop");
        Music music3 = new Music("Song 3", 5.0, "Jazz");

        Album album1 = new Album("Album 1", 2024);
        album1.addMusic(music1);
        album1.addMusic(music2);

        Artist artist1 = new Artist("Artist 1");
        artist1.addAlbum(album1);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist1);
        library.addAlbum(album1);
        library.addSong(music1);
        library.addSong(music2);

        artist1.displayInfo();
        album1.displayInfo();

        Music searchedMusic = library.searchMusic("Song 2");
        if (searchedMusic != null) {
            searchedMusic.displayInfo();
        } else {
            System.out.println("Song not found.");
        }

        music1.play();
        music1.stop();

        Music randomMusic = library.giveRandomMusic();
        randomMusic.displayInfo();
    }
}
