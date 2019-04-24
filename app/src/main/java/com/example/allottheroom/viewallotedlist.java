package com.example.allottheroom;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class viewallotedlist extends AppCompatActivity {
    ListView ls;
    String str[];
    SQLiteDatabase dbp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewallotedlist);
        ls = (ListView) findViewById(R.id.lsview);

        dbp = openOrCreateDatabase("new_table", MODE_PRIVATE, null);
        Cursor cr = dbp.rawQuery("SELECT roomkey FROM allocateRoom ", null);
        int i = 0;
        if (cr.getCount() != 0) {
            while (cr.moveToNext()) {
                str[i] = cr.getString(0);

                i = i + 1;

            }
        }

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str);
        ls.setAdapter(ad);

    }
}