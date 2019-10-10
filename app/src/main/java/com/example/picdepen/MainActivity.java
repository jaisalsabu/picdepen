package com.example.picdepen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView);
        Picasso.get().load("https://img.theculturetrip.com/x/smart/wp-content/uploads/2017/05/featured-image-hindi-words.jpg").into(img);
    }
}
