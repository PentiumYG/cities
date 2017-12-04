package com.example.yuktigoswami.cities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Ajmer.class);
                        startActivity(intent);
                    }
                }
        );
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Alwar.class);
                        startActivity(intent);
                    }
                }
        );
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Bharatpur.class);
                        startActivity(intent);
                    }
                }
        );
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Bikaner.class);
                        startActivity(intent);
                    }
                }
        );
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Dausa.class);
                        startActivity(intent);
                    }
                }
        );
        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Jaipur.class);
                        startActivity(intent);
                    }
                }
        );
        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Jaisalmer.class);
                        startActivity(intent);
                    }
                }
        );
        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Jodhpur.class);
                        startActivity(intent);
                    }
                }
        );
        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,kota.class);
                        startActivity(intent);
                    }
                }
        );
        b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,SawaiMadhopur.class);
                        startActivity(intent);
                    }
                }
        );
        b11=(Button)findViewById(R.id.button11);
        b11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,SriGanganagar.class);
                        startActivity(intent);
                    }
                }
        );
        b12=(Button)findViewById(R.id.button12);
        b12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Udaipur.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
