package com.example.ninasamuel_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    String message = "  Main Activity:\nonCreate executed \nonStart executed";
    BFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TFragment topFragment = (TFragment) getSupportFragmentManager().findFragmentById(R.id.top_fragment);
        bottomFragment = (BFragment) getSupportFragmentManager().findFragmentById(R.id.bottom_fragment);

        setMessage(R.string.on_create);
    }


    @Override
    protected void onStart() {
        super.onStart();

        setMessage(R.string.on_start);
    }

    private void setMessage(int messageId) {
        if (bottomFragment != null) {

            if (message.isEmpty()) {
                message += this.getResources().getString(R.string.main_activity);
            }

            message = message + "\n" + this.getResources().getString(messageId);
            bottomFragment.setMessage(message);
        }
    }
}