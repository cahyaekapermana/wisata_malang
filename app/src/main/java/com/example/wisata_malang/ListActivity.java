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
    private ArrayList<String> mImageSources = new ArrayList<>();


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
        mImageDescs.add("Bagi kamu yang suka berburu foto keren di destinasi wisata kekinian pasti tidak asing dengan Kampung Warna Warni Jodipan yang ada di Malang. Kampung yang berada di Kelurahan Jodipan, Kecamatan Blimbing, Kota Malang, Jawa Timur ini merupakan salah satu kampung warna warni paling hits di Indonesia.");
        mImageSources.add("Sumber : " + "https://www.google.com/");


        mImageUrls.add("https://asset.kompas.com/crops/BYPIXxKrHpk84zR99Y6YQoKHHcM=/0x0:1000x667/750x500/data/photo/2020/01/22/5e281e5ab729c.jpg");
        mNames.add("Kampung 3D");
        mImageDescs.add("IJalan Tondano, Depok mendadak ramai dikunjungi. Pasalnya di jalanan kecil itu kini telah berhiaskan mural-mural jalanan yang bernuansa 3 dimensi. Kreativitas pemuda karang taruna RW 03, Kelurahan Sukma Jaya, Depok ini membuat jalanan kampung ini menjadi indah dan instagramable. Kini banyak orang yang kini mengunjungi jalanan 3 dimensi ini.");
        mImageSources.add("Sumber : " + "https://www.google.com/");

        mImageUrls.add("https://www.javatravel.net/wp-content/uploads/2019/07/Pulau-Sempu.jpg");
        mNames.add("Pulau Sempu");
        mImageDescs.add("Tempat wisata yang pertama adalah Pulau Sempu, yang sangat terkenal sebagai surga wisata alam di Kota Malang. Bagi para wisatawan, hukumnya wajib untuk mengunjungi pulau ini. Meski indah, tempat ini memiliki medan yang cukup sulit untuk orang awam. Jika Anda berniat mengunjunginya, sebaiknya Anda menyewa jasa travelling agar lebih terjamin dan mengetahui spot-spot yang bagus.");
        mImageSources.add("Sumber : " + "https://www.google.com/");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mImageDescs, mImageSources);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
