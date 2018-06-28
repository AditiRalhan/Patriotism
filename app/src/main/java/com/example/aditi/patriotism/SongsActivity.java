package com.example.aditi.patriotism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Ao Bacho Tumhe Dekhaye", "Adinath Mangeshkar", R.raw.aaobachhotumhedekhaye));
        arrayList.add(new Music("Aye Merae Watan Ke Logo", "Lata Mangeshkar", R.raw.ayemerewatankelogo));
        arrayList.add(new Music("Hum Honge Kamyab", "Unknown", R.raw.hongekaamyaabhumhongekaamyaab));
        arrayList.add(new Music("Daal Par Sone Ki Chidiya", "Mohd. Rafi", R.raw.jahandaaldaalparsonekichidiya));
        arrayList.add(new Music("Mere Pyare Watan", "Manna Dey", R.raw.kabuliwalaayemerepyarewatankabuliwala));
        arrayList.add(new Music("Sare Jaha Sae Acha", "Lata Mangeshkar", R.raw.sarejahanseacha));
        arrayList.add(new Music("Taaqat Watan Ki", "Mohd. Rafi", R.raw.taqatwattanki));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_file, arrayList);
        songList.setAdapter(adapter);
    }
}
