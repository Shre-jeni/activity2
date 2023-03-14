package com.jeni.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    EditText input1;
//    EditText input2;
//    TextView output;
//    Button btn1 , btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {

        EditText input1 = (EditText) findViewById(R.id.et_input);
        EditText input2 = (EditText) findViewById(R.id.et_number2);
        TextView output = (TextView) findViewById(R.id.tv_output);

        if (input1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        } else if (input2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        }
        else {
            int n1 = Integer.parseInt(input1.getText().toString());
            int n2 = Integer.parseInt(input2.getText().toString());

            int result = n1 + n2;

            output.setText("Total value " + result);
        }

    }

    public void Subtract(View v) {

        EditText input1 = (EditText) findViewById(R.id.et_input);
        EditText input2 = (EditText) findViewById(R.id.et_number2);
        TextView output = (TextView) findViewById(R.id.tv_output);
        if (input1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        } else if (input2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        }
        else {

            int n1 = Integer.parseInt(input1.getText().toString());
            int n2 = Integer.parseInt(input2.getText().toString());

            int result = n1 - n2;

            output.setText("Total value " + result);
        }

    }

    public void Multiply(View v) {

        EditText input1 = (EditText) findViewById(R.id.et_input);
        EditText input2 = (EditText) findViewById(R.id.et_number2);
        TextView output = (TextView) findViewById(R.id.tv_output);

        if (input1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        } else if (input2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        }
        else {
            int n1 = Integer.parseInt(input1.getText().toString());
            int n2 = Integer.parseInt(input2.getText().toString());

            int result = n1 * n2;

            output.setText("Total value " + result);
        }

    }

    public void Divide(View v) {

        EditText input1 = (EditText) findViewById(R.id.et_input);
        EditText input2 = (EditText) findViewById(R.id.et_number2);
        TextView output = (TextView) findViewById(R.id.tv_output);

        if (input1.getText().toString().equals("")){
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        } else if (input2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Please enter value 1", Toast.LENGTH_SHORT).show();
        } else {

            try {
                int n1 = Integer.parseInt(input1.getText().toString());
                int n2 = Integer.parseInt(input2.getText().toString());
                int result = n1 / n2;
                output.setText("Total value " + result);
            }
            catch (Exception e)
            {
                Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
            }



        }

    }


}

