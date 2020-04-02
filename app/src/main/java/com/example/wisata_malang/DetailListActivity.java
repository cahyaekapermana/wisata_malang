package com.example.wisata_malang;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailListActivity extends AppCompatActivity {

    private static final String TAG = "DetailListActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_desc") && getIntent().hasExtra("image_source")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDes = getIntent().getStringExtra("image_desc");
            String imageSourceLink = getIntent().getStringExtra("image_source");

            //Set variable
            setImage(imageUrl, imageName, imageDes, imageSourceLink);
        }
    }


    private void setImage(String imageUrl, String imageName, String imageDes, String imageSourceLink){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        TextView detail = findViewById(R.id.image_description_detail);
        TextView linkimage = findViewById(R.id.image_description_sourcelink);


        name.setText(imageName);
        detail.setText(imageDes);
        linkimage.setText(imageSourceLink);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }


}
