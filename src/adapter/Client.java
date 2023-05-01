package adapter;

public class Client {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaAdapter("mp4");

        mediaPlayer.play("file.mp3");
        mediaPlayer.play("file.vlc");
        mediaPlayer.play("file.mp4");
        mediaPlayer.play("file.avi");
    }
}
