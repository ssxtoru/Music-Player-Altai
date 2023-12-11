import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            System.out.println("--------------------------------------");
            System.out.print("Choose an option:");
            System.out.print("\n1. Create a new playlist");
            System.out.print("\t\t\t4. Display all playlists");
            System.out.print("\t\t\t7.Play next song in a playlist");
            System.out.print("\n2. Add a song to a playlist");
            System.out.print("\t\t\t5. View songs in a playlist");
            System.out.print("\t\t\t8.Play previous song in a playlist");
            System.out.print("\n3. Delete a song from a playlist");
            System.out.print("\t6. Play a song from a playlist");
            System.out.print("\t\t9. Shuffle songs in a playlist");
            System.out.print("\n10. Exit");
            System.out.println("\n--------------------------------------");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    musicPlayer.createPlaylist();
                    break;
                case 2:
                    musicPlayer.addSongToPlaylist();
                    break;
                case 3:
                    musicPlayer.deleteSongFromPlaylist();
                    break;
                case 4:
                    musicPlayer.displayAllPlaylists();
                    break;
                case 5:
                    musicPlayer.viewSongsInPlaylist();
                    break;
                case 6:
                    musicPlayer.playSong();
                    break;
                case 7:
                    musicPlayer.playNextSongInPlaylist();
                    break;
                case 8:
                    musicPlayer.playPreviousSongInPlaylist();
                    break;
                case 9:
                    musicPlayer.shuffleSongsInPlaylist();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choose != 10);
    }
}

