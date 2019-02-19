package com.example.wageshwari.gamersarena;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.Image;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ColGameLv extends AppCompatActivity {
    TextView lev1, lev2, lev3;
    ImageView lvbackground, l1unlock, l2lock, l3lock;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_col_game_lv);
        lev1 = (TextView) findViewById(R.id.lv1);
        lev2 = (TextView) findViewById(R.id.lv2);
        lev3 = (TextView) findViewById(R.id.lv3);
        lvbackground = (ImageView) findViewById(R.id.colgamebackground);
        l1unlock = (ImageView) findViewById(R.id.lv1unlock);
        l2lock = (ImageView) findViewById(R.id.lv2lock);
        l3lock = (ImageView) findViewById(R.id.lv3lock);
        preferences = PreferenceManager.getDefaultSharedPreferences(ColGameLv.this);
    }

    public void level1(View v) {
          startActivity(new Intent(ColGameLv.this,ColorGameL1.class));
    }

    public void level2(View v) {
          startActivity(new Intent(ColGameLv.this,ColorGameL2.class));
    }

    public void level3(View v) {
          startActivity(new Intent(ColGameLv.this,ColorGameL3.class));
    }
    @Override
    public void onResume() {
        super.onResume();
        int scorel1 = preferences.getInt("scrL1",0);
        int scrl2=preferences.getInt("scorel2",0);
        if (scorel1>=10) {
            l2lock.setImageResource(R.drawable.umlock);
            lev2.setEnabled(true);
        }
       if(scrl2>=20){
            l3lock.setImageResource(R.drawable.umlock);
            lev3.setEnabled(true);
        }
    }

}

