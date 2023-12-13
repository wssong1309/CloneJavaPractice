package java102;

public class Music implements Content {
    private String song;

    public Music(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String getTitle() {
        return song;
    }

}