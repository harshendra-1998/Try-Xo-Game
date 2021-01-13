package co.akshar.tryxo;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class fucttionsofxo extends AppCompatActivity {

    //private InterstitialAd interstitialAd;
    int xpts =0;
    int opts = 0;
    int matchs = 0;
    Boolean playable = true;
    public void who(int[] oxposi, final LinearLayout but, final TextView xpt, final TextView opt, final TextView match, ImageView t, final RelativeLayout[] clickee, ImageView bac[], Animation drawfadein, final SoundPool soundpool, final int sound, final Animation drawfadego, Animation fadeo, final int sound2, final int sound3, int xxxx, int oooo, float soundd, final int[] clickable, int x_images, int o_images, final InterstitialAd interstitialAd) {
        soundpool.play(sound,soundd,soundd,0,0,1);
        if (oxposi[0] + oxposi[1] + oxposi[2] > 5) {
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[0].setImageResource(xxxx);
            bac[1].setImageResource(xxxx);
            bac[2].setImageResource(xxxx);
            bac[0].setVisibility(View.VISIBLE);
            bac[1].setVisibility(View.VISIBLE);
            bac[2].setVisibility(View.VISIBLE);
            bac[0].startAnimation(drawfadein);
            bac[1].startAnimation(drawfadein);
            bac[2].startAnimation(drawfadein);
            t.setImageResource(x_images);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if (oxposi[0] + oxposi[4] + oxposi[8] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[0].setImageResource(xxxx);
            bac[4].setImageResource(xxxx);
            bac[8].setImageResource(xxxx);
            bac[0].setVisibility(View.VISIBLE);
            bac[4].setVisibility(View.VISIBLE);
            bac[8].setVisibility(View.VISIBLE);
            bac[0].startAnimation(drawfadein);
            bac[4].startAnimation(drawfadein);
            bac[8].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[0] + oxposi[3] + oxposi[6] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[0].setImageResource(xxxx);
            bac[3].setImageResource(xxxx);
            bac[6].setImageResource(xxxx);
            bac[0].setVisibility(View.VISIBLE);
            bac[3].setVisibility(View.VISIBLE);
            bac[6].setVisibility(View.VISIBLE);
            bac[0].startAnimation(drawfadein);
            bac[3].startAnimation(drawfadein);
            bac[6].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[1] + oxposi[4] + oxposi[7] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[4].setImageResource(xxxx);
            bac[1].setImageResource(xxxx);
            bac[7].setImageResource(xxxx);
            bac[4].setVisibility(View.VISIBLE);
            bac[1].setVisibility(View.VISIBLE);
            bac[7].setVisibility(View.VISIBLE);
            bac[4].startAnimation(drawfadein);
            bac[1].startAnimation(drawfadein);
            bac[7].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[2] + oxposi[4] + oxposi[6] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[4].setImageResource(xxxx);
            bac[6].setImageResource(xxxx);
            bac[2].setImageResource(xxxx);
            bac[4].setVisibility(View.VISIBLE);
            bac[6].setVisibility(View.VISIBLE);
            bac[2].setVisibility(View.VISIBLE);
            bac[4].startAnimation(drawfadein);
            bac[6].startAnimation(drawfadein);
            bac[2].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[2] + oxposi[5] + oxposi[8] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[5].setImageResource(xxxx);
            bac[8].setImageResource(xxxx);
            bac[2].setImageResource(xxxx);
            bac[5].setVisibility(View.VISIBLE);
            bac[8].setVisibility(View.VISIBLE);
            bac[2].setVisibility(View.VISIBLE);
            bac[5].startAnimation(drawfadein);
            bac[8].startAnimation(drawfadein);
            bac[2].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[3] + oxposi[4] + oxposi[5] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[3].setImageResource(xxxx);
            bac[4].setImageResource(xxxx);
            bac[5].setImageResource(xxxx);
            bac[3].setVisibility(View.VISIBLE);
            bac[4].setVisibility(View.VISIBLE);
            bac[5].setVisibility(View.VISIBLE);
            bac[3].startAnimation(drawfadein);
            bac[4].startAnimation(drawfadein);
            bac[5].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[6] + oxposi[7] + oxposi[8] > 5){
            xpts = 1 + xpts;
            //scores(clickee);
            //scores();
            bac[6].setImageResource(xxxx);
            bac[7].setImageResource(xxxx);
            bac[8].setImageResource(xxxx);
            bac[6].setVisibility(View.VISIBLE);
            bac[7].setVisibility(View.VISIBLE);
            bac[8].setVisibility(View.VISIBLE);
            bac[6].startAnimation(drawfadein);
            bac[7].startAnimation(drawfadein);
            bac[8].startAnimation(drawfadein);
            t.setImageResource(x_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if (oxposi[0] + oxposi[1] + oxposi[2] < 1) {
            opts = 1 + opts;
            //scores(clickee);
            bac[0].setImageResource(oooo);
            bac[1].setImageResource(oooo);
            bac[2].setImageResource(oooo);
            bac[0].setVisibility(View.VISIBLE);
            bac[1].setVisibility(View.VISIBLE);
            bac[2].setVisibility(View.VISIBLE);
            bac[0].startAnimation(drawfadein);
            bac[1].startAnimation(drawfadein);
            bac[2].startAnimation(drawfadein);
            t.setImageResource(o_images);
            //t.setTextColor(getResources().getColor(R.color.blue));
            return;
        }
        else if (oxposi[0] + oxposi[4] + oxposi[8] < 1){
            opts = 1 + opts;
            //scores(clickee);
            //scores();
            bac[0].setImageResource(oooo);
            bac[4].setImageResource(oooo);
            bac[8].setImageResource(oooo);
            bac[0].setVisibility(View.VISIBLE);
            bac[4].setVisibility(View.VISIBLE);
            bac[8].setVisibility(View.VISIBLE);
            bac[0].startAnimation(drawfadein);
            bac[4].startAnimation(drawfadein);
            bac[8].startAnimation(drawfadein);
            t.setImageResource(o_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[0] + oxposi[3] + oxposi[6] < 1){
            opts = 1 + opts;
            //scores(clickee);
            //scores();
            bac[0].setImageResource(oooo);
            bac[3].setImageResource(oooo);
            bac[6].setImageResource(oooo);
            bac[0].setVisibility(View.VISIBLE);
            bac[3].setVisibility(View.VISIBLE);
            bac[6].setVisibility(View.VISIBLE);
            bac[0].startAnimation(drawfadein);
            bac[3].startAnimation(drawfadein);
            bac[6].startAnimation(drawfadein);
            t.setImageResource(o_images);
            
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[1] + oxposi[4] + oxposi[7] < 1){
            opts = 1 + opts;
            //scores(clickee);
            //scores();
            bac[4].setImageResource(oooo);
            bac[1].setImageResource(oooo);
            bac[7].setImageResource(oooo);
            bac[4].setVisibility(View.VISIBLE);
            bac[1].setVisibility(View.VISIBLE);
            bac[7].setVisibility(View.VISIBLE);
            bac[4].startAnimation(drawfadein);
            bac[1].startAnimation(drawfadein);
            bac[7].startAnimation(drawfadein);
            t.setImageResource(o_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[2] + oxposi[4] + oxposi[6] < 1){
            opts = 1 + opts;
            //scores(clickee);
            //scores();
            bac[4].setImageResource(oooo);
            bac[6].setImageResource(oooo);
            bac[2].setImageResource(oooo);
            bac[4].setVisibility(View.VISIBLE);
            bac[6].setVisibility(View.VISIBLE);
            bac[2].setVisibility(View.VISIBLE);
            bac[4].startAnimation(drawfadein);
            bac[6].startAnimation(drawfadein);
            bac[2].startAnimation(drawfadein);
            t.setImageResource(o_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[2] + oxposi[5] + oxposi[8] < 1){
            opts = 1 + opts;
            //scores(clickee);
            //scores();
            bac[5].setImageResource(oooo);
            bac[8].setImageResource(oooo);
            bac[2].setImageResource(oooo);
            bac[5].setVisibility(View.VISIBLE);
            bac[8].setVisibility(View.VISIBLE);
            bac[2].setVisibility(View.VISIBLE);
            bac[5].startAnimation(drawfadein);
            bac[8].startAnimation(drawfadein);
            bac[2].startAnimation(drawfadein);
            t.setImageResource(o_images);
            //t.setTextColor(getResources().getColor(R.color.red));
            return;
        }
        else if(oxposi[3] + oxposi[4] + oxposi[5] < 1){
            opts = 1 + opts;
            bac[3].setImageResource(oooo);
            bac[4].setImageResource(oooo);
            bac[5].setImageResource(oooo);
            bac[3].setVisibility(View.VISIBLE);
            bac[4].setVisibility(View.VISIBLE);
            bac[5].setVisibility(View.VISIBLE);
            bac[3].startAnimation(drawfadein);
            bac[4].startAnimation(drawfadein);
            bac[5].startAnimation(drawfadein);
            t.setImageResource(o_images);
            return;
        }
        else if(oxposi[6] + oxposi[7] + oxposi[8] < 1){
            opts = 1 + opts;
            bac[6].setImageResource(oooo);
            bac[7].setImageResource(oooo);
            bac[8].setImageResource(oooo);
            bac[6].setVisibility(View.VISIBLE);
            bac[7].setVisibility(View.VISIBLE);
            bac[8].setVisibility(View.VISIBLE);
            bac[6].startAnimation(drawfadein);
            bac[7].startAnimation(drawfadein);
            bac[8].startAnimation(drawfadein);
            t.setImageResource(o_images);
            return;
        }

        else if (oxposi[0] != 1 && oxposi[1] != 1 && oxposi[2] != 1 && oxposi[3] != 1 && oxposi[4] != 1 && oxposi[5] != 1 && oxposi[6] != 1 && oxposi[7] != 1 && oxposi[8] != 1)
        {
            t.setImageResource(R.drawable.matchdraw);
            soundpool.play(sound3,0.7f,0.7f,0,0,1);
            scores(clickee,clickable);
            touch(but,xpt,opt,match,drawfadego,interstitialAd);
            return;
        }
        //else{
        //    playable = true;
        //}

        drawfadein.setRepeatCount(2);
        drawfadein.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                scores(clickee,clickable);
                soundpool.play(sound2,0.7f,0.7f,0,0,1);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                touch(but,xpt,opt,match,drawfadego,interstitialAd);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });




    }

    private void scores(RelativeLayout[] clickee , int[] clickable) {
        //layout.setVisibility(View.INVISIBLE);
        for(int iiiii = 0; iiiii < 9; iiiii++){
            clickable[iiiii] = 1;
            clickee[iiiii].setClickable(false);
        }
        playable = false;
        //touch(xpt,opt,match);
    }
    public void touch(LinearLayout but, TextView xpt, TextView opt, TextView match, Animation drawfadego, InterstitialAd interstitialAd){
        but.setVisibility(View.VISIBLE);
        but.startAnimation(drawfadego);
        xpt.setText(String.valueOf(xpts));
        opt.setText(String.valueOf(opts));
        matchs = 1 + matchs;
        match.setText(String.valueOf(matchs));
        if(matchs%4 == 0 && interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
    }

}
