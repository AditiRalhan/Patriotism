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
import android.widget.RelativeLayout;
import android.widget.Toast;

public class VideoSongsFragment extends Fragment  {
    static  String dt;
ListView l;
    String stations[]={"Maa Tujhe Salam","Kandho se Milte Hai Kandhe","Sandeshe Aate Hai","Aisa Desh Hai Mera","Ae Mere Vatan Ke Logon","Suno Gaur Se Duniya Walo" ,"Sare Jahan Se Acha","Mera Desh hi Dharam","Vande Matram","Bharat Humko Jaan Se Pyara","Lakshya","Chak De India","Kar Chale hum Fida","Aao Bachho Tumhe Sikhaye","Rang De Basanti Chola"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gallantryFragment=inflater.inflate(R.layout.videos_youtube_fragment,container,false);


        l=gallantryFragment.findViewById(R.id.list);
        ArrayAdapter<String > arr=new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,stations);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                dt=(String)adapterView.getItemAtPosition(position);
                Toast.makeText(getContext(), ""+dt, Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getContext(),VideosActivity.class);
                i.putExtra("b",dt);
                 startActivity(i);



            }
        });
        return gallantryFragment;
    }





}
