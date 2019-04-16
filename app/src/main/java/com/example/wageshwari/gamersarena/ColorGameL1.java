package com.example.wageshwari.gamersarena;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ColorGameL1 extends AppCompatActivity {
    SharedPreferences preferences;
    TextView count, score, color;
    Button blue, magenta, orange, yellow, black, green;
    ImageView start;
    ImageView congratsback, restartbut, nextbut;
    Random r;
    Vibrator vibe;
    int coun = 1;
    int scr = 0, index = -100;
    String arrCol[] = {"BLUE", "MAGENTA", "ORANGE", "YELLOW", "BLACK", "GREEN"};
    String arrColId[] = {"#0000ff", "#ff00ff", "#f28609", "#ffff00", "#000000", "#00ff00"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_game_l1);
        count = (TextView) findViewById(R.id.cgl1tvcount);
        score = (TextView) findViewById(R.id.cgl1tvscore);
        color = (TextView) findViewById(R.id.cgl1tvcolor);
        blue = (Button) findViewById(R.id.cgl1butblue);
        magenta = (Button) findViewById(R.id.cgl1butmag);
        orange = (Button) findViewById(R.id.cgl1butora);
        yellow = (Button) findViewById(R.id.cgl1butyel);
        black = (Button) findViewById(R.id.cgl1butbla);
        green = (Button) findViewById(R.id.cgl1butgre);
        start = (ImageView) findViewById(R.id.cgl1imgstart);
        congratsback = (ImageView) findViewById(R.id.congrats);
        restartbut = (ImageView) findViewById(R.id.restart);
        nextbut = (ImageView) findViewById(R.id.next);
        r = new Random();
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        preferences = PreferenceManager.getDefaultSharedPreferences(ColorGameL1.this);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 0) {
                    scr += 1;
                    score.setText("Score: " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 1) {
                    scr += 1;
                    score.setText("Score: " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 2) {
                    scr += 1;
                    score.setText("Score: " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 3) {
                    scr += 1;
                    score.setText("Score: " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 4) {
                    scr += 1;
                    score.setText("Score: " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 5) {
                    scr += 1;
                    score.setText("Score: " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score.setText("Score: ");
                startGame(coun);
                start.setVisibility(View.INVISIBLE);
            }
        });
    }


    public void nextlone(View v) {
        startActivity(new Intent(ColorGameL1.this,ColorGameL2.class));
        finish();
    }

    public void restartl1(View v) {
        congratsback.setVisibility(View.INVISIBLE);
        restartbut.setVisibility(View.INVISIBLE);
        nextbut.setVisibility(View.INVISIBLE);
        start.setVisibility(View.VISIBLE);
        scr = 0;
    }

    public void animate() {
        Animation anim = new TranslateAnimation(0, 20, 0, 0);
        anim.setDuration(3);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(10);
        color.startAnimation(anim);
    }

    public void startGame(int in) {
        final int j = in;
        if (in == 16) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    index = -100;
                    // vibe=null;
                    color.setText("");
                    //  start.setVisibility(View.VISIBLE);
                    coun=1;
                    int score = preferences.getInt("scrL1", 0);
                    if (scr >= score) {
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putInt("scrL1", scr); // value to store
                        editor.commit();
                    }

                    if (score>=10||scr>=10) {
                        nextbut.setVisibility(View.VISIBLE);
                        congratsback.setVisibility(View.VISIBLE);
                        restartbut.setVisibility(View.VISIBLE);
                    } else {
                        restartbut.setVisibility(View.VISIBLE);
                    }
                }
            }, 1000);

            return;
        }
      new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                index = r.nextInt(600);
                index /= 100;
                count.setText("Count: " + j + "/15");
                color.setText(arrCol[index]);
                color.setTextColor(Color.parseColor(arrColId[index]));
                startGame(j + 1);
            }
        }, 1000);
    }
}



