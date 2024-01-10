package com.decisionbattle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BattleInstance {

    ArrayList<String> combatants;
    Date battleDate;
    String winner, battleType;

    @Override
    public String toString() {
        return "Date: '" + battleDate.toString() +
                ". Type: " + battleType +
                ". Combatants: '" + combatants.toString() +
                ". Winner: '" + winner + "'.";
    }

    public BattleInstance(ArrayList<String> combatants, String battleType) {

        this.combatants = combatants;

        this.battleType = battleType;

        //set winner to non-null default state, winner will be set properly at the end of the battle
        this.winner = "";

        //set the date variable to the current date
        this.battleDate = Calendar.getInstance().getTime();

    }

    public BattleInstance() {}

    public ArrayList<String> getCombatants() {
        return combatants;
    }

    public void setCombatants(ArrayList<String> combatants) {
        this.combatants = combatants;
    }

    public Date getBattleDate() {
        return battleDate;
    }

    public void setBattleDate(Date battleDate) {
        this.battleDate = battleDate;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getBattleType() {
        return battleType;
    }

    public void setBattleType(String battleType) {
        this.battleType = battleType;
    }
}
