package com.example.wisata_malang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDescs = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://asset.kompas.com/crops/8cSkHWrzRNdjGca-1kewn2rKfS8=/0x0:1000x667/750x500/data/photo/2020/01/22/5e281e5ad3845.jpg");
        mNames.add("Kampung Warna-warni Jodipan");
        mImageDescs.add("Ini blablabla");

        mImageUrls.add("https://asset.kompas.com/crops/BYPIXxKrHpk84zR99Y6YQoKHHcM=/0x0:1000x667/750x500/data/photo/2020/01/22/5e281e5ab729c.jpg");
        mNames.add("Kampung 3D");
        mImageDescs.add("Ini sadasdasd");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mImageDescs);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
