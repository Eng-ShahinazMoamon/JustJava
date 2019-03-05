package com.example.eng_shahinazmoamen.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    TextView tt ,price;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void cat (View v){
        display(1);
        currency(5*2);
    }
  
    private void display(int i) {
        tt=findViewById(R.id.textView2);
        bt=findViewById(R.id.button);
        tt.setText(""+ i);
    }
 private void  currency (int num){
        price =findViewById(R.id.price_text_View);
     price.setText(NumberFormat.getCurrencyInstance().format(num));


 }

}
