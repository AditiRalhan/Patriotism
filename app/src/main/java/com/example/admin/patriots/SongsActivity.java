package com.example.admin.patriots;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    DatabaseReference dr;
    FirebaseDatabase firebaseDatabase;
    ListView songList;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        songList = (ListView) findViewById(R.id.songList);

        arrayList = new ArrayList<>();
        firebaseDatabase = FirebaseDatabase.getInstance();
        dr = firebaseDatabase.getReference("SongsList");

    }

    @Override
    protected void onStart()
    {   progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Fetching Songs...");
        progressDialog. show();
        dr.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                arrayList.clear();
                for(DataSnapshot musicSnapshot : dataSnapshot.getChildren() )
                {
                    Music music=musicSnapshot.getValue(Music.class);
                    arrayList.add(music);
                }
                adapter = new CustomMusicAdapter(SongsActivity.this, R.layout.custom_music_file, arrayList);
                songList.setAdapter(adapter);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        super.onStart();
    }
}



