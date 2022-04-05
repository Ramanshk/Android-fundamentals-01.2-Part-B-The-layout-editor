package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import hellotoastchallenge.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button resetBtn, countBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        resetBtn = findViewById(R.id.button_zero);
        countBtn = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
        resetBtn.setBackgroundColor(Color.MAGENTA);
        resetBtn.setClickable(true);

        switch (mCount % 2){
            case 0:
                view.setBackgroundColor(Color.RED);
                break;
            case 1:
                view.setBackgroundColor(Color.BLUE);
                break;
        }
    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        view.setBackgroundResource(R.color.gray);
        countBtn.setBackgroundResource(R.color.btn_color);
        view.setClickable(false);
    }
}