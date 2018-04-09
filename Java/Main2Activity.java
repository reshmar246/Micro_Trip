package com.example.admin.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    int Position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Intent intent=getIntent();
        Position=intent.getExtras().getInt("Position");
        final CustomAdapter adapter=new CustomAdapter(this);
        final ImageView imageView=(ImageView)findViewById(R.id.imageView1);
        final TextView Name=(TextView)findViewById(R.id.Name);
        final TextView Description=(TextView)findViewById(R.id.Description);
        imageView.setImageResource(adapter.image[Position]);

        Name.setText(adapter.Name[Position]);
        Description.setText(adapter.Places[Position]);


            }


    }

