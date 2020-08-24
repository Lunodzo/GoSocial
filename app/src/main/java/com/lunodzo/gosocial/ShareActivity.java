package com.lunodzo.gosocial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        final EditText myText = findViewById(R.id.inputText);
        final Button myShareButton = findViewById(R.id.btn_share);
        myShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = myText.getText().toString();
                if(message.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter a message", Toast.LENGTH_LONG).show();
                }else {
                    Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, message);
                    startActivity(Intent.createChooser(sendIntent, "GoSocial share options"));
//                    Intent sendIntent = new Intent();
//                    sendIntent.setAction(Intent.ACTION_SEND);
//                    sendIntent.putExtra(Intent.EXTRA_TEXT, message);
//                    sendIntent.setType("text/plain");
//                    startActivity(sendIntent);
                }
            }
        });
    }
}
