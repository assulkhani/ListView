package com.assulkhani.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namaImages;
    private int[] images;

    // klik kanan + generate + cunstructor

    public ListAdapter(Context context1, String[] namaImages, int[] images) {
        super(context1, R.layout.item_images, namaImages);
        this.context = context1;
        this.namaImages = namaImages;
        this.images = images;
    }
    // kemudian menampilkan getView

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        //Langkah 1 selanjutnya kita mengatur layoutnya itemnya
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_images, parent, false);

        //Langkah 2 findViewById setiap komponen yang di dalam item
        TextView tvNama = view.findViewById(R.id.txtView);
        ImageView ivImages = view.findViewById(R.id.imageView);

        //Langkah 3 kemudian set datanya
        tvNama.setText(namaImages[position]);
        ivImages.setImageResource(images[position]);
        return view;
    }
}
