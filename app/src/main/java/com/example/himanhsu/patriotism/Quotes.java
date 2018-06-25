package com.example.himanhsu.patriotism;

import android.content.Context;
import android.media.Image;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Quotes extends AppCompatActivity implements QuotesAdapter.listItemClickListener{
//    ViewFlipper viewFlipper;
//    int flipperIndex=-1;
    NonSwipeableViewPager viewPager;
    ImageView leftArrow,rightArrow;
    RecyclerView quotesRecyclerView;

    ArrayList<QuotesData> QuotesList;
    int currentQuote=0;
    boolean isSwiping=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        QuotesList=new ArrayList<>();
        QuotesList.add(new QuotesData("B.R. Ambedkar","Political tyranny is nothing compared to social tyranny and a reformer who defies society is a more courageous man than a politician who defies government"));
        QuotesList.add(new QuotesData("Gautama Buddha","All that we are is the result of what we have thought.\n The mind is everything.\n What we think we become"));
        QuotesList.add(new QuotesData("Sri Ramakrishna Paramahamsa","The tree laden with fruits always bends low.\n If you wish to be great, be lowly and meek"));
        QuotesList.add(new QuotesData("Jawaharlal Nehru","Democracy is good.\n I say this because other systems are worse."));
        QuotesList.add(new QuotesData("Swami Vivekananda","We are what our thoughts have made us; so take care about what you think.\n Words are secondary.\n Thoughts live; they travel far"));
        QuotesList.add(new QuotesData("B.R. Ambedkar","So long as you do not achieve social liberty,\n whatever freedom is provided by the law is of no avail to you"));
        QuotesList.add(new QuotesData("Annie Besant","India is a country in which every great religion finds a home."));
        QuotesList.add(new QuotesData("Chandra Shekhar Azad","Don’t see others doing better than you,\n beat your own records everyday,\n because success is a fight between you and yourself."));
        QuotesList.add(new QuotesData("Bankim Chandra  Chatterjee","Patriotism is religion and religion is love for India."));
        QuotesList.add(new QuotesData("Chandra Shekhar Azad","If yet your blood does not rage,\n then it is water that flows in your veins.\n For what is the flush of youth,\n if it is not of service to the motherland"));
        QuotesList.add(new QuotesData("Ashfaqulla Khan","There is no dream, and if there is,\n there is only one to see you my children struggling for the same and for which I am expected to be finished."));
        QuotesList.add(new QuotesData("Bhagat Singh","The sanctity of law can be maintained only so long as it is the expression of the will of the people."));
        QuotesList.add(new QuotesData("Mahatma Gandhi","First they ignore you, \nthen they laugh at you, \nthen they fight you,\n then you win."));
        QuotesList.add(new QuotesData("Dr. Rajendra Prasad","In attaining our ideals, our means should be as pure as the end"));
        QuotesList.add(new QuotesData("Lala Lajpat Rai.","The shots that hit me are the last nails to the coffin of British rule in India."));
        QuotesList.add(new QuotesData("Mahatma Gandhi","An eye for an only ends up making the whole world blind."));
        QuotesList.add(new QuotesData("Bal Gangadhar Tilak","Swaraj is my birth right and I shall have it."));
        QuotesList.add(new QuotesData("Sarojini Naidu","A country’s greatness lies in its undying ideals of love and sacrifice that inspire the mothers of the race."));
        QuotesList.add(new QuotesData("Lal Bahadur Shastri","We believe in peace and peaceful development, not only for ourselves but for people all over the world."));
        QuotesList.add(new QuotesData("B. R. Ambedkar","Life should be great rather than long."));
        QuotesList.add(new QuotesData("Subhash Chandra Bose","Give me blood and I will give you freedom."));
        QuotesList.add(new QuotesData("Bhagat Singh","Bombs and pistols do not make a revolution. \nThe sword of revolution is sharpened on the whetting-stone of ideas."));
        QuotesList.add(new QuotesData("Sardar Patel","Every Indian should now forget that he is a Rajput, a Sikh or a Jat. \nHe must remember that he is an Indian."));
        QuotesList.add(new QuotesData("Maulana Abul Kalam Azad","You have to dream before your dreams can come true."));
        QuotesList.add(new QuotesData("Swami Vivekananda","Arise, Awake and Stop not until the goal is reached."));
        QuotesList.add(new QuotesData("Mahatma Gandhi","You must be the change you want to see in the world."));
        QuotesList.add(new QuotesData("Jawaharlal Nehru","Failure comes only when we forget our ideals and objectives and principles."));
        QuotesList.add(new QuotesData("Abdul Kalam","To succeed in your mission, you must have single-minded devotion to your goal."));
        QuotesList.add(new QuotesData("Mother Teresa","The biggest problem in the world today is not poverty or disease but the lack of love and charity and the feeling of being unwanted"));
        QuotesList.add(new QuotesData("Swami Vivekananda","Education is the manifestation of perfection already in a man"));
        QuotesList.add(new QuotesData("Sri Ramakrishna Paramahamsa","The world is not impermanent if one lives there after knowing God."));
        QuotesList.add(new QuotesData("Subhash chandra bose","No real change in history has ever been achieved by discussions."));
        QuotesList.add(new QuotesData("Subhash Chandra Bose","Soldiers who always remain faithful to their nation, \nwho are always prepared to sacrifice their lives,\n are invincible."));

        viewPager=findViewById(R.id.slider_pager_quotes);
        viewPager.setAdapter(new SlidingImagesAdapter(Quotes.this,QuotesList));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if(state==0)
                    isSwiping=false;
                if(state==2)
                    isSwiping=true;

            }
        });

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if(!isSwiping){
                    currentQuote=viewPager.getCurrentItem();
                if(currentQuote==(QuotesList.size()-1))
                    currentQuote=-1;
                currentQuote=(currentQuote+1);
                viewPager.setCurrentItem(currentQuote, true);
                Log.d("slider","current item is "+currentQuote);
            }}
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 7000, 7000);




        leftArrow=findViewById(R.id.left_arrow_id);
        rightArrow=findViewById(R.id.right_arrow_id);

        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSwiping) {
                    currentQuote=viewPager.getCurrentItem();
                    if (currentQuote == 0)
                        currentQuote = QuotesList.size();
                    --currentQuote;
                    viewPager.setCurrentItem(currentQuote, true);
                    Log.d("slider","current item is "+currentQuote);
                }

            }
        });

        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isSwiping) {
                    currentQuote = viewPager.getCurrentItem();
                    if (currentQuote == (QuotesList.size() - 1))
                        currentQuote = -1;
                    currentQuote = (currentQuote + 1);
                    viewPager.setCurrentItem(currentQuote, true);
                    Log.d("slider","current item is "+currentQuote);
                }
            }
        });



        quotesRecyclerView=findViewById(R.id.quotes_recycler_view_id);
        quotesRecyclerView.setLayoutManager(new LinearLayoutManager(Quotes.this));
        quotesRecyclerView.setAdapter(new QuotesAdapter(Quotes.this,QuotesList,Quotes.this));


