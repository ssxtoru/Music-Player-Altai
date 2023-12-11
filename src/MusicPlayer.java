import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
    private ArrayList<Playlist> playlists = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void createPlaylist() {
        System.out.print("Enter playlist name: ");
        String playlistName = scanner.nextLine();
        playlists.add(new Playlist(playlistName));
        System.out.println("Playlist " + playlistName + " has been created");
    }

    public void addSongToPlaylist() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            System.out.println("Enter song title:");
            String title = scanner.nextLine();

            System.out.println("Enter artist name:");
            String artist = scanner.nextLine();

            System.out.println("Enter duration in minutes:");
            double duration = scanner.nextDouble();
            scanner.nextLine();

            Music newSong = new Music(title, artist, duration);
            selectedPlaylist.addSong(newSong);
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public void deleteSongFromPlaylist() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            System.out.println("Enter song title to delete:");
            String title = scanner.nextLine();
            selectedPlaylist.deleteSong(title);
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public void displayAllPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists found.");
        } else {
            System.out.println("All Playlists:");
            for (Playlist playlist : playlists) {
                System.out.println(playlist.getName());
            }
        }
    }

    public void viewSongsInPlaylist() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            selectedPlaylist.displayPlaylist();
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public void playSong() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            System.out.println("Enter song title:");
            String songTitle = scanner.nextLine();

            selectedPlaylist.playSong(songTitle);
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }
    public void playNextSongInPlaylist() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            System.out.println("Enter current song title:");
            String currentSongTitle = scanner.nextLine();

            selectedPlaylist.playNextSongInPlaylist(currentSongTitle);
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public void playPreviousSongInPlaylist() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            System.out.println("Enter current song title:");
            String currentSongTitle = scanner.nextLine();

            selectedPlaylist.playPreviousSongInPlaylist(currentSongTitle);
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public void shuffleSongsInPlaylist() {
        System.out.println("Enter playlist name:");
        String playlistName = scanner.nextLine();

        Playlist selectedPlaylist = findPlaylistByName(playlistName);
        if (selectedPlaylist != null) {
            selectedPlaylist.shuffleSongs();
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    private Playlist findPlaylistByName(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistName)) {
                return playlist;
            }
        }
        return null;
    }
}
