public class Music {
    private String songTitle;
    private String artist;
    private double duration;

    public Music(String songTitle, String artist, double duration) {
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

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "/Song: " + songTitle + "\n/Artist: " + artist + "\n/ Duration: " + duration + "/";
    }
}
