package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,clear,plus,four,five,six,subtract,seven,eight,nine,multiply,ziro,dot,persent,division,equalto;
    TextView text1,output;
    String ankit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        text1=findViewById(R.id.text1);
        output=findViewById(R.id.output);
        clear=findViewById(R.id.clear);
        plus=findViewById(R.id.plus);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        subtract=findViewById(R.id.subtract);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        multiply=findViewById(R.id.multiply);
        ziro=findViewById(R.id.ziro);
        dot=findViewById(R.id.dot);
        persent=findViewById(R.id.persent);
        division=findViewById(R.id.division);
        equalto=findViewById(R.id.equalto);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text1.setText("");
                output.setText("");
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"9");
            }
        });

        ziro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+".");
            }
        });

        persent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"%");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"+");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"-");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"/");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();
                text1.setText(ankit+"*");
            }
        });

        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ankit=text1.getText().toString();

                ankit=ankit.replaceAll("×","*");
                ankit=ankit.replaceAll("%","/100");
                ankit=ankit.replaceAll("÷","/");

                Context  rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String Finalresult="";

                Scriptable scriptable=rhino.initStandardObjects();
                Finalresult=rhino.evaluateString(scriptable,ankit,"javascript",1,null).toString();


                output.setText(Finalresult);

            }

        });

    }
}