package com.example.wageshwari.gamersarena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SlideGameLv extends AppCompatActivity {
    TextView puzzle,easy,medium,hard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_lv);
        puzzle=(TextView)findViewById(R.id.puzzletv);
        easy=(TextView)findViewById(R.id.easytv);
        medium=(TextView)findViewById(R.id.mediumtv);
        hard=(TextView)findViewById(R.id.hardtv);
    }
    public void easylv(View v){
        startActivity(new Intent(SlideGameLv.this,SlideGameL1.class));
    }

    public void mediumlv(View v){
        startActivity(new Intent(SlideGameLv.this,SlideGameL2.class));
    }

    public void hardlv(View v){
        startActivity(new Intent(SlideGameLv.this,SlideGameL3.class));
    }
}