//        viewFlipper=findViewById(R.id.quotes_view_flipper_id);
//
//        viewFlipper.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
//            @Override
//            public void onLayoutChange(View view, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
//                TextView quoteView1,authorView1,quoteView2,authorView2;
//                quoteView1=view.findViewById(R.id.quote_text_id);
//                authorView1=view.findViewById(R.id.quote_author_text_id);
//                quoteView2=view.findViewById(R.id.quote_text_card_2_id);
//                authorView2=view.findViewById(R.id.quote_author_text_card_2_id);
//                Log.d("Qotes","flipper index is "+flipperIndex);
//                CardView cardView1=findViewById(R.id.card_1_id);
//                CardView cardView2=findViewById(R.id.card_2_id);
//                viewFlipper.startFlipping();
//               if( viewFlipper.getCurrentView().getId()==R.id.card_1_id)
//               {
//                   flipperIndex=(flipperIndex+1)%QuotesList.size();
//                   Log.d("dfdfd","instance of card view 1");
//
//                   quoteView1.setText(QuotesList.get(flipperIndex).QuoteText);
//                   authorView1.setText(QuotesList.get(flipperIndex).QuoteAuthor);
//                   if(flipperIndex==0)
//                       viewFlipper.startFlipping();
//               }
//                if( viewFlipper.getCurrentView().getId()==R.id.card_2_id)
//                {
//                    flipperIndex=(flipperIndex+1)%QuotesList.size();
//                    Log.d("dfdfd","instance of card view 1");
//                    quoteView2.setText(QuotesList.get(flipperIndex).QuoteText);
//                    authorView2.setText(QuotesList.get(flipperIndex).QuoteAuthor);
//                }
//            }
//        });

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void onItemClick(int clickedItemPosition) {
        if(!isSwiping)
        {
            viewPager.setCurrentItem(clickedItemPosition, true);
        }
    }
}
