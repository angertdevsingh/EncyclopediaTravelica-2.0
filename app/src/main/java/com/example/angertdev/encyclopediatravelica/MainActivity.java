package com.example.angertdev.encyclopediatravelica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Creating and linking the buttons to the GUI layout textViews (deliverable 3)
        Button asiaButton = (Button)findViewById(R.id.asiaButton);
        Button europeButton = (Button)findViewById(R.id.europeButton);

        // Register the onClick listener with the implementation above
        asiaButton.setOnClickListener(new View.OnClickListener() {

            //Takes user to the Asia activity when the Asia button is clicked (deliverable 4,6)
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Asia.class));
            }
        });
        europeButton.setOnClickListener(new View.OnClickListener() {

            //Takes user to the Europe activity when the Europe button is clicked (deliverable 4,6)
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Europe.class));
            }
        });

    }



}
