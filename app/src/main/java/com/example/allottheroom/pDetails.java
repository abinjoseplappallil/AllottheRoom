package com.example.allottheroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pDetails extends AppCompatActivity {
    Button Bproscan,bpronext;
    EditText pnm,porg,pdt,pfac;
    String pname,porganis,pdate,pfaculty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_details);
        pnm=(EditText)findViewById(R.id.pnm);
        pfac=(EditText)findViewById(R.id.fac);
        porg=(EditText)findViewById(R.id.org);
        pdt=(EditText)findViewById(R.id.dept);
        Bproscan=(Button) findViewById(R.id.proscan);
        bpronext=(Button)findViewById(R.id.pronxt);
        bpronext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               pname=pnm.getText().toString();
                porganis=porg.getText().toString();
                pdate=pdt.getText().toString();
                pfaculty=pfac.getText().toString();
                Intent pnx=new Intent(getBaseContext(),romDetails.class);
                pnx.putExtra("pname",pname);
                pnx.putExtra("org",porganis);
                pnx.putExtra("pdate",pdate);
                pnx.putExtra("pfac",pfaculty);
                startActivity(pnx);
            }
        });
        Bproscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent r=new Intent(getApplicationContext(),scanpdet.class);
                startActivity(r);
            }
        });
    }
    private class PrgmDetails {
        String pname;
        String org;
        String startdate;
        String facultyInCharge;
        public String getPnameame() {
            return pname;
        }

        public String getOrg() {
            return org;
        }

        public String getStartdate() {
            return startdate;
        }

        public String getFacultyInCharge() {
            return facultyInCharge;
        }





    }
}
