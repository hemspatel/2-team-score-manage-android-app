package com.patelitsolutions.a180001451;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView teamAscore;
    TextView teamBscore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent gameintent = getIntent();
        String teamAname = gameintent.getStringExtra("team_a");
        String teamBname = gameintent.getStringExtra("team_b");

        TextView Ateam = (TextView)findViewById(R.id.teamaname);
        TextView Bteam = (TextView)findViewById(R.id.teambname);

        Ateam.setText(teamAname);
        Bteam.setText(teamBname);

        teamAscore = (TextView)findViewById(R.id.team_a_score);
        teamBscore = (TextView)findViewById(R.id.team_b_score);
    }

    // reset both team score
    public void resetscore(View v){
        teamAscore.setText("0");
        teamBscore.setText("0");
    }

    //update A team score start
    public void updateAteamscore(Integer newscore){
        Integer oldScore = Integer.parseInt(teamAscore.getText().toString());
        oldScore = oldScore + newscore;
        teamAscore.setText(oldScore.toString());
    }
    public void add3pointsInA(View v){
        updateAteamscore(3);
    }
    public void add2pointsInA(View v){
        updateAteamscore(2);
    }
    public void add1pointsInA(View v){
        updateAteamscore(1);
    }
    //update A team score end

    //update b team score start
    public void updateBteamscore(Integer newscore){
        Integer oldScore = Integer.parseInt(teamBscore.getText().toString());
        oldScore = oldScore + newscore;
        teamBscore.setText(oldScore.toString());
    }
    public void add3pointsInB(View v){
        updateBteamscore(3);
    }
    public void add2pointsInB(View v){
        updateBteamscore(2);
    }
    public void add1pointsInB(View v){
        updateBteamscore(1);
    }
    //update b team score end


}
