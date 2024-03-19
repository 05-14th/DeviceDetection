package com.example.devicedetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Point;
import android.view.Display;


public class MainActivity extends AppCompatActivity {

    private TextView txtOrientation;
    private TextView txtResolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOrientation = findViewById(R.id.txtOrientation);
        txtResolution = findViewById(R.id.txtResolution);
        Button myButton = findViewById(R.id.portraitbutton);
    }

    public void detectDevice(View v){

        Display display = getWindowManager().getDefaultDisplay();
        txtOrientation.setText("" + display.getRotation());

        Point xy = new Point();
        display.getSize(xy);
        txtResolution.setText("x = " + xy.x + "y = " + xy.y);
    }
}