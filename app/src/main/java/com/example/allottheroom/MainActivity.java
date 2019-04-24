package com.example.allottheroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button Bscan,bnext;
EditText nm,roll,yr,dept;
String sname,rollno,year,depart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     nm=(EditText)findViewById(R.id.nm);
        roll=(EditText)findViewById(R.id.rollno);
        yr=(EditText)findViewById(R.id.year);
        dept=(EditText)findViewById(R.id.dept);
        Bscan=(Button) findViewById(R.id.psacan);
        bnext=(Button)findViewById(R.id.nxt);
        Bscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I=new Intent(getApplicationContext(),scanpdet.class);
                startActivity(I);

            }
        });
        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  sname=nm.getText().toString();
                  rollno=roll.getText().toString();
               year=yr.getText().toString();
                depart=dept.getText().toString();
                Intent nx=new Intent(getBaseContext(),pDetails.class);
                nx.putExtra("sname",sname);
                nx.putExtra("rollno",rollno);
                nx.putExtra("yr",year);
                nx.putExtra("depart",depart);
                startActivity(nx);
            }
        });
    }
    private class PersonalDetails {
        String sname;
        String Rollno;
        String year;
        String department;




        public String getName() {
            return sname;
        }

        public String getRollno() {
            return Rollno;
        }

        public String getYear() {
            return year;
        }

        public String getDepartment() {
            return department;
        }





    }
}
