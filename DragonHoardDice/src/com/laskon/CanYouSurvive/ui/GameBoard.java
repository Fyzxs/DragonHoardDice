package com.laskon.CanYouSurvive.ui;

import com.laskon.CanYouSurvive.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Nija on 7/26/2014.
 */
public class GameBoard extends Activity {//Probably don't want activity

    @Override
    public void onCreate(final Bundle savedInstanceState){
        //No super??? - Should I be a fragment?
        setContentView(R.layout.game_board_main);



    }

    private void initRaidAgainButton(){
        Button raidAgain = (Button) findViewById(R.id.btnRaid);

        raidAgain.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                ImageView ivDieOne = (ImageView) v.findViewById(R.id.ivDieOne);
                ivDieOne.setImageResource(R.drawable.icon);
            }
        });
    }
}
