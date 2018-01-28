public class java401 {
    public static void executer()
    {
        Song song = new Song(
                "03. NUDIE★",
                "城ヶ崎美嘉",
                "STARLIGHT MASTER 03 Hi-Fi☆Days",
                new String[]{"TAKT (TRYTONELABO)"},
                2016, 3
        );

        song.Show();
    }
}

class Song
{
    private String title;
    private String artist;
    private String album;
    private String[] composer;
    private int year;
    private int track;

    public Song(String title, String artist, String album, String[] composer, int year, int track)
    {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }

    public void Show()
    {
        System.out.println("제목은 무려 " + title + ".");
        System.out.println("앨범 \"" + album + "\"에 수록된 " + track + "번 곡이며, " + artist + "가 작업했다!");
        System.out.println("또한 해당 곡은 " + year + "년에 발매되었다.");
        System.out.println(String.join(", ", composer) + "의 " + composer.length + "명의 작곡가가 작업했다.");
    }
}