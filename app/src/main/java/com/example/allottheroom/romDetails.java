package com.example.allottheroom;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLClientInfoException;

public class romDetails extends AppCompatActivity {
EditText rno;
String r1;
SQLiteDatabase dbpr;
Button b1;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rom_details);
        rno=(EditText)findViewById(R.id.rno);
        r1=rno.getText().toString();
b1=(Button)findViewById(R.id.sub);
     dbpr=openOrCreateDatabase("new_table",MODE_PRIVATE,null);
     dbpr.execSQL("CREATE TABLE IF NOT EXISTS allocateRoom ( roomkey VARCHAR);");
     Toast.makeText(getApplicationContext(),"succesful",Toast.LENGTH_LONG).show();
     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             dbpr.execSQL("insert into allocateRoom values ('"+r1+"')");

         }
     });
    }
}
