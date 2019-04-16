package com.example.wageshwari.gamersarena;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class SlideGameL3 extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,restartl3;
    ImageView congol3;
    Vibrator vibe;
    ArrayList<String> arr=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_l3);
        b1=(Button)findViewById(R.id.sgl3but1);
        b2=(Button)findViewById(R.id.sgl3but2);
        b3=(Button)findViewById(R.id.sgl3but3);
        b4=(Button)findViewById(R.id.sgl3but4);
        b5=(Button)findViewById(R.id.sgl3but5);
        b6=(Button)findViewById(R.id.sgl3but6);
        b7=(Button)findViewById(R.id.sgl3but7);
        b8=(Button)findViewById(R.id.sgl3but8);
        b9=(Button)findViewById(R.id.sgl3but9);
        b10=(Button)findViewById(R.id.sgl3but10);
        b11=(Button)findViewById(R.id.sgl3but11);
        b12=(Button)findViewById(R.id.sgl3but12);
        b13=(Button)findViewById(R.id.sgl3but13);
        b14=(Button)findViewById(R.id.sgl3but14);
        b15=(Button)findViewById(R.id.sgl3but15);
        b16=(Button)findViewById(R.id.sgl3but16);
        b17=(Button)findViewById(R.id.sgl3but17);
        b18=(Button)findViewById(R.id.sgl3but18);
        b19=(Button)findViewById(R.id.sgl3but19);
        b20=(Button)findViewById(R.id.sgl3but20);
        b21=(Button)findViewById(R.id.sgl3but21);
        b22=(Button)findViewById(R.id.sgl3but22);
        b23=(Button)findViewById(R.id.sgl3but23);
        b24=(Button)findViewById(R.id.sgl3but24);
        b25=(Button)findViewById(R.id.sgl3but25);
        restartl3=(Button)findViewById(R.id.restartsgbutl3);
        congol3=(ImageView) findViewById(R.id.congoivl3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);

      restartl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartl3.setVisibility(View.INVISIBLE);
                congol3.setVisibility(View.INVISIBLE);
                shuffleNumbers();
            }
        });

        vibe=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        arr.add("");  arr.add("1"); arr.add("2");
        arr.add("3"); arr.add("4"); arr.add("5");
        arr.add("6"); arr.add("7"); arr.add("8");
        arr.add("9"); arr.add("10");arr.add("11");
        arr.add("12");arr.add("13");arr.add("14");
        arr.add("15");arr.add("16");arr.add("17");
        arr.add("18");arr.add("19");arr.add("20");
        arr.add("21");arr.add("22");arr.add("23");
        arr.add("24");
        shuffleNumbers();
    }

    public void shuffleNumbers(){
        int inversions;
        while(true){
            inversions = 0;
            Collections.shuffle(arr);
            for(int i=0; i<=23; i++){
                for (int j=i+1; j<=24; j++){
                    if(!arr.get(i).equals("") && !arr.get(j).equals("") && Integer.parseInt(arr.get(i))>Integer.parseInt(arr.get(j)))
                        inversions++;
                }
            }
            if(inversions%2==0)
                break;
        }

        setImage();
    }
    public void setImage(){
        b1.setText(arr.get(0)); b1.setTextSize(25);
        b2.setText(arr.get(1)); b2.setTextSize(25);
        b3.setText(arr.get(2)); b3.setTextSize(25);
        b4.setText(arr.get(3)); b4.setTextSize(25);
        b5.setText(arr.get(4)); b5.setTextSize(25);
        b6.setText(arr.get(5)); b6.setTextSize(25);
        b7.setText(arr.get(6)); b7.setTextSize(25);
        b8.setText(arr.get(7)); b8.setTextSize(25);
        b9.setText(arr.get(8)); b9.setTextSize(25);
        b10.setText(arr.get(9));b10.setTextSize(25);
        b11.setText(arr.get(10));b11.setTextSize(25);
        b12.setText(arr.get(11));b12.setTextSize(25);
        b13.setText(arr.get(12));b13.setTextSize(25);
        b14.setText(arr.get(13));b14.setTextSize(25);
        b15.setText(arr.get(14));b15.setTextSize(25);
        b16.setText(arr.get(15));b16.setTextSize(25);
        b17.setText(arr.get(16));b17.setTextSize(25);
        b18.setText(arr.get(17));b18.setTextSize(25);
        b19.setText(arr.get(18));b19.setTextSize(25);
        b20.setText(arr.get(19));b20.setTextSize(25);
        b21.setText(arr.get(20));b21.setTextSize(25);
        b22.setText(arr.get(21));b22.setTextSize(25);
        b23.setText(arr.get(22));b23.setTextSize(25);
        b24.setText(arr.get(23));b24.setTextSize(25);
        b25.setText(arr.get(24));b25.setTextSize(25);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.sgl3but1:
                if(b2.getText().equals(""))
                    doSwap(b1, b2);
                else if(b6.getText().equals(""))
                    doSwap(b1, b6);
                else if(!b1.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but2:
                if(b1.getText().equals(""))
                    doSwap(b2,b1);
                else if(b3.getText().equals(""))
                    doSwap(b2, b3);
                else if(b7.getText().equals(""))
                    doSwap(b2, b7);
                else if(!b2.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but3:
                if(b2.getText().equals(""))
                    doSwap(b3, b2);
                else if(b4.getText().equals(""))
                    doSwap(b3, b4);
                else if(b8.getText().equals(""))
                    doSwap(b3, b8);
                else if(!b3.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but4:
                if(b3.getText().equals(""))
                    doSwap(b4, b3);
                else if(b5.getText().equals(""))
                    doSwap(b4, b5);
                else if(b9.getText().equals(""))
                    doSwap(b4, b9);
                else if(!b4.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but5:
                if(b4.getText().equals(""))
                    doSwap(b5, b4);
                else if(b10.getText().equals(""))
                    doSwap(b5, b10);
                else if(!b5.getText().equals(""))
                    vibe.vibrate(100);
                break;

            case R.id.sgl3but6:
                if(b1.getText().equals(""))
                    doSwap(b6, b1);
                else if(b7.getText().equals(""))
                    doSwap(b6, b7);
                else if(b11.getText().equals(""))
                    doSwap(b6, b11);
                else if(!b6.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but7:
                if(b2.getText().equals(""))
                    doSwap(b7, b2);
                else if(b6.getText().equals(""))
                    doSwap(b7, b6);
                else if(b8.getText().equals(""))
                    doSwap(b7, b8);
                else if(b12.getText().equals(""))
                    doSwap(b7, b12);
                else if(!b7.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but8:
                if(b3.getText().equals(""))
                    doSwap(b8,b3);
                else if(b7.getText().equals(""))
                    doSwap(b8, b7);
                else if(b9.getText().equals(""))
                    doSwap(b8, b9);
                else if(b13.getText().equals(""))
                    doSwap(b8, b13);
                else if(!b8.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but9:
                if(b4.getText().equals(""))
                    doSwap(b9, b4);
                else if(b8.getText().equals(""))
                    doSwap(b9, b8);
                else if(b10.getText().equals(""))
                    doSwap(b9, b10);
                else if(b14.getText().equals(""))
                    doSwap(b9, b14);
                else if(!b9.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but10:
                if(b5.getText().equals(""))
                    doSwap(b10, b5);
                else if(b9.getText().equals(""))
                    doSwap(b10, b9);
                else if(b15.getText().equals(""))
                    doSwap(b10, b15);
                else if(!b10.getText().equals(""))
                    vibe.vibrate(100);
                break;

            case R.id.sgl3but11:
                if(b6.getText().equals(""))
                    doSwap(b11, b6);
                else if(b12.getText().equals(""))
                    doSwap(b11, b12);
                else if(b16.getText().equals(""))
                    doSwap(b11, b16);
                else if(!b11.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but12:
                if(b7.getText().equals(""))
                    doSwap(b12,b7);
                else if(b11.getText().equals(""))
                    doSwap(b12, b11);
                else if(b13.getText().equals(""))
                    doSwap(b12, b13);
                else if(b17.getText().equals(""))
                    doSwap(b12, b17);
                else if(!b12.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but13:
                if(b8.getText().equals(""))
                    doSwap(b13, b8);
                else if(b12.getText().equals(""))
                    doSwap(b13, b12);
                else if(b14.getText().equals(""))
                    doSwap(b13, b14);
                else if(b18.getText().equals(""))
                    doSwap(b13, b18);
                else if(!b13.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but14:
                if(b9.getText().equals(""))
                    doSwap(b14,b9);
                else if(b13.getText().equals(""))
                    doSwap(b14, b13);
                else if(b15.getText().equals(""))
                    doSwap(b14, b15);
                else if(b19.getText().equals(""))
                    doSwap(b14, b19);
                else if(!b14.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but15:
                if(b10.getText().equals(""))
                    doSwap(b15, b10);
                else if(b14.getText().equals(""))
                    doSwap(b15, b14);
                else if(b20.getText().equals(""))
                    doSwap(b15, b20);
                else if(!b15.getText().equals(""))
                    vibe.vibrate(100);
                break;

            case R.id.sgl3but16:
                if(b11.getText().equals(""))
                    doSwap(b16, b11);
                else if(b17.getText().equals(""))
                    doSwap(b16, b17);
                else if(b21.getText().equals(""))
                    doSwap(b16, b21);
                else if(!b16.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but17:
                if(b12.getText().equals(""))
                    doSwap(b17,b12);
                else if(b16.getText().equals(""))
                    doSwap(b17, b16);
                else if(b18.getText().equals(""))
                    doSwap(b17, b18);
                else if(b22.getText().equals(""))
                    doSwap(b17, b22);
                else if(!b17.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but18:
                if(b13.getText().equals(""))
                    doSwap(b18, b13);
                else if(b17.getText().equals(""))
                    doSwap(b18, b17);
                else if(b19.getText().equals(""))
                    doSwap(b18, b19);
                else if(b23.getText().equals(""))
                    doSwap(b18, b23);
                else if(!b18.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but19:
                if(b14.getText().equals(""))
                    doSwap(b19,b14);
                else if(b18.getText().equals(""))
                    doSwap(b19, b18);
                else if(b20.getText().equals(""))
                    doSwap(b19, b20);
                else if(b24.getText().equals(""))
                    doSwap(b19, b24);
                else if(!b19.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but20:
                if(b15.getText().equals(""))
                    doSwap(b20, b15);
                else if(b19.getText().equals(""))
                    doSwap(b20, b19);
                else if(b25.getText().equals(""))
                    doSwap(b20, b25);
                else if(!b20.getText().equals(""))
                    vibe.vibrate(100);
                break;

            case R.id.sgl3but21:
                if(b16.getText().equals(""))
                    doSwap(b21, b16);
                else if(b22.getText().equals(""))
                    doSwap(b21, b22);
                else if(!b21.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but22:
                if(b17.getText().equals(""))
                    doSwap(b22,b17);
                else if(b21.getText().equals(""))
                    doSwap(b22, b21);
                else if(b23.getText().equals(""))
                    doSwap(b22, b23);
                else if(!b22.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but23:
                if(b18.getText().equals(""))
                    doSwap(b23, b18);
                else if(b22.getText().equals(""))
                    doSwap(b23, b22);
                else if(b24.getText().equals(""))
                    doSwap(b23, b24);
                else if(!b23.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but24:
                if(b19.getText().equals(""))
                    doSwap(b24, b19);
                else if(b23.getText().equals(""))
                    doSwap(b24, b23);
                else if(b25.getText().equals(""))
                    doSwap(b24, b25);
                else if(!b24.getText().equals(""))
                    vibe.vibrate(100);
                break;
            case R.id.sgl3but25:
                if(b20.getText().equals(""))
                    doSwap(b25, b20);
                else if(b24.getText().equals(""))
                    doSwap(b25, b24);
                else if(!b25.getText().equals(""))
                    vibe.vibrate(100);
                break;
        }

        if (b1.getText().equals("1") && b2.getText().equals("2") &&
                b3.getText().equals("3") && b4.getText().equals("4") &&
                b5.getText().equals("5") && b6.getText().equals("6") &&
                b7.getText().equals("7") && b8.getText().equals("8") &&
                b9.getText().equals("9") && b10.getText().equals("10") &&
                b11.getText().equals("11") && b12.getText().equals("12") &&
                b13.getText().equals("13") && b14.getText().equals("14") &&
                b15.getText().equals("15") && b16.getText().equals("16") &&
                b17.getText().equals("17") && b18.getText().equals("18") &&
                b19.getText().equals("19") && b20.getText().equals("20") &&
                b21.getText().equals("21") && b22.getText().equals("22") &&
                b23.getText().equals("23") && b24.getText().equals("24")){
               congol3.setVisibility(View.VISIBLE);
               restartl3.setVisibility(View.VISIBLE); }

        }

    public void doSwap(Button From,Button To){
        To.setText(From.getText());
        From.setText("");
    }
}
