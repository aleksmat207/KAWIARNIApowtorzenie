package com.example.am.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.wybierzDanie)
    Button wybierz;

    @OnClick(R.id.wybierzDanie)

    public void click(View view) {

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
