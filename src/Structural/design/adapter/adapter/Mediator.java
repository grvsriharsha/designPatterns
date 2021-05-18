package Structural.design.adapter.adapter;

/**
 * Created by admins on 7/30/17.
 */
public class Mediator implements AudioPlayerI {

Video_AudioPlayerI video_audioPlayerI=new YoutubeApp();


    @Override
    public void play() {
        System.out.println("playing mp3");
    }

    public void play(String type)
    {
        if("mp4".equalsIgnoreCase(type))
            video_audioPlayerI.play("mp4");
    }
}
