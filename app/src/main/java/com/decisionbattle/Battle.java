package com.decisionbattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Battle extends AppCompatActivity {

    //UI variables
    Button btnHelp, btnAdd, btnWar, btnSkirmish, btnInstant;
    EditText etInput;
    TextView tvChoices;

    //functional variables
    ArrayList<String> battleChoices = new ArrayList<String>();

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

    private void AddChoiceToList(){
        //define input variable
        String input = etInput.getText().toString();

        //add to list
        battleChoices.add(input);

        //add to TextView
        //if first entry do not prefix with comma and space
        if (tvChoices.getText().toString().isEmpty()) {
            tvChoices.setText(input);
        }
        else {
            tvChoices.append(", " + input);
        }

        //clear input field
        etInput.setText("");
    }

    private void StartBattle(String battleType) {

        if (battleChoices.size() > 1) {

            //clear ui
            tvChoices.setText("");

            BattleInstance battle = new BattleInstance(battleChoices, battleType);

            if (battleType.equals("War")) {
                WarBattle(battle);
            } else if (battleType.equals("Skirmish")) {
                SkirmishBattle(battle);
            } else {
                InstantBattle(battle);
            }
        }
        else {
            Toast.makeText(this, "Please enter at least two combatants.", Toast.LENGTH_SHORT).show();
        }
    }

    //instant battles immediately show the winner with no detail
    private void InstantBattle(BattleInstance battle) {

        ArrayList<String> combatants = battle.getCombatants();

        //no need to simulate a tournament as this is just a random choice
        Collections.shuffle(combatants);

        String winner = combatants.get(0);

        battle.setWinner(winner);

    }

    //skirmishes show the winner/loser of each stage of the tournament only
    private void SkirmishBattle(BattleInstance battle) {

    }

    //wars are skirmishes with expanded details about individual battles
    private void WarBattle(BattleInstance battle) {

    }

    private void BattleResults(BattleInstance battle) {

    }
}