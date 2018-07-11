package com.example.admin.patriots;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IndianDefence extends Fragment {

    static  String dt;
    ListView l;
    String stations[]={"Indian Defence Laboratories","How Dangerous is India?","How Powerful is India?","10 Most Powerful Militaries In The World","Nat Geo Documentary on BSF- India's First Line of Defence","Indian Missile System","Why India Is Buying S-400 Missile Defence System?"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gallantryFragment = inflater.inflate(R.layout.videos_youtube_fragment, container, false);


        l = gallantryFragment.findViewById(R.id.list);
        ArrayAdapter<String> arr = new ArrayAdapter<String>(getContext(), R.layout.support_simple_spinner_dropdown_item, stations);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                dt = (String) adapterView.getItemAtPosition(position);
                Toast.makeText(getContext(), "" + dt, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getContext(),defencevideos.class);
                i.putExtra("cdes", dt);
                startActivity(i);


            }
        });
        return gallantryFragment;
    }
}
