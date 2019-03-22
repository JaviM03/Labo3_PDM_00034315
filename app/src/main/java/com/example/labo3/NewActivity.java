package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {


    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent mIntent=getIntent();
        mTextView =findViewById(R.id.tv_message);
        if (mIntent!=null ){
            mTextView.setText(mIntent.getStringExtra(appConstant.TEXT_KEY));
        }
    }
}
