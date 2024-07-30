import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    private Song findSong(String titleOfSong){
        for(Song p : songs){
            if(p.getTitle().equals(titleOfSong)){
                return p;
            }
        }
        return null;
    }

    public boolean addSong(String titleOfSong, double duration){
        if(findSong(titleOfSong)!=null){
            return false;
        }
        songs.add(new Song(titleOfSong,duration));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> Playlist){
        int index = trackNumber-1;
        if(index>=0 && index<=songs.size()-1){
            Playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> Playlist){
        if(findSong(titleOfSong)!=null){
            Playlist.add(findSong(titleOfSong));
            return true;
        }
        return false;
    }
}
