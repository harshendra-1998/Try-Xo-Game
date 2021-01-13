package co.akshar.tryxo;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class startgamesetting extends AppCompatActivity {
    int x = 0;
    int xx = 1;
    int nnhih = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testtt);
        View include = findViewById(R.id.includee);
        RadioGroup radioGroup = include.findViewById(R.id.radioGroup);
        RadioGroup radioGroup2 = include.findViewById(R.id.radioGroup2);
        final TextView Texts = include.findViewById(R.id.textViewss);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int idx = radioGroup.getCheckedRadioButtonId();
                switch (idx){
                    case 2131230951:
                        x = 0;
                        break;
                    case 2131230950:
                        x = 2;
                        break;
                }
            }
        });
        /**radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int idxx = radioGroup.getCheckedRadioButtonId();
                switch (idxx){
                    case 2131230806:
                        maxmatches = 5;
                        break;
                    case 2131230807:
                        maxmatches = 9;
                        break;
                    case 2131230805:
                        maxmatches = 15;
                        break;
                    case 2131230847:
                        maxmatches = 1;
                        break;
                }
            }
        });**/
    }
}
