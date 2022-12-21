package com.example.study2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //add Button func
    public void addClick(View v){
        //number1,2라고 이름을 붙인 ID의 텍스트를 받아서 number1,2 객체에 저장
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);

        // view로써 id를 받아와 result의 값으로 저장
        TextView result = (TextView)findViewById(R.id.result);

        // 받아온 값을 정수형으로 변환하여 저장
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        //result 변수에 n1+n2 출력
        result.setText(Integer.toString(n1+n2));
    }

    //substract Button
    public void subClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);

        TextView result =(TextView) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1-n2));
    }

    //multiply Button
    public void mulClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(n1*n2));
    }

    //Divide Button
    public void divideClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result = (TextView) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(n1/n2));
    }


















}

