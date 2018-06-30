package com.example.aditi.patriotism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NewSongs extends AppCompatActivity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_songs);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Ab Tumhare Hawalae", "Alka Yagnik,Sonu Nigam", R.raw.abtumharehawalaewatansathiyo));
        arrayList.add(new Music("Aesa Desh Hae Mera", "Lata Mangeshkar", R.raw.aesadeshaemera));
        arrayList.add(new Music("Chale Chalo", "A. R. Rahman", R.raw.chalechalo));
        arrayList.add(new Music("Kuch Kariyae", "Sukhvinder Singh", R.raw.kuchkariyae));
        arrayList.add(new Music("Suno Gaur Sae", "Shankar Mahadevan", R.raw.sunogaursae));
        arrayList.add(new Music("Yeh Jo desh Hae Tera", "Madhukar Dhumal", R.raw.yejodeshaetera));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_file, arrayList);
        songList.setAdapter(adapter);
    }
}
