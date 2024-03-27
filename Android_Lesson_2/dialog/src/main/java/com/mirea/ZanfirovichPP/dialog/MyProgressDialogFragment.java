package com.mirea.ZanfirovichPP.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState)
    {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMax(100);
        progressDialog.setMessage("Loading...");
        progressDialog.setTitle("Example ProgressDialog working");
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "Oк",
                new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        progressDialog.show();
        return progressDialog;
    }
}
