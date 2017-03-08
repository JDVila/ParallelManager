package nyc.c4q.rusili.parallelmanager.utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

// Custom alert dialog allowing the user to use their own layout, title, text, and icon. Defaults to finish() onClick
// Parameters:  1) Context
// Optional:    1) Icon
//              2) View/Layout

public class CustomAlertDialog {

    public void exit (final Context contextParam) {
        new AlertDialog.Builder(contextParam)
                .setIcon(null)
                .setView(null)
                .setTitle("Exiting App")
                .setMessage("Are you sure you want to close Parallel?")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick (DialogInterface dialog, int which) {
                        ((Activity) contextParam).finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
