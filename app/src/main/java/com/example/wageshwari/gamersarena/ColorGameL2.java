package com.example.wageshwari.gamersarena;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ColorGameL2 extends AppCompatActivity {
Button blue,magenta,orange,red,black,green,yellow,cyan,purple;
Button restart,next;
TextView countl2,scorel2,colorl2;
ImageView startl2,congratsivl2;
Random r;
int index=-100, scrl2=0,counl2=1;
Vibrator vibe;
SharedPreferences preferences;
    String arrCol[] = {"BLUE","MAGENTA","ORANGE","YELLOW","BLACK","GREEN","RED","CYAN","PURPLE"};
    String arrColId[] = {"#0000ff","#ff00ff","#f28609","#ffff00","#000000","#00ff00","#ff0000","#00ffff","#630ac1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_game_l2);
        countl2 = (TextView)findViewById(R.id.cgl2tvcount);
        scorel2 = (TextView)findViewById(R.id.cgl2tvscore);
        colorl2 = (TextView)findViewById(R.id.cgl2tvcolor);
        blue = (Button)findViewById(R.id.cgl2butblue);
        magenta = (Button)findViewById(R.id.cgl2butmagenta);
        orange = (Button)findViewById(R.id.cgl2butorange);
        yellow = (Button)findViewById(R.id.cgl2butblack);
        black = (Button)findViewById(R.id.cgl2butblack);
        green = (Button)findViewById(R.id.cgl2butgreen);
        red = (Button)findViewById(R.id.cgl2butred);
        cyan = (Button)findViewById(R.id.cgl2butcyan);
        purple = (Button)findViewById(R.id.cgl2butpurple);
        startl2 = (ImageView)findViewById(R.id.cgl2tvstart);
        restart=(Button)findViewById(R.id.restartbutl2);
        next=(Button)findViewById(R.id.nextbutl2);
        congratsivl2 = (ImageView)findViewById(R.id.congratsl2);
        r = new Random();
        vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        preferences= PreferenceManager.getDefaultSharedPreferences(ColorGameL2.this);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index==0) {
                    scrl2 += 1;
                    scorel2.setText("Score: "+scrl2);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 1) {
                    scrl2 += 1;
                    scorel2.setText("Score: " + scrl2);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 2) {
                    scrl2 += 1;
                    scorel2.setText("Score: " + scrl2);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 3) {
                    scrl2 += 1;
                    scorel2.setText("Score: " + scrl2);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 4) {
                    scrl2 += 1;
                    scorel2.setText("Score: " + scrl2);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 5) {
                    scrl2 += 1;
                    scorel2.setText("Score: " + scrl2);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (index == 6) {
                        scrl2 += 1;
                        scorel2.setText("Score: " + scrl2);
                    } else {
                        index = -100;
                        vibe.vibrate(200);
                        animate();
                    }
                }
        });

        cyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 7) {
                    scrl2 += 1;
                    scorel2.setText("Score: " + scrl2);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (index == 8) {
                        scrl2 += 1;
                        scorel2.setText("Score: " + scrl2);
                    } else {
                        index = -100;
                        vibe.vibrate(200);
                        animate();
                    }
                }

            });

        startl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorel2.setText("Score: ");
                startGame(counl2);
                startl2.setVisibility(View.INVISIBLE);
            }
        });
    }


    public void animate(){
            Animation anim = new TranslateAnimation(0,20,0,0);
            anim.setDuration(3);
            anim.setRepeatMode(Animation.REVERSE);
            anim.setRepeatCount(10);
            colorl2.startAnimation(anim);
        }

        public void restartl2(View v){
          congratsivl2.setVisibility(View.INVISIBLE);
          next.setVisibility(View.INVISIBLE);
          restart.setVisibility(View.INVISIBLE);
            startl2.setVisibility(View.VISIBLE);
            scrl2=0;
        }

        public void nextl2(View v){
            startActivity(new Intent(ColorGameL2.this,ColorGameL3.class));
            finish();
        }

    public void startGame(int in){
        final int j = in;
        if(in == 26){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    index = -100;
                    // vibe=null;
                    colorl2.setText("");
                    //  start.setVisibility(View.VISIBLE);
                    counl2=1;

            int score=preferences.getInt("scorel2",0);
            if(scrl2>=score){
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("scorel2", scrl2); // value to store
                editor.commit();
            }
            if(score>=20||scrl2>=20){
                 congratsivl2.setVisibility(View.VISIBLE);
                 restart.setVisibility(View.VISIBLE);
                 next.setVisibility(View.VISIBLE);
            }else{ startl2.setVisibility(View.VISIBLE);}
                }
            }, 1000);

            return;
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                index = r.nextInt(900);
                index /= 100;
                countl2.setText("Count: "+j+"/25");
                colorl2.setText(arrCol[index]);
                colorl2.setTextColor(Color.parseColor(arrColId[index]));
                startGame(j+1);
            }
        }, 800);
    }

}
