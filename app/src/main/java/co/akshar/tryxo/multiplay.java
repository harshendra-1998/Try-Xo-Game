package co.akshar.tryxo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class multiplay extends AppCompatActivity {
    ImageView[] xoro = new ImageView[9];
    ImageView[] bac = new ImageView[9];
    ImageView[] chanceupdate = new ImageView[2];
    int[] oxposi = {1,1,1,1,1,1,1,1,1};
    int[] clickable = {0,0,0,0,0,0,0,0,0};
    private AdView adView;
    LinearLayout but;
    int l = 0;
    LinearLayout layout;
    int m;
    TextView match;
    int matchs = 0;
    String o = "O";
    TextView opt;
    int opts = 0;
    ImageView t;
    String x = "X";
    int xo = 1;
    TextView xpt;
    int xpts = 0;
    int itemno = 3;
    int wall;
    LinearLayout maiiin;
    Animation fadein,drawfadein, drawfadego, fadeo, chnceanim;
    ImageView titlex, titleo;
    fucttionsofxo fucttionsofxo;
    //a1forsingle a1forsingle;
    SoundPool soundpool;
    LottieAnimationView lottieAnimationView;
    int sound, sound2, sound3;
    int[] soundeffect = {R.raw.zapsplat_cartoon_bubble_pop_002_40274,R.raw.woodsound,R.raw.metal,R.raw.waterdrop};
    int[] x_images = {R.drawable.x_set,R.drawable.x_wood,R.drawable.metal_x,R.drawable.x_love};
    int[] o_images = {R.drawable.o_set,R.drawable.o_wood,R.drawable.metal_o,R.drawable.o_love};
    int[] x_back= {R.drawable.x_set_back,R.drawable.x_wood_back,R.drawable.x_metal_back,R.drawable.x_love_back};
    int[] o_back = {R.drawable.o_set_back,R.drawable.o_wood_back,R.drawable.o_metal_back,R.drawable.o_love_back};
    int[] xoanim = {R.anim.fadein,R.anim.fadeinmetal,R.anim.fadeinmetal,R.anim.fadeinlove};
    int[] crossback = {R.drawable.cross_back,R.drawable.wood_cross,R.drawable.metal_cross,R.drawable.love_cross};
    float[] soundd = {0.7f,1f,0.4f,0.8f};
    int[] lootifiles = {R.raw.smog,R.raw.summer,R.raw.background_full_screen_night};
    Handler handler;
    RelativeLayout[] clickee = new RelativeLayout[9];
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplay);



        sharedPreferences = this.getSharedPreferences("pref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        itemno = sharedPreferences.getInt("XOTheme",0);
        wall = sharedPreferences.getInt("WALLTheme",0);
        fadein = AnimationUtils.loadAnimation(this, xoanim[itemno]);
        drawfadein = AnimationUtils.loadAnimation(this, R.anim.drawfadein);
        drawfadego = AnimationUtils.loadAnimation(this, R.anim.drawfadego);
        fadeo = AnimationUtils.loadAnimation(this, R.anim.fadeo);
        chnceanim = AnimationUtils.loadAnimation(this, R.anim.drawfadein);
        lottieAnimationView = findViewById(R.id.looti);

        chanceupdate[0] = findViewById(R.id.playerbacl);
        chanceupdate[1] = findViewById(R.id.playerbac2);
        xoro[0] = (ImageView)findViewById(R.id.l1);
        xoro[1] = (ImageView)findViewById(R.id.l2);
        xoro[2] = (ImageView)findViewById(R.id.l3);
        xoro[3] = (ImageView)findViewById(R.id.l4);
        xoro[4] = (ImageView)findViewById(R.id.l5);
        xoro[5] = (ImageView)findViewById(R.id.l6);
        xoro[6] = (ImageView)findViewById(R.id.l7);
        xoro[7] = (ImageView)findViewById(R.id.l8);
        xoro[8] = (ImageView)findViewById(R.id.l9);
        clickee[0] =findViewById(R.id.click1);
        clickee[1] =findViewById(R.id.click2);
        clickee[2] =findViewById(R.id.click3);
        clickee[3] =findViewById(R.id.click4);
        clickee[4] =findViewById(R.id.click5);
        clickee[5] =findViewById(R.id.click6);
        clickee[6] =findViewById(R.id.click7);
        clickee[7] =findViewById(R.id.click8);
        clickee[8] =findViewById(R.id.click9);
        bac[0] = (ImageView)findViewById(R.id.backl1);
        bac[1] = (ImageView)findViewById(R.id.backl2);
        bac[2] = (ImageView)findViewById(R.id.backl3);
        bac[3] = (ImageView)findViewById(R.id.backl4);
        bac[4] = (ImageView)findViewById(R.id.backl5);
        bac[5] = (ImageView)findViewById(R.id.backl6);
        bac[6] = (ImageView)findViewById(R.id.backl7);
        bac[7] = (ImageView)findViewById(R.id.backl8);
        bac[8] = (ImageView)findViewById(R.id.backl9);
        xpt = findViewById(R.id.xpt);
        opt = findViewById(R.id.opt);
        maiiin  = findViewById(R.id.maiiin);
        titlex = findViewById(R.id.title_x);
        titleo = findViewById(R.id.title_o);

        //ring= MediaPlayer.create(MainActivity.this,R.raw.zapsplat_cartoon_bubble_pop_002_40274);

        fucttionsofxo = new fucttionsofxo();
        //a1forsingle = new a1forsingle();
        handler = new Handler();

        //fb ads
        lottieAnimationView.setAnimation(lootifiles[wall]);

        adView = new AdView(this, getResources().getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);
        adContainer.addView(adView);


        t = findViewById(R.id.winn);
        match = findViewById(R.id.match);
        but = findViewById(R.id.sco);
        int coins = sharedPreferences.getInt("Coins", 0);
        //match.setText(String.valueOf(coins));
        LinearLayout main = findViewById(R.id.main);
        main.setBackgroundResource(crossback[itemno]);
        titleo.setImageResource(o_images[itemno]);
        titlex.setImageResource(x_images[itemno]);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        but.setVisibility(View.GONE);
        ViewGroup.LayoutParams params = main.getLayoutParams();
// Changes the height and width to the specified *pixels*
        if(width<height){
            params.height = (int) (0.9*width);
            params.width = (int) (0.9*width);
            maiiin.setOrientation(LinearLayout.VERTICAL);}
        else {
            params.height = (int) (0.9*height);
            params.width = (int) (0.9*height);
            maiiin.setOrientation(LinearLayout.HORIZONTAL);
        }
        main.setLayoutParams(params);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundpool = new SoundPool.Builder()
                    .setMaxStreams(2)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
        else {
            soundpool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        }
        sound = soundpool.load(this,soundeffect[itemno],1);
        sound2 = soundpool.load(this,R.raw.zapsplat_multimedia_game_sound_synth_mallet_style_short_generic_action_tone_003_55297,1);
        sound3 = soundpool.load(this,R.raw.zapsplat_multimedia_game_error_tone_003_24921,1);
        //scores();
        adView.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                //Toast.makeText(multiplay.this, "Error: " + adError.getErrorMessage(),
                  //      Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Ad loaded callback
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
            }
        });


        adView.loadAd();
        interstitialAd = new InterstitialAd(this, getResources().getString(R.string.Inter_id));
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                if(!interstitialAd.isAdLoaded()){
                interstitialAd.loadAd();}
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                // Show the ad
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
            }
        });
        interstitialAd.loadAd();

        chanceupdate[1].setVisibility(View.VISIBLE);
    }







    public void share(View view) {

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://newtrymenforall.blogspot.com/2020/01/try-xo-privacy-policy.html"));
        startActivity(i);
    }






    //public void reset(View view) {this.recreate();}







    public void one(View view) {
        onclickchanges(0);
        ////Airun();
    }
    public void six(View view) {
        onclickchanges(5);
        ////Airun();
    }
    public void seven(View view) {
        onclickchanges(6);
        ////Airun();
    }
    public void three(View view) {
        onclickchanges(2);
        ////Airun();
    }
    public void twoo(View view) {
        onclickchanges(1);
        ////Airun();
    }
    public void eight(View view) {
        onclickchanges(7);
        ////Airun();
    }
    public void five(View view) {
        onclickchanges(4);
        //Airun();
    }
    public void four(View view) {
        onclickchanges(3);
        //Airun();
    }
    public void nine(View view) {
        onclickchanges(8);
        //Airun();
    }
    

    public void score(View view) {
        for(int iiiii=0; iiiii < 9 ; iiiii++){
            oxposi[iiiii] = 1;
            clickable[iiiii] = 0;
            clickee[iiiii].setClickable(true);
            bac[iiiii].setVisibility(View.INVISIBLE);
            xoro[iiiii].setVisibility(View.INVISIBLE);
        }
        but.setVisibility(View.GONE);
        fucttionsofxo.playable = true;

    }

    public void onclickchanges(int buttonnumber){
        if (clickable[buttonnumber] < 1 && fucttionsofxo.playable) {
            clickable[buttonnumber] = 1 + clickable[buttonnumber];
            onclick();
            oxposi[buttonnumber] = xo;
            fucttionsofxo.who(oxposi,but,xpt,opt,match,t,clickee,bac,drawfadein,soundpool,sound,drawfadego,fadeo,sound2,sound3,x_back[itemno],o_back[itemno],soundd[itemno],clickable,x_images[itemno],o_images[itemno],interstitialAd);
            //who();
            xoro[buttonnumber].setImageResource(m);
            xoro[buttonnumber].setVisibility(View.VISIBLE);
            xoro[buttonnumber].startAnimation(fadein);
        }
    }

    public void onclick() {
        l = 1 + l;
        if (l % 2 == 0) {
            m = x_images[itemno];
            xo = 2;
            chanceupdate[1].setVisibility(View.VISIBLE);
            chanceupdate[0].setVisibility(View.INVISIBLE);
            chanceupdate[1].startAnimation(chnceanim);
            ////Airun();
            //colo = getResources().getColor(R.color.red);
        }
        else {
            m = o_images[itemno];
            xo = 0;
            chanceupdate[0].setVisibility(View.VISIBLE);
            chanceupdate[1].setVisibility(View.INVISIBLE);
            chanceupdate[0].startAnimation(chnceanim);
            //colo = getResources().getColor(R.color.blue);
        }
    }




    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setTitle("TRY XO");
        builder.setMessage("DO YOU REALLY WANT TO QUIT?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n) {
                multiplay.super.onBackPressed();
            }
        });
        builder.setNegativeButton("NO", null).create().show();
    }



    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
        soundpool.release();
        soundpool = null;
    }

    public void backwithotend(View view) {
        onBackPressed();
    }
}
