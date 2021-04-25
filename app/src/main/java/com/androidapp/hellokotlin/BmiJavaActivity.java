package com.androidapp.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        EditText heightField = findViewById(R.id.heightField);
        EditText weightField = findViewById(R.id.weightField);
        TextView txtResult = findViewById(R.id.txtResult);
        Button btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sHeight = heightField.getText().toString();
                String sWeight = weightField.getText().toString();

                double height = Double.parseDouble(sHeight);
                double weight = Double.parseDouble(sWeight);

                double bmi = weight/Math.pow(height/100.0,2);
                txtResult.setText("Your BMI = " + bmi);
            }
        });
    }
}