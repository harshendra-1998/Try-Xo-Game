package co.akshar.tryxo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class shop extends AppCompatActivity {
    Button[] xono = new Button[9];
    Button[] wall = new Button[3];
    int[] xoavailable = {1,0,0,0};
    int[] wallavailable = {1,0,0};
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView coinstext;
    LinearLayout[] cashXO = new LinearLayout[4];
    LinearLayout[] cashTheme = new LinearLayout[3];
    int coins = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);


        sharedPreferences = this.getSharedPreferences("pref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        xono[0] = findViewById(R.id.xo1);
        xono[1] = findViewById(R.id.xo2);
        xono[2] = findViewById(R.id.xo3);
        xono[3] = findViewById(R.id.xo4);

        wall[0] = findViewById(R.id.wall1);
        wall[1] = findViewById(R.id.wall2);
        wall[2] = findViewById(R.id.wall3);

        cashXO[0] = findViewById(R.id.cashXO1);
        cashXO[1] = findViewById(R.id.cashXO2);
        cashXO[2] = findViewById(R.id.cashXO3);
        cashXO[3] = findViewById(R.id.cashXO4);

        cashTheme[0] = findViewById(R.id.cashtheme1);
        cashTheme[1] = findViewById(R.id.cashtheme2);
        cashTheme[2] = findViewById(R.id.cashtheme3);

        coinstext = findViewById(R.id.coins);

        coins = sharedPreferences.getInt("Coins", 0);
        coinstext.setText(String.valueOf(coins));
        buttonchanges();

        xono[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    setxotheme(0);
                    /**coins = coins + 500;
                    editor.putInt("Coins", coins);
                    editor.commit();

                coinstext.setText(String.valueOf(coins));**/

            }
        });
        xono[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xoavailable[1]>0){
                    setxotheme(1);
                }
                else{
                    coinchange(250,"xo",1);
                }
            }
        });
        xono[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xoavailable[2]>0){
                    setxotheme(2);
                }
                else{
                    coinchange(500,"xo",2);
                }
            }
        });
        xono[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xoavailable[3]>0){
                    setxotheme(3);
                }
                else{
                    coinchange(900,"xo",3);
                }
            }
        });
        wall[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWalltheme(0);
            }
        });
        wall[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wallavailable[1]>0){
                    setWalltheme(1);
                }
                else{
                    coinchange(400,"wall",1);
                }
            }
        });
        wall[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wallavailable[2]>0){
                    setWalltheme(2);
                }
                else{
                    coinchange(1000,"wall",2);
                }
            }
        });


    }


    public void coinchange(int deduction, String Type, int posi){
        if(coins >= deduction){
            coins = coins - deduction;
            editor.putInt("Coins", coins);
            editor.commit();
            editor.putInt(""+ Type + "" + String.valueOf(posi) +"", 1);
            editor.commit();
            coinstext.setText(String.valueOf(coins));
            Toast.makeText(this, (CharSequence)"Theme Set",Toast.LENGTH_SHORT).show();
            recreate();
        }
        else{
            Toast.makeText(this, (CharSequence)"Not enough Coins",Toast.LENGTH_SHORT).show();
        }
    }

    public void setxotheme(int buttonXOno){
        editor.putInt("XOTheme",buttonXOno);
        editor.commit();
        int itemno = sharedPreferences.getInt("XOTheme", 0);
        Toast.makeText(this, (CharSequence)"Theme Set " + String.valueOf(itemno) + "",Toast.LENGTH_SHORT).show();
        xoavailable[buttonXOno] = 1;
        editor.putInt(""+"xo"+ "" +String.valueOf(buttonXOno)+"",1);
        editor.commit();
        buttonchanges();
    }
    public void setWalltheme(int buttonWallno){
        editor.putInt("WALLTheme",buttonWallno);
        editor.commit();
        int itemno = sharedPreferences.getInt("WALLTheme", 0);
        Toast.makeText(this, (CharSequence)"Theme Set " + String.valueOf(itemno) + "",Toast.LENGTH_SHORT).show();
        wallavailable[buttonWallno] = 1;
        editor.putInt(""+"wall" +String.valueOf(buttonWallno)+"",1);
        editor.commit();
        buttonchanges();
    }


    public void buttonchanges(){
        for (int ii = 0 ; ii < 4; ii++ ){
            xoavailable[ii] = sharedPreferences.getInt(""+"xo"+ "" +String.valueOf(ii)+"", 0);
            xono[ii].setBackgroundResource(R.drawable.selectbutton);
            xono[ii].setText("SELECT");
            if(xoavailable[ii]>0){
                cashXO[ii].setVisibility(View.GONE);
            }
            /**if(xoavailable[ii]>0){
             xono[ii].setBackgroundResource(R.drawable.selectbutton);
             xono[ii].setText("SELECT");
             }
             else{
             xono[ii].setBackgroundResource(R.drawable.buybutton);
             xono[ii].setText("BUY");
             }**/
        }
        for (int ij = 0 ; ij < 3; ij++ ){
            wallavailable[ij] = sharedPreferences.getInt(""+"wall"+""+String.valueOf(ij)+"", 0);
            wall[ij].setBackgroundResource(R.drawable.selectbutton);
            wall[ij].setText("SELECT");
            if(wallavailable[ij]>0){
                cashTheme[ij].setVisibility(View.GONE);
            }
            /**if(wallavailable[ij]>0){
             wall[ij].setBackgroundResource(R.drawable.selectbutton);
             wall[ij].setText("SELECT");
             }
             else{
             wall[ij].setBackgroundResource(R.drawable.buybutton);
             wall[ij].setText("BUY");
             }**/
        }

        int itemnoXO = sharedPreferences.getInt("XOTheme", 0);
        xono[itemnoXO].setText("SELECTED");
        xono[itemnoXO].setBackgroundResource(R.drawable.selectedbutton);


        int itemnowall = sharedPreferences.getInt("WALLTheme", 0);
        wall[itemnowall].setText("SELECTED");
        wall[itemnowall].setBackgroundResource(R.drawable.selectedbutton);
    }
}