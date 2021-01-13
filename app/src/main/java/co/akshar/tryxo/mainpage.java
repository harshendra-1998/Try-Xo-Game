package co.akshar.tryxo;

import android.animation.Animator;
import android.app.ActionBar;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.airbnb.lottie.LottieAnimationView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;

import static android.content.ContentValues.TAG;

public class mainpage extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView coinstext;
    String currentDateandTime, date= "nuhu";
    int coins = 5;
    int data_no,ad_no_remain;
    TextView ad_count, looti_text;
    String kk = "jj";
    LottieAnimationView onLootclickad, looti_coins;
    private RewardedVideoAd rewardedVideoAd;

    CardView firebasecard;
    ImageView firebaseimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        sharedPreferences = this.getSharedPreferences("pref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        coinstext = findViewById(R.id.coin);
        coins = sharedPreferences.getInt("Coins", 0);
        coinstext.setText(String.valueOf(coins));


        firebaseimageView = findViewById(R.id.firebaseimage);
        firebasecard = findViewById(R.id.firebase);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Image Link");

        DatabaseReference myRef3 = database.getReference("Link_Out_in");


        onLootclickad = findViewById(R.id.lottie_ad);

        ad_count = findViewById(R.id.ad_count);
        looti_coins = findViewById(R.id.lottie_coins);
        looti_text = findViewById(R.id.lottie_text);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
        currentDateandTime = sdf.format(new Date());
        Log.d("CurrentDate",currentDateandTime);
        date = sharedPreferences.getString("Date_no","null");
        data_no = sharedPreferences.getInt("Data",0);
        ad_no_remain = sharedPreferences.getInt("ad_no_remain",3);

        ad_count.setText(String.valueOf(ad_no_remain));
        editor.putString("Date_no",currentDateandTime);
        editor.apply();
        working2();


        AudienceNetworkAds.initialize(this);
        rewardedVideoAd = new RewardedVideoAd(this, "901762320321155_950683492095704");
        rewardedVideoAd.setAdListener(new RewardedVideoAdListener() {
            @Override
            public void onError(Ad ad, AdError error) {
                // Rewarded video ad failed to load
                //Log.e(TAG, "Rewarded video ad failed to load: " + error.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Rewarded video ad is loaded and ready to be displayed
                //Log.d(TAG, "Rewarded video ad is loaded and ready to be displayed!");
                int remainii = sharedPreferences.getInt("ad_no_remain",0);
                if(remainii >0){
                    onLootclickad.setVisibility(View.VISIBLE);
                    ad_count.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Rewarded video ad clicked
                //Log.d(TAG, "Rewarded video ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Rewarded Video ad impression - the event will fire when the
                // video starts playing
            }

            @Override
            public void onRewardedVideoCompleted() {
                // Rewarded Video View Complete - the video has been played to the end.
                // You can use this event to initialize your reward
                //Log.d(TAG, "Rewarded video completed!");

                onadDone();
                looti_text.setVisibility(View.VISIBLE);
                looti_coins.setVisibility(View.VISIBLE);
                // Call method to give reward
                // giveReward();
            }

            @Override
            public void onRewardedVideoClosed() {
                // The Rewarded Video ad was closed - this can occur during the video
                // by closing the app, or closing the end card.
                //Log.d(TAG, "Rewarded video ad closed!");
            }
        });

        rewardedVideoAd.loadAd();

        /**    View myviw = findViewById(R.id.container1);
             Button button = myviw.findViewById(R.id.next);
             button.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Intent intent = new Intent(getBaseContext(),shop.class);
                     startActivity(intent);
                 }
             });**/
   onLootclickad.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           rewardedVideoAd.show();
       }
   });
   looti_coins.addAnimatorListener(new Animator.AnimatorListener() {
       @Override
       public void onAnimationStart(Animator animator) {
       }

       @Override
       public void onAnimationEnd(Animator animator) {
           looti_text.setVisibility(View.GONE);
           looti_coins.setVisibility(View.GONE);
       }

       @Override
       public void onAnimationCancel(Animator animator) {

       }

       @Override
       public void onAnimationRepeat(Animator animator) {

       }
   });


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String c1titl = dataSnapshot.getValue(String.class);
                Picasso.get().load(c1titl).into(firebaseimageView);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                kk = dataSnapshot.getValue(String.class);
                if(kk.length() > 5){
                    firebasecard.setVisibility(View.VISIBLE);
                }
                else {
                    firebasecard.setVisibility(View.GONE);
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }

    @Override
    protected void onResume() {
        coins = sharedPreferences.getInt("Coins", 0);
        coinstext.setText(String.valueOf(coins));
        rewardedVideoAd.loadAd();
        super.onResume();
    }

    public void shopedits(View view) {
        Intent intent = new Intent(this,shop.class);
        startActivity(intent);
    }

    public void playcomputer(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void working2(){
        if(date.equals(currentDateandTime)){

            Log.d("Datechange",date);
            Log.d("Datechange",currentDateandTime);

        }
        else {
            Log.d("Date",date);
            Log.d("Datechange",currentDateandTime);
            if(data_no > 6) {
                data_no = 1;
            }
            else{
                data_no += 1;
            }
            editor.putInt("Data", data_no);
            editor.apply();
            editor.putInt("ad_no_remain", 3);
            editor.apply();
            ad_count.setText("3");
        }
        if(ad_no_remain < 1 ){
            onLootclickad.setVisibility(View.GONE);
            ad_count.setVisibility(View.GONE);
        }
    }
    public void onadDone(){
        int remainii = sharedPreferences.getInt("ad_no_remain",0);
        remainii--;
        looti_coins.setSpeed(0.5f);
        looti_coins.playAnimation();
        editor.putInt("ad_no_remain", remainii);
        editor.apply();
        editor.putInt("Coins", coins+25);
        editor.apply();
        coins = sharedPreferences.getInt("Coins", 0);
        coinstext.setText(String.valueOf(coins));
        ad_count.setText(String.valueOf(remainii));
        //if(remainii <1 || !rewardedVideoAd.isAdLoaded()){
        onLootclickad.setVisibility(View.GONE);
        ad_count.setVisibility(View.GONE);
        //}
    }

    public void multtipla(View view) {
        Intent intent = new Intent(this,multiplay.class);
        startActivity(intent);
    }

    public void linktab(View view) {
        Intent sharingIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(kk));
        startActivity(sharingIntent);
    }

    public void privacyy(View view) {
        Intent intent = new Intent(this, webb.class).putExtra("link",getResources().getString(R.string.privacy));
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        mainpage.super.onBackPressed();
                    }
                }).create().show();
    }
}
