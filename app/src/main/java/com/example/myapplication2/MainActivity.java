package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonPlusClick(View v){
        EditText arg1= (EditText)findViewById(R.id.Num1);
        EditText arg2= (EditText)findViewById(R.id.Num2);
        double num1=Double.parseDouble(arg1.getText().toString());
        double num2=Double.parseDouble(arg2.getText().toString());
//        int num2 =Integer.parseInt(((EditText)findViewById(R.id.Num2)).getText().toString());
        TextView resText=(TextView)findViewById(R.id.Result);
        double resSum = num1+num2;
        resText.setText(Double.toString(resSum));
    }
    public void onButtonMinusClick(View v){
        EditText arg1= (EditText)findViewById(R.id.Num1);
        EditText arg2= (EditText)findViewById(R.id.Num2);
        double num1=Double.parseDouble(arg1.getText().toString());
        double num2=Double.parseDouble(arg2.getText().toString());
        TextView resText=(TextView)findViewById(R.id.Result);
        double resMin = num1-num2;
        resText.setText(Double.toString(resMin));
    }
    public void onButtonMultiplyClick(View v){
        EditText arg1= (EditText)findViewById(R.id.Num1);
        EditText arg2= (EditText)findViewById(R.id.Num2);
        double num1=Double.parseDouble(arg1.getText().toString());
        double num2=Double.parseDouble(arg2.getText().toString());
        TextView resText=(TextView)findViewById(R.id.Result);
        double resMult = num1*num2;
        resText.setText(Double.toString(resMult));
    }
    public void onButtonDivisionClick(View v){
        EditText arg1= (EditText)findViewById(R.id.Num1);
        EditText arg2= (EditText)findViewById(R.id.Num2);
        double num1=Double.parseDouble(arg1.getText().toString());
        double num2=Double.parseDouble(arg2.getText().toString());
        TextView resText=(TextView)findViewById(R.id.Result);
        if(num2==0){
            resText.setTextSize(18);
            resText.setText("На ноль делить нельзя");
            //   Toast.makeText(this,"Cannot be divided by 0 !!!",Toast.LENGTH_LONG) ;
        }
       else {
            double resDiv = num1/num2;
            resText.setText(Double.toString(resDiv));
        }
    }
    public void onButtonDeleteClick(View v){
        TextView num1 = (EditText)findViewById(R.id.Num1);
        num1.setText("");
        TextView num2 = (EditText)findViewById(R.id.Num2);
        num2.setText("");
        TextView resText=(TextView)findViewById(R.id.Result);
        resText.setText("Результат");
    }
}