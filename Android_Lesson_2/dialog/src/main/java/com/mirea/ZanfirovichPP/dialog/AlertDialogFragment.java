package com.mirea.ZanfirovichPP.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class AlertDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Hello MIREA!")
                .setMessage("Success is near?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Continue going", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Close the window
                        ((MainActivity)getActivity()).onOkClicked();
                        dialog.cancel();
                    }
                })
                .setNeutralButton("On pause", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ((MainActivity)getActivity()).onNeutralClicked();
                            dialog.cancel();
                        }
                    })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ((MainActivity)getActivity()).onCancelClicked();
                            dialog.cancel();
                        }
                    });
        return builder.create();
    }

}
