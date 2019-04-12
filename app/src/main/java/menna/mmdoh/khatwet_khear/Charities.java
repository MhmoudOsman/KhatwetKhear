package menna.mmdoh.khatwet_khear;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Charities extends AppCompatActivity {
    private ImageButton ahl_msr_bt,h57357_bt,h500500_bt,bahya_bt,egy_food_bank_bt,magdy_yakop_bt,
            msr_elkhear_bt,resala_bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charities);


        ahl_msr_bt = findViewById(R.id.ahl_msr);
        h57357_bt = findViewById(R.id.h57357);
        h500500_bt = findViewById(R.id.h500500);
        bahya_bt = findViewById(R.id.baheya);
        egy_food_bank_bt = findViewById(R.id.egy_food_bank);
        magdy_yakop_bt = findViewById(R.id.magdy_yakop);
        msr_elkhear_bt = findViewById(R.id.msr_elkhear);
        resala_bt = findViewById(R.id.resala);


        ahl_msr_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        h57357_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        h500500_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        bahya_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        egy_food_bank_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        magdy_yakop_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        msr_elkhear_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        resala_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        Charities.super.onBackPressed();
                        Intent a = new Intent(Intent.ACTION_MAIN);
                        a.addCategory(Intent.CATEGORY_HOME);
                        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(a);
                    }
                }).create().show();
    }
}
