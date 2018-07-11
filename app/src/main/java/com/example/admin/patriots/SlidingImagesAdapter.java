package com.example.admin.patriots;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SlidingImagesAdapter extends PagerAdapter {

    private ArrayList<QuotesData> quoteList;
    private LayoutInflater inflater;
    private Context context;

    public SlidingImagesAdapter(Context context, ArrayList<QuotesData> quoteList) {
        this.context = context;
        this.quoteList = quoteList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return quoteList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myQuoteLayout = inflater.inflate(R.layout.quote_card, view, false);
        CardView cardView = myQuoteLayout.findViewById(R.id.quotes_card_id);
        TextView quoteTextView = myQuoteLayout.findViewById(R.id.quote_card_text_id);
        TextView authorTextView = myQuoteLayout.findViewById(R.id.quote_card_author_text_id);

        switch ((position % 4) + 1) {
            case 1:
                cardView.setBackgroundResource(R.drawable.quotes_back_1);
                break;
            case 2:
                cardView.setBackgroundResource(R.drawable.quotes_back_2);
                break;
            case 3:
                cardView.setBackgroundResource(R.drawable.quotes_back_3);
                break;
            case 4:
                cardView.setBackgroundResource(R.drawable.quotes_back_4);
                break;
        }

        quoteTextView.setText(quoteList.get(position).QuoteText);
        authorTextView.setText(quoteList.get(position).QuoteAuthor);
        view.addView(myQuoteLayout, 0);
        return myQuoteLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

}