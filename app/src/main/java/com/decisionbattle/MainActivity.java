package com.decisionbattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //UI variables
    Button btnBattle, btnHoH, btnHelp, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable assignment
        btnBattle = (Button)findViewById(R.id.btnMenuToBattle);
        btnHoH = (Button)findViewById(R.id.btnMenuToHoH);
        btnHelp = (Button)findViewById(R.id.btnMenuToHelp);
        btnSettings = (Button)findViewById(R.id.btnMenuToSettings);

        //set UI actions
        btnBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToBattle();
            }
        });

        btnHoH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToHoH();
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToHelp();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToSettings();
            }
        });
    }

    //UI methods
    public void GoToBattle(){
        Intent intent = new Intent(this, Battle.class);
        startActivity(intent);
    }

    public void GoToHoH(){
        Intent intent = new Intent(this, HallOfHeroes.class);
        startActivity(intent);
    }

    public void GoToHelp() {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void GoToSettings(){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

}