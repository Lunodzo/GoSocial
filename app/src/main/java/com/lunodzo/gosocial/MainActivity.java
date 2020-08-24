package com.lunodzo.gosocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClicked(View view) {
        if (view.getId() == R.id.share) {
            Intent shareIntent = new Intent(getApplicationContext(), ShareActivity.class);
            startActivity(shareIntent);
        }
        else if (view.getId() == R.id.about){
            Intent aboutIntent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(aboutIntent);
        }
        else if (view.getId() == R.id.help){
            Intent helpIntent = new Intent(getApplicationContext(), HelpActivity.class);
            startActivity(helpIntent);
        }
    }
}