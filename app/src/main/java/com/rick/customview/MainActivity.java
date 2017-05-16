package com.rick.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rick.customview.view.checkview.CheckView;

public class MainActivity extends AppCompatActivity {
    private CheckView mCheckView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCheckView = (CheckView) findViewById(R.id.check_view);
    }

    public void check(View v) {
        mCheckView.check();
    }
    public void uncheck(View v){
        mCheckView.unCheck();
    }
}
