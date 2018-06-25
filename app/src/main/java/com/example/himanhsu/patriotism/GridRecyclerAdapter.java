package com.example.himanhsu.patriotism;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.gridViewHolder>{

    private  final GridRecyclerAdapter.listItemClickListener mlistener;
    private ArrayList<NationalistData> NationalistDataList;
    private Context context;

    class gridViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView FighterName;
        ImageView FighterPic;
        gridViewHolder(View itemView)
        {
            super(itemView);
            FighterName=itemView.findViewById(R.id.card_text_id);
            FighterPic=itemView.findViewById(R.id.card_image_id);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int clickposition=getAdapterPosition();
            mlistener.onItemClick(clickposition);
        }
    }
    public interface listItemClickListener
    {
        void onItemClick(int clickedItemPosition);
    }

    public GridRecyclerAdapter(GridRecyclerAdapter.listItemClickListener listener, ArrayList<NationalistData> NationalistDataList, Context context)
    {
        mlistener=listener;
        this.NationalistDataList=NationalistDataList;
        this.context=context;
    }

    @Override
    public GridRecyclerAdapter.gridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        View view= LayoutInflater.from(context).inflate(R.layout.freedom_fighter_card,parent,false);
        return new GridRecyclerAdapter.gridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridRecyclerAdapter.gridViewHolder holder, int position) {
        NationalistData temp=NationalistDataList.get(position);
        holder.FighterName.setText(temp.NationalistName);

        String imageurl=temp.LinkToPhoto;
        Picasso.with(context).load(imageurl).placeholder(R.drawable.loadingicon).into(holder.FighterPic);
    }



    @Override
    public int getItemCount()
    {
        return NationalistDataList.size();
    }

}
