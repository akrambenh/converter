package com.example.tpfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valeur_monnaie;
    private RadioButton euro2dinar, dinar2euro;
    private RadioGroup radio_group;
    private TextView result;
    private Button converter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valeur_monnaie = (EditText) findViewById(R.id.valuer_monnaie);
        radio_group = (RadioGroup) findViewById(R.id.radio_group);
        euro2dinar = (RadioButton) findViewById(R.id.euro2dinar);
        dinar2euro = (RadioButton) findViewById(R.id.dinar2euro);
        result = (TextView) findViewById(R.id.result);
        converter = (Button) findViewById(R.id.converter);

    }
    public void conversion(View view){
        float val = Float.valueOf(valeur_monnaie.getText().toString());
        if(euro2dinar.isChecked()){
            result.setText(String.valueOf(euro2dinar(val)));
        }else if(dinar2euro.isChecked()){
            result.setText(String.valueOf(dinar2euro(val)));
        }
    }
    private float euro2dinar(float val){
        return (float) ( val * 220);
    }
    private float dinar2euro(float val){
        return (float) (val * 1/220);
    }
}