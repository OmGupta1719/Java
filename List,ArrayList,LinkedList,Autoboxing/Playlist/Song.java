public class Song {
    private String title;
    private double duration;
    public Song(String tile,double duration){
        this.title = tile;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
