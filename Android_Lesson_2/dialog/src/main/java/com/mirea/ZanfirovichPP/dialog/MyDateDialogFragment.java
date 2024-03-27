package com.mirea.ZanfirovichPP.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {
    Calendar date = Calendar.getInstance();
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog.OnDateSetListener dateListener = (view, year, month, dayOfMonth) ->{
        };
        DatePickerDialog dateDialog = new DatePickerDialog(getActivity(), dateListener,
                date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
        dateDialog.setTitle("Choose date:");
        dateDialog.setButton(Dialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity)getActivity()).onDateClicked(
                                dateDialog.getDatePicker().getDayOfMonth(),
                                dateDialog.getDatePicker().getMonth() + 1,
                                dateDialog.getDatePicker().getYear());
                        dialog.cancel();
                    }
                }
        );
        dateDialog.show();
        return dateDialog;
    }
}
