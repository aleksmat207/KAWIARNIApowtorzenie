package com.example.am.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
@BindView(R.id.recyclerViewkawy)
    RecyclerView recyclerView;
//@BindView(R.id.WybierzBtn)
//Button WybierzBtn;
//@BindView(R.id.imageView)
//    ImageView image;


//
//    @OnClick(R.id.WybierzBtn)
//
//    public void click(View view) {
//if(View.VISIBLE==1) {
//    image.setVisibility(View.INVISIBLE);
//}
//else {   image.setVisibility(View.VISIBLE);}
//

   // }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        ArrayList<Coffe> coffeArrayList = new ArrayList<>();
        coffeArrayList.add(new Coffe("Latte", "12"));
        coffeArrayList.add(new Coffe("Espresso",  "10"));
        coffeArrayList.add(new Coffe("Biała", "10"));
        coffeArrayList.add(new Coffe("Americano", "10 "));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        CoffeAdapter coffeAdapter = new CoffeAdapter(coffeArrayList);
        recyclerView.setAdapter(coffeAdapter);
    }
}
