package adapter;

public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            advanceMediaPlayer = new VlcPlayer();
        else if(audioType.equalsIgnoreCase("mp4"))
            advanceMediaPlayer = new Mp4Player();
    }

    @Override
    public void play(String filename) {
        if(filename.endsWith(".vlc"))
            advanceMediaPlayer.playVlc(filename);
        else if(filename.endsWith(".mp4"))
            advanceMediaPlayer.playMp4(filename);
        else
            System.out.println("Unsupported audio type...");
    }
}
