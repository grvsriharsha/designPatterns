package Structural.design.adapter.adapter;

/**
 * Created by admins on 7/30/17.
 */
public class YoutubeApp implements Video_AudioPlayerI {




    @Override
    public void play(String auidotype) {
       if("mp3".equalsIgnoreCase(auidotype))
           playmp3();
        else playmp4();

    }

    private void playmp3(){};
    private void playmp4(){};
}
