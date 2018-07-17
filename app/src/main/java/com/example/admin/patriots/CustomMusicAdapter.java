package com.example.admin.patriots;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomMusicAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    DownloadManager dm;
    long queueid;
    String uristring;
    Uri finalString;
    int download_state[];
    private ArrayList<Music> arrayList;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;
    BroadcastReceiver receiver;
    ViewHolder viewHolder;
    int position1;

    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
        download_state = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            download_state[i] = 0;
        }
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    private class ViewHolder {
        TextView txtName, txtSinger;
        ImageView ivPlay, ivDownload;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //position1=position;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout, null);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            viewHolder.txtSinger = (TextView) convertView.findViewById(R.id.txtSinger);
            viewHolder.ivPlay = (ImageView) convertView.findViewById(R.id.ivPlay);
            viewHolder.ivDownload = (ImageView) convertView.findViewById(R.id.ivDownload);


            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //Toast.makeText(context.getApplicationContext(),"POSition:"+position,Toast.LENGTH_SHORT).show();

        final Music music = arrayList.get(position);

        viewHolder.txtName.setText(music.getSongsName());
        viewHolder.txtSinger.setText(music.getSinger());

        viewHolder.ivDownload.setTag(position);

        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
                    DownloadManager.Query req_query = new DownloadManager.Query();
                    req_query.setFilterById(queueid);

                    Cursor c = dm.query(req_query);
                    //System.out.println(c.getColumnNames());

                    if (c.moveToFirst()) {
                        int columnIndex = c.getColumnIndex(DownloadManager.COLUMN_STATUS);

                        if (DownloadManager.STATUS_SUCCESSFUL == c.getInt(columnIndex)) {
                            uristring = c.getString(c.getColumnIndex(DownloadManager.COLUMN_LOCAL_URI));

                            if (download_state[position] == 1) {
                                viewHolder.ivDownload.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_complete));
                            } else {

                                viewHolder.ivDownload.setImageResource(R.drawable.ic_download);
                            }
                            finalString = Uri.parse(uristring);
                        } else {

                            finalString = Uri.parse(music.getUri());
                            viewHolder.ivDownload.setImageResource(R.drawable.ic_download);

                        }
                    }

                }
            }
        };
        context.registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));


        // play music
        final View finalConvertView = convertView;
        viewHolder.ivPlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (flag) {
                    finalString = Uri.parse(music.getUri());
                    mediaPlayer = MediaPlayer.create(context, finalString);
                    flag = false;
                }
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag = true;
                    //context.unregisterReceiver(receiver);
                    viewHolder.ivPlay.setImageResource(R.drawable.ic_play);
                } else {
                    mediaPlayer.start();
                    viewHolder.ivPlay.setImageResource(R.drawable.ic_stop);
                }
            }
        });

        // stop
        viewHolder.ivDownload.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dm = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(music.getUri()));
                        queueid = dm.enqueue(request);
                        int pos = (Integer) v.getTag();
                        download_state[pos] = 1;

                    }
                });

        return convertView;
    }

}