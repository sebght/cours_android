package com.example.antoinerousselot.cours1java;
import android.app.Activity;
import android.content.ContentResolver; import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract; import android.util.Log;
public class ContentAdapter extends Activity {
    private static final String TAG = "ContentAdapter";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        Log.i(TAG, "Lancement activity");
        /*** Liste les colonnes dans contact ***/
        Uri uri = ContactsContract.Contacts.CONTENT_URI; String[] projection = null;
        String selection = null;
        String[] selectionArgs = null;
        String sortOrder = null;
        ContentResolver cr = getContentResolver();
        Cursor cur = cr.query(uri, projection, selection, selectionArgs,
                sortOrder);
        if (cur.getCount() > 0) {
            while (cur.moveToNext()) {
                String id = cur.getString(cur
                        .getColumnIndex(ContactsContract.Contacts._ID));
                String displayName = cur
                        .getString(cur.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                Log.i(TAG, id + " : " + displayName);
            }
        } else {
            Log.i(TAG,"Cursor empty");
        }
        setContentView(R.layout.activity_content_adapter);
    }
}