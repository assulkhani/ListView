package com.assulkhani.listview;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] namaImages = {
            "Audio",
            "Camera",
            "Contact",
            "Document",
            "Gallery",
            "Location",
            "video"
    };

    int [] images = {
            R.drawable.attach_audio,
            R.drawable.attach_camera,
            R.drawable.attach_contact,
            R.drawable.attach_document,
            R.drawable.attach_gallery,
            R.drawable.attach_location,
            R.drawable.attach_video,
    };

    int [] suaraImages ={
            // ctrl + r (untuk mereplace)
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambuair,
            R.raw.manggis,
            R.raw.strawberry,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.findViewById(R.id.list_view);
     //   ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, namaImages);
        ListAdapter adapter = new ListAdapter(MainActivity.this, namaImages, images);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer.create(MainActivity.this, suaraImages[position]).start();

                Intent move = new Intent(MainActivity.this, DetailActivity.class);
                move.putExtra("DATANAMA", namaImages[position]);
                move.putExtra("DATAGAMBAR", images[position]);
                // putExtra digunakan untuk menaruhkan data dari Intent
                startActivity(move);
            }
        });
    }
}
