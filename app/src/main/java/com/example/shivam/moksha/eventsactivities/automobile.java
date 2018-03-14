package com.example.shivam.moksha.eventsactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;

public class automobile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automobile);

        ImageView one=findViewById(R.id.NSITMOTORSPORTS);
        Picasso.get().load("").into(one);
        Button regone=findViewById(R.id.NSITMOTORSPORTSreg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone=findViewById(R.id.NSITMOTORSPORTSrule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}
