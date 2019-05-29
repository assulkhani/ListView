package com.assulkhani.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    TextView tvnamaImages;
    ImageView ivimages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namaImages = getIntent().getStringExtra(Konstanta.DATANAMA);
        int images = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);
    
        // membuat log
        Log.d(TAG, "Nama : "+ namaImages);
        Log.d(TAG, "Gambar: "+ images);

        tvnamaImages = findViewById(R.id.detailTxtView);
        ivimages = findViewById(R.id.detailImageView);

        tvnamaImages.setText(namaImages);
        ivimages.setImageResource(images);
    }
}
