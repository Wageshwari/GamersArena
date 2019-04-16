package com.example.wageshwari.gamersarena;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import static com.example.wageshwari.gamersarena.R.drawable.timerstyleblue;

public class QuizL1 extends AppCompatActivity {
    ProgressBar progressBar;
    TextToSpeech tts;
    int progress,lang,Q;
    int point=0;
    TextView time,qno,points,question,qtime;
    ImageView start,rule;
    CountDownTimer cdt,qcdt;
    Button op1,op2,op3,op4;
    InputStream inps;
    BufferedReader bfr;
    int noq = 2,count = 1;
    int totPoints = 0;
    int pointArr[] = new int[noq];
    String values[];
    Toast t;
    Drawable yellow,red;
    LinearLayout but;
    ArrayList<Integer> arr;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_l1);
        progressBar = (ProgressBar)findViewById(R.id.progressBarCircle);
        time = (TextView)findViewById(R.id.textViewTime);
        question = (TextView)findViewById(R.id.quiz);
        points = (TextView)findViewById(R.id.quiztvpoint);
        qno = (TextView)findViewById(R.id.quiztvqno);
        op1 = (Button)findViewById(R.id.quizop1);
        op2 = (Button)findViewById(R.id.quizop2);
        op3 = (Button)findViewById(R.id.quizop3);
        op4 = (Button)findViewById(R.id.quizop4);
        start = (ImageView)findViewById(R.id.quizstart);
        rule = (ImageView)findViewById(R.id.quizrule);
        yellow = getDrawable(R.drawable.timerstyle);
        red = getDrawable(R.drawable.timerstylered);
        but=(LinearLayout)findViewById(R.id.ansbut);
        qtime=(TextView)findViewById(R.id.number);
        pointArr[0] = point;
        inps = getResources().openRawResource(R.raw.quizquestion);
        bfr = new BufferedReader(new InputStreamReader(inps));


        tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS){
                     lang=tts.setLanguage(Locale.US);
                }
            }
        });
       arr= new ArrayList<Integer>();
       arr.add(0);
        arr.add(1);
        arr.add(2);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.getText().toString().equals(values[6])){
                    point=point+500;
                    totPoints = pointArr[count-1]+point;
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op2.getText().toString().equals(values[6])){
                    point=point+500;
                    totPoints = pointArr[count-1]+point;
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op3.getText().toString().equals(values[6])){
                    point=point+500;
                    totPoints = pointArr[count-1]+point;
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op4.getText().toString().equals(values[6])){
                    point=point+500;
                    totPoints = pointArr[count-1]+point;
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });

    }
     public void start(View view) {
            rule.setVisibility(View.INVISIBLE);
            start.setVisibility(View.INVISIBLE);
            Collections.shuffle(arr);
            Q=arr.get(count);
            playGame(count,Q);
        }


    public void playGame(int count,int Q){
        try {
            read(5);
            inps = getResources().openRawResource(R.raw.quizquestion);
            bfr = new BufferedReader(new InputStreamReader(inps));
            String line = bfr.readLine();
            values = line.split(",");
            while(Q!=Integer.parseInt(values[0])){
                line=bfr.readLine();
                values=line.split(",");
            }
            question.setText(values[1]);
            qno.setText("Qno: "+count);
            op1.setText(values[2]);
            op2.setText(values[3]);
            op3.setText(values[4]);
            op4.setText(values[5]);
            if(lang!=TextToSpeech.LANG_MISSING_DATA && lang!=TextToSpeech.LANG_NOT_SUPPORTED){
                tts.speak(values[1],TextToSpeech.QUEUE_FLUSH,null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(int x) {
        final int count = x;
        qtime.setText(count + "");
        if (x < 0) {
            but.setVisibility(View.VISIBLE);
            qtime.setText("");
            countdown();
            return;
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                read(count-1);
            }
        },1000);
    }

    public void countdown(){
        progress=10;
        progressBar.setProgressDrawable(yellow);
        time.setTextColor(Color.parseColor("#F5FA55"));
        cdt = new CountDownTimer(11050,1000) {
            @Override
            public void onTick(final long remainingTime) {
                if(remainingTime<5000) {
                    progressBar.setProgressDrawable(red);
                    time.setTextColor(Color.parseColor("#ff0000"));
                }
                time.setText(progress+"");
                progressBar.setProgress(progress--);

            }

            @Override
            public void onFinish() {
                cdt.cancel();
                ++count;
                if(count<=noq){
                    Q=arr.get(count);
                    playGame(count,Q);
                    but.setVisibility(View.INVISIBLE);
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Finish", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    t.show();
                }
            }
        }.start();
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        tts.stop();
        tts.shutdown();
    }
}
