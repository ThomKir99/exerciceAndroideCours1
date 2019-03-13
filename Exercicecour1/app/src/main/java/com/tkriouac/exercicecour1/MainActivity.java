package com.tkriouac.exercicecour1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextFirstNumber;
    EditText editTextSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editTextFirstNumber = findViewById(R.id.editText_number1);
         editTextSecondNumber = findViewById(R.id.editText_number2);
    }



    public void compared(View button){
        try {
            refreshColor();
            int firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());

            if(firstNumber>secondNumber){
                Toast.makeText(this,"Le premier est le plus gros",Toast.LENGTH_SHORT).show();
                editTextFirstNumber.setBackgroundColor(Color.GREEN);
                editTextSecondNumber.setBackgroundColor(Color.RED);
            }else if(firstNumber<secondNumber){
                Toast.makeText(this,"Le deuxième est le plus gros",Toast.LENGTH_SHORT).show();
                editTextFirstNumber.setBackgroundColor(Color.RED);
                editTextSecondNumber.setBackgroundColor(Color.GREEN);
            }else{
                Toast.makeText(this,"Les deux chiffres sont égaux",Toast.LENGTH_SHORT).show();
                editTextFirstNumber.setBackgroundColor(Color.GREEN);
                editTextSecondNumber.setBackgroundColor(Color.GREEN);
            }
        }catch (Exception e){
            Toast.makeText(this,"Entrer des chiffre",Toast.LENGTH_SHORT).show();
        }

    }

    private void refreshColor(){

        editTextFirstNumber.setBackgroundColor(Color.TRANSPARENT);
        editTextSecondNumber.setBackgroundColor(Color.TRANSPARENT);
    }
}
