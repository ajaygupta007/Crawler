package tech.codingclub.database;

public class SongDetials {
    private String parent_link;
    private String link;
    private String  album;
    private String  duration;
    private String  singers;
    private String music_director;
    private String lyricist;
    public SongDetials()
    {

    }
    public SongDetials(String parent_link, String link, String album, String duration, String singers, String music_director, String lyricist) {
        this.parent_link = parent_link;
        this.link = link;
        this.album = album;
        this.duration = duration;
        this.singers = singers;
        this.music_director = music_director;
        this.lyricist = lyricist;
    }

    public String getParent_link() {
        return parent_link;
    }

    public String getLink() {
        return link;
    }

    public String getAlbum() {
        return album;
    }

    public String getDuration() {
        return duration;
    }

    public String getSingers() {
        return singers;
    }

    public String getMusic_director() {
        return music_director;
    }

    public String getLyricist() {
        return lyricist;
    }
}
