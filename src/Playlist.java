import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

        private String name;
        private ArrayList<Music> playlist;

        public Playlist(String name) {
            this.name = name;
            this.playlist = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addSong(Music song) {
            playlist.add(song);
            System.out.println("Successfully added: " + song.getSongTitle() + " to playlist");
        }

        public void deleteSong(String title) {
            for (Music song : playlist) {
                if (song.getSongTitle().equals(title)) {
                    playlist.remove(song);
                    System.out.println("Successfully deleted: " + title + " from playlist");
                    return;
                }
            }
            System.out.println(title + " is not found in the playlist");
        }

        public void shuffleSongs() {
            Collections.shuffle(playlist);
            System.out.println("Songs have been successfully shuffled! ");
        }

        public void displayPlaylist() {
            if (playlist.isEmpty()) {
                System.out.println("Playlist '" + name + "' is empty.");
            } else {
                System.out.println("Playlist '" + name + "':");
                for (int i = 0; i < playlist.size(); i++) {
                    Music song = playlist.get(i);
                    System.out.println((i + 1) + ". " + song);
                }
            }
        }


    public void playSong(String songTitle) {
        for (Music song : playlist) {
            if (song.getSongTitle().equals(songTitle)) {
                System.out.println("Now playing: " + song);
                return;
            }
        }
        System.out.println("Song '" + songTitle + "' not found in the playlist");
    }


    public void playNextSongInPlaylist(String currentSongTitle) {
        int currentIndex = -1;
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getSongTitle().equals(currentSongTitle)) {
                currentIndex = i;
                break;
            }
        }

        if (currentIndex != -1 && currentIndex + 1 < playlist.size()) {
            Music nextSong = playlist.get(currentIndex + 1);
            System.out.println("Now playing next song: " + nextSong);
        } else {
            System.out.println("No next song available.");
        }
    }

    public void playPreviousSongInPlaylist(String currentSongTitle) {
        int currentIndex = -1;
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getSongTitle().equals(currentSongTitle)) {
                currentIndex = i;
                break;
            }
        }

        if (currentIndex > 0) {
            Music previousSong = playlist.get(currentIndex - 1);
            System.out.println("Now playing previous song: " + previousSong);
        } else {
            System.out.println("No previous song available.");
        }
    }
}

