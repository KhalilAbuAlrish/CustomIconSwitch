package com.example.customiconswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.polyak.iconswitch.IconSwitch;

public class MainActivity extends AppCompatActivity {

    IconSwitch iconSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iconSwitch=findViewById(R.id.icon_switch);
        iconSwitch.setCheckedChangeListener(new IconSwitch.CheckedChangeListener() {
            @Override
            public void onCheckChanged(IconSwitch.Checked current) {

                switch(current){

                    case LEFT :
                        Toast.makeText(MainActivity.this, "LEFT", Toast.LENGTH_SHORT).show();
                    break;

                    case RIGHT:
                        Toast.makeText(MainActivity.this, "RIGHT", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}