package com.example.score_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView teamAfh_TV, teamAsh_TV, teamAet_TV, final_A;
    private TextView teamBfh_TV, teamBsh_TV, teamBet_TV, final_B;
    int teamAfinal = 0;
    int teamBfinal = 0;
    int teamAfh, teamAsh, teamAet = 0;
    int teamBfh, teamBsh, teamBet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAfh_TV = findViewById(R.id.a_fh);
        teamAsh_TV = findViewById(R.id.a_sh);
        teamAet_TV = findViewById(R.id.a_et);
        final_A = findViewById(R.id.final_team_a_score);

        teamBfh_TV = findViewById(R.id.b_fh);
        teamBsh_TV = findViewById(R.id.b_sh);
        teamBet_TV = findViewById(R.id.b_et);
        final_B = findViewById(R.id.final_team_b_score);
    }


    public void update_fh_TeamA(View view) {
        teamAfh = teamAfh + 1;
        teamAfinal = teamAfinal + 1;
        teamAfh_TV.setText(String.valueOf(teamAfh));
        final_A.setText(String.valueOf(teamAfinal));

    }

    public void update_sh_TeamA(View view) {

        teamAsh = teamAsh + 1;
        teamAfinal = teamAfinal + 1;
        teamAsh_TV.setText(String.valueOf(teamAsh));
        final_A.setText(String.valueOf(teamAfinal));
    }

    public void update_et_TeamA(View view) {
        teamAet = teamAet + 1;
        teamAfinal = teamAfinal + 1;
        teamAet_TV.setText(String.valueOf(teamAet));
        final_A.setText(String.valueOf(teamAfinal));
    }

    public void update_et_TeamB(View view) {
        teamBet = teamBet + 1;
        teamBfinal = teamBfinal + 1;
        teamBet_TV.setText(String.valueOf(teamBet));
        final_B.setText(String.valueOf(teamBfinal));
    }

    public void update_sh_TeamB(View view) {
        teamBsh = teamBsh + 1;
        teamBfinal = teamBfinal + 1;
        teamBsh_TV.setText(String.valueOf(teamBsh));
        final_B.setText(String.valueOf(teamBfinal));
    }

    public void update_fh_TeamB(View view) {
        teamBfh = teamBfh + 1;
        teamBfinal = teamBfinal + 1;
        teamBfh_TV.setText(String.valueOf(teamBfh));
        final_B.setText(String.valueOf(teamBfinal));

    }

    public void resetScores(View view) {

        teamAfh = 0;
        teamAsh = 0;
        teamAet = 0;
        teamAfh_TV.setText(String.valueOf(teamAfh));
        teamAsh_TV.setText(String.valueOf(teamAsh));
        teamAet_TV.setText(String.valueOf(teamAet));

        teamBfh = 0;
        teamBsh = 0;
        teamBet = 0;

        teamBfh_TV.setText(String.valueOf(teamBfh));
        teamBsh_TV.setText(String.valueOf(teamBsh));
        teamBet_TV.setText(String.valueOf(teamBet));

        teamAfinal = 0;
        teamBfinal = 0;
        final_A.setText(String.valueOf(teamAfinal));
        final_B.setText(String.valueOf(teamBfinal));
    }
}
