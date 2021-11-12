package com.example.toogleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button toggleButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        imageView = findViewById(R.id.imageView);

        toggleButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(imageView.getVisibility() == View.INVISIBLE) {
                            toggleButton.setText("HIDE");
                            imageView.setVisibility(View.VISIBLE);
                        }
                        else {
                            toggleButton.setText("SHOW");
                            imageView.setVisibility(View.INVISIBLE);
                        }
                    }
                }
        );
    }
}