package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView textFinal = (TextView) findViewById(R.id.textFinal);
        Intent intent = getIntent();
        textFinal.setText("Ваш результат "+intent.getIntExtra("userBasket",0)+" из 10");

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(intent.getIntExtra("userQuestion1",0));

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(intent.getIntExtra("userQuestion2",0));

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(intent.getIntExtra("userQuestion3",0));

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(intent.getIntExtra("userQuestion4",0));

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(intent.getIntExtra("userQuestion5",0));

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(intent.getIntExtra("userQuestion6",0));

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText(intent.getIntExtra("userQuestion7",0));

        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText(intent.getIntExtra("userQuestion8",0));

        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(intent.getIntExtra("userQuestion9",0));

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText(intent.getIntExtra("userQuestion10",0));

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText(""+intent.getBooleanExtra("userResult1",false));

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setText(""+intent.getBooleanExtra("userResult2",false));

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setText(""+intent.getBooleanExtra("userResult3",false));

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setText(""+intent.getBooleanExtra("userResult4",false));

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setText(""+intent.getBooleanExtra("userResult5",false));

        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setText(""+intent.getBooleanExtra("userResult6",false));

        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText(""+intent.getBooleanExtra("userResult7",false));

        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setText(""+intent.getBooleanExtra("userResult8",false));

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setText(""+intent.getBooleanExtra("userResult9",false));

        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setText(""+intent.getBooleanExtra("userResult10",false));

        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setText(intent.getIntExtra("userClick1",0));

        TextView textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setText(intent.getIntExtra("userClick2",0));

        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setText(intent.getIntExtra("userClick3",0));

        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setText(intent.getIntExtra("userClick4",0));

        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setText(intent.getIntExtra("userClick5",0));

        TextView textView26 = (TextView) findViewById(R.id.textView26);
        textView26.setText(intent.getIntExtra("userClick6",0));

        TextView textView27 = (TextView) findViewById(R.id.textView27);
        textView27.setText(intent.getIntExtra("userClick7",0));

        TextView textView28 = (TextView) findViewById(R.id.textView28);
        textView28.setText(intent.getIntExtra("userClick8",0));

        TextView textView29 = (TextView) findViewById(R.id.textView29);
        textView29.setText(intent.getIntExtra("userClick9",0));

        TextView textView30 = (TextView) findViewById(R.id.textView30);
        textView30.setText(intent.getIntExtra("userClick10",0));

        TextView textHead1 = (TextView) findViewById(R.id.textHead1);
        textHead1.setText("Вопрос");

        TextView textHead2 = (TextView) findViewById(R.id.textHead2);
        textHead2.setText("Ответ");

        TextView textHead3 = (TextView) findViewById(R.id.textHead3);
        textHead3.setText("Правильность");

    }
}
