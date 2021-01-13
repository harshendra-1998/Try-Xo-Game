package co.akshar.tryxo;

import android.content.SharedPreferences;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class Databasee extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public void Database(){
        sharedPreferences = this.getSharedPreferences("pref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
}
