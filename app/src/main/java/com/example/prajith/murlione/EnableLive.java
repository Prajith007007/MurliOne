package com.example.prajith.murlione;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class EnableLive extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enable_live);
        final Button button = findViewById(R.id.button);
        final Button button3 = findViewById(R.id.button3);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCFoXdXGQG1KWiNNIVKkXL1Q")));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCFoXdXGQG1KWiNNIVKkXL1Q")));
            }
        });
        final Intent intent = new Intent(this,DailyMurli.class);
        final Intent intent1 = new Intent(this,Listoflink.class);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


               startActivity(intent);
                // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCFoXdXGQG1KWiNNIVKkXL1Q")));
                Log.i("Video", "Video Playing...."); // Code here executes on main thread after user presses button
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent1);
                Log.i("Prajith", "Event Triggered" +
                        "..");

            }
        });

    }
}
