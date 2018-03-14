package com.example.shivam.moksha.eventsactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shivam.moksha.R;
import com.squareup.picasso.Picasso;

public class gaming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming);

        ImageView one=findViewById(R.id.Querencia);
        Picasso.get().load("https://scontent.fdel1-3.fna.fbcdn.net/v/t1.0-9/29133537_1472438626200000_4904589920292569088_n.jpg?oh=fb44ab83a2e567813af55f0fe630dd4a&oe=5B46175E").into(one);
        Button regone=findViewById(R.id.Querenciareg);
        regone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruleone=findViewById(R.id.Querenciarule);
        ruleone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//*********************************
//image not found
//**********************************

        ImageView two=findViewById(R.id.AIMBOT18);
        Picasso.get().load("").into(two);
        Button regtwo=findViewById(R.id.AIMBOT18reg);
        regtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button ruletwo=findViewById(R.id.AIMBOT18rule);
        ruletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





    }
}
