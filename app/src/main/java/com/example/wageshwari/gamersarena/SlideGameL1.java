package com.example.wageshwari.gamersarena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SlideGameL1 extends AppCompatActivity implements View.OnClickListener {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_l1);
       ArrayList<Integer> arr=new ArrayList<Integer>();
        b1=(Button)findViewById(R.id.sgl1but1);
        b2=(Button)findViewById(R.id.sgl1but2);
        b3=(Button)findViewById(R.id.sgl1but3);
        b4=(Button)findViewById(R.id.sgl1but4);
        b5=(Button)findViewById(R.id.sgl1but5);
        b6=(Button)findViewById(R.id.sgl1but6);
        b7=(Button)findViewById(R.id.sgl1but7);
        b8=(Button)findViewById(R.id.sgl1but8);
        b9=(Button)findViewById(R.id.sgl1but9);

       b1.setOnClickListener(this);
       b2.setOnClickListener(this);
       b3.setOnClickListener(this);
       b4.setOnClickListener(this);
       b5.setOnClickListener(this);
       b6.setOnClickListener(this);
       b7.setOnClickListener(this);
       b8.setOnClickListener(this);
       b9.setOnClickListener(this);

       b1.setBackgroundResource(getId(arr.get(0)));
       b1.setText(arr.get(0)+"");

        b1.setBackgroundResource(getId(arr.get(0)));
        b1.setText(arr.get(0)+"");



        arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(7);
       arr.add(6);
       arr.add(7);
       arr.add(8);
       arr.add(9);
    }

    @Override
    public void onClick(View v) {

    }
}
