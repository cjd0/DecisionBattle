package com.decisionbattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Battle extends AppCompatActivity {

    //UI variables
    Button btnHelp, btnAdd, btnWar, btnSkirmish, btnInstant;
    EditText etInput;
    TextView tvChoices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        //variable assignment
        btnHelp = (Button)findViewById(R.id.btnBattleToHelp);
        btnAdd = (Button)findViewById(R.id.btnBattleAddChoice);
        btnWar = (Button)findViewById(R.id.btnBattleWar);
        btnSkirmish = (Button)findViewById(R.id.btnBattleSkirmish);
        btnInstant = (Button)findViewById(R.id.btnBattleInstant);
        etInput = (EditText)findViewById(R.id.etBattleInput);
        tvChoices = (TextView)findViewById(R.id.tvBattleList);

        //set UI actions
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToHelp();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddChoiceToList();
            }
        });

        btnWar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartBattle("War");
            }
        });

        btnSkirmish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartBattle("Skirmish");
            }
        });

        btnInstant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartBattle("Instant");
            }
        });
    }

    //UI methods
    public void GoToHelp(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    public void AddChoiceToList(){
        //add code to add input to list, update list textview, then clear input
    }

    public void StartBattle(String battleType) {
        //add code for battle, pass through list and battleType to battle activity
    }
}