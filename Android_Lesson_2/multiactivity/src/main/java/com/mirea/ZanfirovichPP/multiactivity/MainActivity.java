package com.mirea.ZanfirovichPP.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

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
    }

    public void onClickNewActivity(View view){
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//        intent.putExtra("key", "MIREA - ZANFIROVICH PAVEL PETAROVICH");
        EditText editText = findViewById(R.id.editText2);
        intent.putExtra("key", editText.getText().toString());
        Log.d(TAG, editText.getText().toString());
        startActivity(intent);
    }
}