package bignerdranchcom.android.criminalintent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by Stan on 7/5/16.
 */
public class DatePickerFragment extends android.support.v4.app.DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.date_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
