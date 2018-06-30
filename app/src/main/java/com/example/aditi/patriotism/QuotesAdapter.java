package com.example.aditi.patriotism;

/**
 * Created by ADITI on 6/28/2018.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.QuoteViewHolder>
{

    private  final QuotesAdapter.listItemClickListener mlistener;
    private ArrayList<QuotesData> QuotesDataList;
    private Context context;

    class QuoteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView quoteTextView;
        QuoteViewHolder(View itemView)
        {
            super(itemView);
            quoteTextView=itemView.findViewById(R.id.quotes_block_text_id);
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

    public QuotesAdapter(QuotesAdapter.listItemClickListener listener, ArrayList<QuotesData> QuotesDataList, Context context)
    {
        mlistener=listener;
        this.QuotesDataList=QuotesDataList;
        this.context=context;
    }

    @Override
    public QuotesAdapter.QuoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        View view= LayoutInflater.from(context).inflate(R.layout.quote_block,parent,false);
        return new QuotesAdapter.QuoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(QuotesAdapter.QuoteViewHolder holder, int position) {
        QuotesData temp=QuotesDataList.get(position);
        holder.quoteTextView.setText(temp.QuoteText);
    }



    @Override
    public int getItemCount()
    {
        return QuotesDataList.size();
    }

}
