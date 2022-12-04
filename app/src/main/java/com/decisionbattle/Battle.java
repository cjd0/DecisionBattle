package com.decisionbattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Battle extends AppCompatActivity {

    //UI variables
    Button btnHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        //variable assignment
        btnHelp = (Button)findViewById(R.id.btnBattleToHelp);

        //set UI actions
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToHelp();
            }
        });
    }

    //UI methods
    public void GoToHelp(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }
}