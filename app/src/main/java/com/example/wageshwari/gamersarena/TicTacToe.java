package com.example.wageshwari.gamersarena;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,restart;
    int score=0;
    ImageView win1,win2;
    int arr[][]=new int[3][3];
    int player=1;
    boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        win1=(ImageView)findViewById(R.id.winiv1);
        win2=(ImageView)findViewById(R.id.winiv2);
        b1=(Button)findViewById(R.id.tttbut1);
        b2=(Button)findViewById(R.id.tttbut2);
        b3=(Button)findViewById(R.id.tttbut3);
        b4=(Button)findViewById(R.id.tttbut4);
        b5=(Button)findViewById(R.id.tttbut5);
        b6=(Button)findViewById(R.id.tttbut6);
        b7=(Button)findViewById(R.id.tttbut7);
        b8=(Button)findViewById(R.id.tttbut8);
        b9=(Button)findViewById(R.id.tttbut9);
       restart=(Button)findViewById(R.id.restartbutttt);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }

    public boolean checkRowWin(int player){
        for(int i=0;i<3;i++){
            if(arr[i][0]==player && arr[i][1]==player && arr[i][2]==player){
                score=player;
               return true;}
        }
        return false;
    }

    public boolean checkColoumWin(int player){
        for(int i=0;i<3;i++){
            if(arr[0][i]==player && arr[1][i]==player && arr[2][i]==player){
                score=player;
                return true;}
        }
        return false;
    }

    public boolean checkDiagonalWin(int player){
        if(arr[0][0]==player && arr[1][1]==player && arr[2][2]==player){
            score=player;
            return true;}
        else
        if(arr[0][2]==player && arr[1][1]==player && arr[2][0]==player){
            score=player;
            return true;}
        return false;
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.tttbut1:
                status=doMove(0,0,player,b1);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut2:
                status=doMove(0,1,player,b2);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut3:
                status=doMove(0,2,player,b3);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut4:
                status=doMove(1,0,player,b4);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut5:
                status=doMove(1,1,player,b5);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut6:
                status=doMove(1,2,player,b6);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut7:
                status=doMove(2,0,player,b7);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut8:
                status=doMove(2,1,player,b8);
                if(status)
                    player=player==1?2:1;
                break;

            case R.id.tttbut9:
                status=doMove(2,2,player,b9);
                if(status)
                    player=player==1?2:1;
                break;
        }
    }

   public void restartttt(View v){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=0;
                b1.setBackgroundResource(R.drawable.a0);
                b2.setBackgroundResource(R.drawable.a0);
                b3.setBackgroundResource(R.drawable.a0);
                b4.setBackgroundResource(R.drawable.a0);
                b5.setBackgroundResource(R.drawable.a0);
                b6.setBackgroundResource(R.drawable.a0);
                b7.setBackgroundResource(R.drawable.a0);
                b8.setBackgroundResource(R.drawable.a0);
                b9.setBackgroundResource(R.drawable.a0);
            }
        }
        score=0;
        player=1;
        restart.setVisibility(View.INVISIBLE);
        win1.setVisibility(View.INVISIBLE);
        win2.setVisibility(View.INVISIBLE);
    }

    public boolean doMove(int i,int j,int player,Button b){
        if(arr[i][j]==0){
            arr[i][j]=player;
            if(player==1)
                b.setBackgroundResource(R.drawable.ticx);
            else
                b.setBackgroundResource(R.drawable.tico);

            if(checkRowWin(player) || checkColoumWin(player) || checkDiagonalWin(player)){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(score==1){
                        win1.setVisibility(View.VISIBLE);
                        restart.setVisibility(View.VISIBLE);}
                        else
                            if(score==2){
                            win2.setVisibility(View.VISIBLE);
                            restart.setVisibility(View.VISIBLE);
                        }

                    }
                },700);

                return false;
            }
            else if(arr[0][0]!=0 && arr[0][1]!=0 && arr[0][2]!=0
                        && arr[1][0]!=0 && arr[1][1]!=0 && arr[1][2]!=0
                           &&  arr[2][0]!=0 && arr[2][1]!=0 && arr[2][2]!=0){
                 Toast.makeText(this, " GAME DRAW", Toast.LENGTH_SHORT).show();
                 restart.setVisibility(View.VISIBLE);
                 return false;
            }
            return true;
        }
        return false;
        }
}

