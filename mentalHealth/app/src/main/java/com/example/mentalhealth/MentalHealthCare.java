package com.example.mentalhealth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.view.Menu;
import android.view.MenuInflater;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MentalHealthCare extends AppCompatActivity {
   /** Menu menu;
    //Spinner pages;
    //ListView ls;
    //String[] pagesArray = {"Listen", "Add Photo", "Notes"};
Button play, pause, stop;
Button Continue;
CheckBox happy, good, blessed, anxious, down, confused;
MediaPlayer mp;
int flag=1; */
   Button seemore, home;
   EditText name;

    //@SuppressLint("MissingInflatedId")
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mental_health_care);

        home = findViewById(R.id.home);
        name = findViewById(R.id.etName);
        seemore= findViewById(R.id.seemore);

        seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MentalHealthCare.this, about_page.class);
                i.putExtra("NAME", name.getText().toString());
                name.setText("");
                startActivity(i);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MentalHealthCare.this, MainActivity.class);
                //intent.putExtra("NAME", name.getText().toString());
                //name.setText("");
                startActivity(intent);
            }
        });

        /**happy = findViewById(R.id.happy);
        blessed = findViewById(R.id.blessed);
        good = findViewById(R.id.good);
        down = findViewById(R.id.down);
        confused = findViewById(R.id.Confused);
        anxious = findViewById(R.id.anxious);

        Continue = findViewById(R.id.btncontinue);
        play = findViewById(R.id.PLay);
        pause = findViewById(R.id.Pause); */

    // func build menu options
        //callback mwjode
            //eza rj3 true yaane el objects menu built successfully

            //false failed
            ////bdna naaml inflate


        /////////////////////////////////////

       /** stop = findViewById(R.id.Stop);
        mp = MediaPlayer.create(this,R.raw.piano);
        mp.start();

        Continue.setOnClickListener(v -> {
            String mood = "";
            String happyMood = "";
            if(happy.isChecked())
                happyMood+="he";
            if(blessed.isChecked())
                mood+=" good mood";
            if(good.isChecked())
                mood+=" good mood";
            if(down.isChecked())
                mood+=" bad mood";
            if(confused.isChecked())
                mood+=" kinda bad mood";
            if(anxious.isChecked())
                mood+=" bad mood";
            Toast.makeText(MentalHealthCare.this, "You're in a "+ mood, Toast.LENGTH_SHORT).show();

        });

        play.setOnClickListener(v -> {
            if(flag==0)
                mp=MediaPlayer.create(MentalHealthCare.this,R.raw.piano);

            mp.start();
            //aamlen enu lsound start so mane b haje llplay
            play.setEnabled(false);
            //lyser ader yaaml stop w pause
            stop.setEnabled(true);
            pause.setEnabled(true);
            //yaane fe music file am yaaml play
            //flag byaaml check 3le ly2dr yrj3 yblesh
            flag=1;
        });

        stop.setOnClickListener(v -> {
            mp.stop();
            stop.setEnabled(false);
            pause.setEnabled(false);
            //ma hye stop chu bdna bl stop wpause, khale y2dr yaaml play
            play.setEnabled(true);
            //media player fade ma b2lbo che
            flag=0;
        });

        pause.setOnClickListener(v -> {
                mp.pause();
                stop.setEnabled(false);
                pause.setEnabled(false);
                play.setEnabled(true);
                flag=0;
        });
     */
///////////////////////////////////////////////////////////////////

        /**pages = findViewById(R.id.spPages);
        ls = findViewById(R.id.pages_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.pages, pagesArray);
        ls.setAdapter(adapter);
        String pagesStart = pages.getSelectedItem().toString();
        if(pagesStart.equals("Sound")){
                    Intent k = new Intent(MentalHealthCare.this, Sounds.class);
                    startActivity(k);
               } */

    }

/**
 android:layout_width="350dp"
 android:layout_height="101dp"
 android:layout_marginLeft="4dp"
 android:layout_marginTop="200dp"
 android:layout_marginRight="4dp"
 */
}