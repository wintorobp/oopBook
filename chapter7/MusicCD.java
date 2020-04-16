
public class MusicCD {
    private String artist;
    private String title;

    private String id;

    public MusicCD(String name1, name2){
        artist = name1;
        title = name2;
        id = artist.subString(0,2) + "-" + title.subString(0,9);
    }
}