package com.example.healthprediction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new CountDownTimer(3000,1000){          //Splash screen is shown using the activity_faculty.xml
            @Override
            public void onTick(long millisUntilFinished){
                ImageView logo = (ImageView) findViewById(R.id.Gikilogo);
                logo.animate().rotation(3600f).setDuration(1300);
            }


            @Override
            public void onFinish(){
                //set the new Content of your activity
                StartNextActivity();
                //intent to get to main screen
            }
        }.start();





    }
    public void StartNextActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
