package menna.mmdoh.khatwet_khear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

   private CardView cardView;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        cardView = findViewById(R.id.logo);

        cardView.setScaleX(0);
        cardView.setScaleY(0);

        cardView.animate().scaleXBy(1).scaleYBy(1).rotationBy(720).setDuration(3000);

            TimerTask task=new TimerTask() {
                @Override
                public void run() {
                    Intent i =new Intent(getApplicationContext(),SignIn.class);
                    startActivity(i);
                    finish();
                }
            };
            new Timer().schedule(task,3500);

    }
    @Override
    public void onBackPressed(){}
}
