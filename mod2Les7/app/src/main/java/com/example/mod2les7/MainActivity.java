package com.example.mod2les7;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText distance;
    private Button button;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.textView4);
        distance = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button.setOnClickListener(Listener);
    }

    private View.OnClickListener Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Aircraft airplane1 = new Aircraft(210, 850, 3.7);
            Aircraft airplane2 = new Aircraft(189, 900, 2.8);
            Helicopter helicopter = new Helicopter(8, 250, 14);

            airplane1.setDistance(Integer.parseInt(distance.getText().toString()));
            airplane2.setDistance(Integer.parseInt(distance.getText().toString()));
            helicopter.setDistance(Integer.parseInt(distance.getText().toString()));


            output.setText("Самолёту 1 необходимо " + airplane1.consumption() + " тонн топлива и "+airplane1.timeHours() + " часов\n" +
                    "Самолёту 2 необходимо " + airplane2.consumption() + " тонн топлива и "+airplane2.timeHours() + " часов\n" +
                    "Вертолёту необходимо " + helicopter.consumption() + " килограммов топлива и "+helicopter.timeHours() + " часов\n");
        }
    };
}