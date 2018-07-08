package com.patelitsolutions.a180001451;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startgame(View v){

        String errorMessage = "";
        EditText teama = (EditText) findViewById(R.id.team_a_name);
        EditText teamb = (EditText) findViewById(R.id.team_b_name);


        // Validate Team name and set appropriate error message
        if(teama.getText().toString().equals("") && teamb.getText().toString().equals("")) {
            errorMessage = "Please enter teams name";
        }else if(teama.getText().toString().equals("")){
            errorMessage = "Please enter A team name";
        }else if(teamb.getText().toString().equals("")){
            errorMessage = "Please enter B team name";
        }


        // check if any error then toast error meesage and stop it
        if(errorMessage != ""){
            Toast.makeText(getBaseContext(),errorMessage,Toast.LENGTH_LONG).show();
            return;
        }

        // if all are perfect: pass teams name to game activity
        Intent gameintent = new Intent(this, GameActivity.class);
        gameintent.putExtra("team_a",teama.getText().toString());
        gameintent.putExtra("team_b",teamb.getText().toString());
        startActivity(gameintent);

    }


}
