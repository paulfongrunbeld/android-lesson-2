package com.mirea.ZanfirovichPP.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText =  findViewById(R.id.editText5);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "STUDENT #8 GROUP BSBO-09-21 Count of symbols - "
                                + editText.getText().toString().length(),
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

//    public void showMessage(View view) {
//        EditText editText =  findViewById(R.id.editText5);
//        Toast toast = Toast.makeText(getApplicationContext(),
//                "STUDENT #8 GROUP BSBO-09-21 Count of symbols - "
//                        + editText.getText().toString().length(),
//                Toast.LENGTH_LONG);
//        toast.show();
//    }
}