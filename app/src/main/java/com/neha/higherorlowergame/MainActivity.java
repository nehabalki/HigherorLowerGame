package com.neha.higherorlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.Random;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String msg) {
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }

    public void guess(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessText = Integer.parseInt(guessEditText.getText().toString());
        if(guessText<randomNumber) {
           makeToast("Lower!");
        }else if(guessText>randomNumber) {
            makeToast("Higher!");
        }else {
            makeToast("That's right! Try again!");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
        // maximum 20 and minimum 1
    }
}
