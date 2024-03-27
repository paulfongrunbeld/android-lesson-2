package com.mirea.ZanfirovichPP.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

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
    }

    public void onClickShowDialog(View view){
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");

        Snackbar.make(view, "You click on ShowDialog button!", Snackbar.LENGTH_LONG)
                .show();
    }

    public void onClickShowTime(View view){
        MyTimeDialogFragment timeDialog = new MyTimeDialogFragment();
        timeDialog.show(getSupportFragmentManager(), "timeMireaPicker");
    }

    public void onClickShowDate(View view){
        MyDateDialogFragment dateDialog = new MyDateDialogFragment();
        dateDialog.show(getSupportFragmentManager(), "dateMireaPicker");
    }

    public void onClickShowProgress(View view){
        MyProgressDialogFragment progressDialog = new MyProgressDialogFragment();
        progressDialog.show(getSupportFragmentManager(), "progressMireaPicker");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "You chose the button \"Continue going\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "You chose the button \"No\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "You chose the button \"On pause\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onDateClicked(int day, int month, int year){
        Toast.makeText(getApplicationContext(),
                "You chose a date! " + day + "." + month + "." + year,
                Toast.LENGTH_LONG).show();
    }

    public void onTimeClicked(int hours, int minutes) {
        Toast.makeText(getApplicationContext(),
                "You chose a time! " + hours + ":" + minutes,
                Toast.LENGTH_LONG).show();
    }
}