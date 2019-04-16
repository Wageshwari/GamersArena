package com.example.wageshwari.gamersarena;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SpinTheBottle extends AppCompatActivity {

    View rel;
    int e=1,x=1;
    LinearLayout stbLay1;
    RelativeLayout stbLay2;

    ImageView up, down;
    TextView totalPlayer;
    ImageView play;

    ImageView background, bot;


    Random r;
    Animation anim;
    int lastAngle = -1, angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_the_bottle);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        rel = (View) findViewById(R.id.view);

        stbLay1 = (LinearLayout) findViewById(R.id.stbLayout1);
        stbLay2 = (RelativeLayout) findViewById(R.id.stbLayout2);

        up = (ImageView) findViewById(R.id.stbUp);
        down = (ImageView) findViewById(R.id.stbDown);
        totalPlayer = (TextView) findViewById(R.id.stbTotalPlayer);
        play = (ImageView) findViewById(R.id.stbPlay);

        background = (ImageView) findViewById(R.id.stbBackground);
        bot = (ImageView) findViewById(R.id.stbottle);


        r = new Random();
        rel.setEnabled(false);

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPlayer.getText().equals("8")) {
                    totalPlayer.setText("7");
                    background.setBackgroundResource(R.drawable.spinbotback7);
                    up.setEnabled(true);
                    up.setAlpha(1f);
                    return;
                }
                if (totalPlayer.getText().equals("7")) {
                    totalPlayer.setText("6");
                    background.setBackgroundResource(R.drawable.spinbotback6);
                    return;
                }
                if (totalPlayer.getText().equals("6")) {
                    totalPlayer.setText("5");
                    background.setBackgroundResource(R.drawable.spinbotback5);
                    return;
                }
                if (totalPlayer.getText().equals("5")) {
                    totalPlayer.setText("4");
                    background.setBackgroundResource(R.drawable.spinbotback4);
                    return;
                }
                if (totalPlayer.getText().equals("4")) {
                    totalPlayer.setText("3");
                    background.setBackgroundResource(R.drawable.spinbotback3);
                    return;
                }
                if (totalPlayer.getText().equals("3")) {
                    totalPlayer.setText("2");
                    background.setBackgroundResource(R.drawable.spinbotback2);
                    down.setEnabled(false);
                    down.setAlpha(0.5f);
                }
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPlayer.getText().equals("2")) {
                    totalPlayer.setText("3");
                    background.setBackgroundResource(R.drawable.spinbotback3);
                    down.setEnabled(true);
                    down.setAlpha(1f);
                    return;
                }
                if (totalPlayer.getText().equals("3")) {
                    totalPlayer.setText("4");
                    background.setBackgroundResource(R.drawable.spinbotback4);
                    return;
                }
                if (totalPlayer.getText().equals("4")) {
                    totalPlayer.setText("5");
                    background.setBackgroundResource(R.drawable.spinbotback5);
                    return;
                }
                if (totalPlayer.getText().equals("5")) {
                    totalPlayer.setText("6");
                    background.setBackgroundResource(R.drawable.spinbotback6);
                    return;
                }
                if (totalPlayer.getText().equals("6")) {
                    totalPlayer.setText("7");
                    background.setBackgroundResource(R.drawable.spinbotback7);
                    return;
                }
                if (totalPlayer.getText().equals("7")) {
                    totalPlayer.setText("8");
                    background.setBackgroundResource(R.drawable.spinbotback8);
                    up.setEnabled(false);
                    up.setAlpha(0.5f);
                }
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stbLay1.setVisibility(View.GONE);
                stbLay2.setVisibility(View.VISIBLE);
                rel.setEnabled(true);
                e=1;
            }
        });

        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rel.setEnabled(false);
                spinBottle();
            }
        });
    }

    public void spinBottle() {
        angle = r.nextInt(100000) + 360;

        anim = new RotateAnimation(lastAngle == -1 ? 0 : lastAngle, angle, bot.getPivotX(), bot.getPivotY());
        anim.setDuration(1500);
        anim.setFillAfter(true);
        bot.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                result(totalPlayer.getText().toString(), angle % 360);
            }
        },1508);

        lastAngle = angle;
        rel.setEnabled(true);
    }

    public void result(String totalPlayer, int angle) {
        switch (totalPlayer) {
            case "2":
                if (angle > 180)
                    Toast.makeText(getApplicationContext(), "PLAYER 2 TURN", Toast.LENGTH_SHORT).show();

                else
                    Toast.makeText(getApplicationContext(), "PLAYER 1 TURN", Toast.LENGTH_SHORT).show();
                break;
            case "3":
                if (angle > 240)
                    Toast.makeText(getApplicationContext(),"PLAYER 3 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 120)
                    Toast.makeText(getApplicationContext(),"PLAYER 2 TURN",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"PLAYER 1 TURN",Toast.LENGTH_SHORT).show();
                break;
            case "4":
                if (angle > 270)
                    Toast.makeText(getApplicationContext(),"PLAYER 4 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 180)
                    Toast.makeText(getApplicationContext(),"PLAYER 3 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 90)
                    Toast.makeText(getApplicationContext(),"PLAYER 2 TURN",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"PLAYER 1 TURN",Toast.LENGTH_SHORT).show();
                break;
            case "5":
                if (angle > 288)
                    Toast.makeText(getApplicationContext(),"PLAYER 5 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 216)
                    Toast.makeText(getApplicationContext(),"PLAYER 4 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 144)
                    Toast.makeText(getApplicationContext(),"PLAYER 3 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 72)
                    Toast.makeText(getApplicationContext(),"PLAYER 2 TURN",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"PLAYER 1 TURN",Toast.LENGTH_SHORT).show();
                break;
            case "6":
                if (angle > 300)
                    Toast.makeText(getApplicationContext(),"PLAYER 6 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 240)
                    Toast.makeText(getApplicationContext(),"PLAYER 5 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 180)
                    Toast.makeText(getApplicationContext(),"PLAYER 4 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 120)
                    Toast.makeText(getApplicationContext(),"PLAYER 3 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 60)
                    Toast.makeText(getApplicationContext(),"PLAYER 2 TURN",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"PLAYER 1 TURN",Toast.LENGTH_SHORT).show();
                break;
            case "7":
                if (angle > 308)
                    Toast.makeText(getApplicationContext(),"PLAYER 7 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 257)
                    Toast.makeText(getApplicationContext(),"PLAYER 6 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 205)
                    Toast.makeText(getApplicationContext(),"PLAYER 5 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 154)
                    Toast.makeText(getApplicationContext(),"PLAYER 4 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 102)
                    Toast.makeText(getApplicationContext(),"PLAYER 3 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 51)
                    Toast.makeText(getApplicationContext(),"PLAYER 2 TURN",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"PLAYER 1 TURN",Toast.LENGTH_SHORT).show();
                break;
            case "8":
                if (angle > 315)
                    Toast.makeText(getApplicationContext(),"PLAYER 8 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 270)
                    Toast.makeText(getApplicationContext(),"PLAYER 7 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 225)
                    Toast.makeText(getApplicationContext(),"PLAYER 6 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 180)
                    Toast.makeText(getApplicationContext(),"PLAYER 5 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 135)
                    Toast.makeText(getApplicationContext(),"PLAYER 4 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 90)
                    Toast.makeText(getApplicationContext(),"PLAYER 3 TURN",Toast.LENGTH_SHORT).show();
                else if (angle > 45)
                    Toast.makeText(getApplicationContext(),"PLAYER 2 TURN",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"PLAYER 1 TURN",Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        if(e==1){
        stbLay1.setVisibility(View.VISIBLE);
        stbLay2.setVisibility(View.INVISIBLE);
        e=0;
    }
    else{
            startActivity(new Intent(SpinTheBottle.this,Arena.class));
        }
    }

}