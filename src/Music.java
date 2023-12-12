public class Music {
    private String songTitle;
    private String artist;
    private String duration;

    public Music(String songTitle, String artist, String duration) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.duration = duration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "/Song: " + songTitle + "\n/Artist: " + artist + "\n/ Duration: " + duration + "/";
    }
}
