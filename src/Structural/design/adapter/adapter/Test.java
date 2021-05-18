package Structural.design.adapter.adapter;

/**
 * Created by admins on 7/30/17.
 */
public class Test {

    public static void main(String[] args) {
        AudioPlayerI audioPlayerI=new Blackmusic();

        ((Blackmusic)audioPlayerI).play("mp4");

    }
}
