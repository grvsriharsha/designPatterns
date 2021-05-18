package Structural.design.adapter.adapter;

/**
 * Created by admins on 7/30/17.
 */
public class Blackmusic implements AudioPlayerI{

    Mediator mediator=new Mediator();



    public void play(String auidotype) {
        if("mp3".equalsIgnoreCase(auidotype))
            play();
        else
            mediator.play(auidotype);
    }


    @Override
    public void play() {
        System.out.println("playyying mp3 song");
    }
}
