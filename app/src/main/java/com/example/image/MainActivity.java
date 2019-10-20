package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
RadioButton radioButton1, radioButton2,radioButton3;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1=findViewById(R.id.rbAn);
        radioButton2=findViewById(R.id.rbA);
        radioButton3=findViewById(R.id.rb);
        imageView=findViewById(R.id.img);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbAn:
                imageView.setImageResource(R.drawable.and);
            break;

            case R.id.rbA:
                imageView.setImageResource(R.drawable.api);
                break;

                case R.id.rb:
            imageView.setImageResource(R.drawable.iot);
            break;


        }
    }
}
