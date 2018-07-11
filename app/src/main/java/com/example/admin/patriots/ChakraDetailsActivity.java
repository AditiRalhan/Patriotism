package com.example.admin.patriots;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ChakraDetailsActivity extends AppCompatActivity implements GridRecyclerAdapter.listItemClickListener, View.OnClickListener{

    ArrayList<NationalistData> recipientsList;
    RecyclerView recyclerView;
    TextView completeList;
    String completeListUrl="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chakra_details);
        recipientsList=new ArrayList<>();

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(!bundle.isEmpty())
        {
            if(bundle.containsKey("LauncherCategoryKey"))
            {
                if(bundle.getString("LauncherCategoryKey").equals("Param Vir Chakra"))
                {
                    recipientsList.add(new NationalistData("Somnath Sharma","https://upload.wikimedia.org/wikipedia/en/4/42/Somanth_Sharma.jpg","https://en.wikipedia.org/wiki/Somnath_Sharma"));
                    recipientsList.add(new NationalistData("Jadunath Singh","https://upload.wikimedia.org/wikipedia/en/thumb/4/43/Jadunath_Singh_PVC.jpg/250px-Jadunath_Singh_PVC.jpg","https://en.wikipedia.org/wiki/Jadunath_Singh"));
                    recipientsList.add(new NationalistData("Rama Raghoba Rane","https://upload.wikimedia.org/wikipedia/en/7/75/Rama_Raghoba_Rane_PVC.jpg","https://en.wikipedia.org/wiki/Rama_Raghoba_Rane"));
                    recipientsList.add(new NationalistData("Piru Singh","https://upload.wikimedia.org/wikipedia/en/thumb/3/3f/Piru_Singh_PVC.jpg/220px-Piru_Singh_PVC.jpg","https://en.wikipedia.org/wiki/Piru_Singh"));
                    recipientsList.add(new NationalistData("Karam Singh","https://upload.wikimedia.org/wikipedia/en/thumb/3/3c/Karam_Singh.jpg/220px-Karam_Singh.jpg","https://en.wikipedia.org/wiki/Karam_Singh"));
                    recipientsList.add(new NationalistData("Gurbachan Singh Salaria","https://upload.wikimedia.org/wikipedia/en/thumb/b/be/Captain_G_S_Salaria.jpg/220px-Captain_G_S_Salaria.jpg","https://en.wikipedia.org/wiki/Gurbachan_Singh_Salaria"));
                    recipientsList.add(new NationalistData("Dhan Singh Thapa","https://upload.wikimedia.org/wikipedia/en/thumb/4/48/Dhan_Singh_Thapa.jpg/250px-Dhan_Singh_Thapa.jpg","https://en.wikipedia.org/wiki/Dhan_Singh_Thapa"));
                    recipientsList.add(new NationalistData("Joginder Singh","https://upload.wikimedia.org/wikipedia/en/thumb/2/2b/Joginder_SIngh_PVC.jpg/250px-Joginder_SIngh_PVC.jpg","https://en.wikipedia.org/wiki/Joginder_Singh_(soldier"));
                    recipientsList.add(new NationalistData("Shaitan Singh","https://upload.wikimedia.org/wikipedia/en/thumb/c/c4/Shaitan_Singh_PVC.jpg/200px-Shaitan_Singh_PVC.jpg","https://en.wikipedia.org/wiki/Shaitan_Singh"));
                    recipientsList.add(new NationalistData("Abdul Hamid","https://upload.wikimedia.org/wikipedia/en/thumb/1/1a/Abdul_Hamid_PVC.jpg/250px-Abdul_Hamid_PVC.jpg","https://en.wikipedia.org/wiki/Abdul_Hamid_(soldier)"));
                    recipientsList.add(new NationalistData("Ardeshir Tarapore","https://upload.wikimedia.org/wikipedia/en/3/3a/Ardeshir_Tarapore_PVC.jpg","https://en.wikipedia.org/wiki/Ardeshir_Tarapore"));
                    recipientsList.add(new NationalistData("Albert Ekka","https://upload.wikimedia.org/wikipedia/en/e/eb/Albert_Ekka_PVC.jpg","https://en.wikipedia.org/wiki/Albert_Ekka"));
                    recipientsList.add(new NationalistData("Nirmal Jit Singh Sekhon","https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Statue_of_Nirmal_Jit_Singh_Sekhon_and_his_aircraft%2C_10_sep_2013.jpg/220px-Statue_of_Nirmal_Jit_Singh_Sekhon_and_his_aircraft%2C_10_sep_2013.jpg","https://en.wikipedia.org/wiki/Nirmal_Jit_Singh_Sekhon"));
                    recipientsList.add(new NationalistData("Arun Khetarpal","https://upload.wikimedia.org/wikipedia/en/2/29/Arun_Khetarpal_PVC.jpg","https://en.wikipedia.org/wiki/Arun_Khetarpal"));
                    recipientsList.add(new NationalistData("Hoshiar Singh","https://upload.wikimedia.org/wikipedia/en/c/c9/Hoshiar_Singh_PVC.jpg","https://en.wikipedia.org/wiki/Hoshiar_Singh"));
                    recipientsList.add(new NationalistData("Bana Singh","","https://en.wikipedia.org/wiki/Bana_Singhhttps://upload.wikimedia.org/wikipedia/commons/2/2a/Bana_Singh_PVC.jpg"));
                    recipientsList.add(new NationalistData("Ramaswamy Parameshwaran","","https://en.wikipedia.org/wiki/Ramaswamy_Parameshwaran"));
                    recipientsList.add(new NationalistData("Yogendra Singh Yadav","https://upload.wikimedia.org/wikipedia/commons/0/01/Yogendra_Singh_Yadav_PVC.jpg","https://en.wikipedia.org/wiki/Yogendra_Singh_Yadav"));
                    recipientsList.add(new NationalistData("Manoj Kumar Pandey","https://upload.wikimedia.org/wikipedia/en/6/64/Manoj_Kumar_Pandey_PVC.jpg","https://en.wikipedia.org/wiki/Manoj_Kumar_Pandey\t"));
                    recipientsList.add(new NationalistData("Sanjay Kumar","https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Sanjay_Kumar_PVC.jpg/220px-Sanjay_Kumar_PVC.jpg","https://en.wikipedia.org/wiki/Sanjay_Kumar_(soldier)"));
                    recipientsList.add(new NationalistData("Vikram Batra","https://upload.wikimedia.org/wikipedia/en/5/56/Vikram_Batra_PVC.jpg","https://en.wikipedia.org/wiki/Vikram_Batra"));

                    recyclerView=findViewById(R.id.chakra_details_recycler_view_id);
                    recyclerView.setLayoutManager(new GridLayoutManager(this,2));
                    recyclerView.setAdapter(new GridRecyclerAdapter(ChakraDetailsActivity.this,recipientsList,ChakraDetailsActivity.this));
                    completeListUrl="http://gallantryawards.gov.in/awardees/param-vir-chakra";

                }
                else
                {
                    recipientsList.add(new NationalistData("K. Prasad Babu","https://upload.wikimedia.org/wikipedia/en/thumb/9/96/K_Prasad_Babu.jpg/220px-K_Prasad_Babu.jpg","https://en.wikipedia.org/wiki/K._Prasad_Babu"));
                    recipientsList.add(new NationalistData("Navdeep Singh","https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Lieutenant_Navdeep_Singh.jpg/220px-Lieutenant_Navdeep_Singh.jpg","https://en.wikipedia.org/wiki/Navdeep_Singh_(Ashok_Chakra)"));
                    recipientsList.add(new NationalistData("Mohit Sharma","https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Maj._Mohit_Sharma_%281_Para_SF%29_%28cropped%29.jpg/220px-Maj._Mohit_Sharma_%281_Para_SF%29_%28cropped%29.jpg","https://en.wikipedia.org/wiki/Mohit_Sharma_(soldier)"));
                    recipientsList.add(new NationalistData("Hemant Karkare","https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Hemant_Karkare.jpg/220px-Hemant_Karkare.jpg","https://en.wikipedia.org/wiki/Hemant_Karkare"));
                    recipientsList.add(new NationalistData("Vijay Salaskar","https://upload.wikimedia.org/wikipedia/en/thumb/7/74/VijaySalaskar.jpg/220px-VijaySalaskar.jpg","https://en.wikipedia.org/wiki/Vijay_Salaskar"));
                    recipientsList.add(new NationalistData("Havaldar Gajender Singh","https://upload.wikimedia.org/wikipedia/en/3/3d/Havildar_Gajender_Singh.jpg","https://en.wikipedia.org/wiki/Havaldar_Gajender_Singh"));
                    recipientsList.add(new NationalistData("Sandeep Unnikrishnan","https://upload.wikimedia.org/wikipedia/en/thumb/4/42/Sandeep_Unnikrishnan.jpg/220px-Sandeep_Unnikrishnan.jpg","https://en.wikipedia.org/wiki/Sandeep_Unnikrishnan"));
                    recipientsList.add(new NationalistData("Mohan Chand Sharma","https://upload.wikimedia.org/wikipedia/en/9/96/Mohan_Chand_Sharma.jpg","https://en.wikipedia.org/wiki/Mohan_Chand_Sharma"));
                    recipientsList.add(new NationalistData("Chuni Lal","https://upload.wikimedia.org/wikipedia/en/thumb/f/f2/Naib_Subedar_Chuni_Lal.jpg/220px-Naib_Subedar_Chuni_Lal.jpg","https://en.wikipedia.org/wiki/Chuni_Lal"));
                    recipientsList.add(new NationalistData("Neelakantan Jayachandran Nair","https://upload.wikimedia.org/wikipedia/en/thumb/3/34/Col_N._J._Nair.jpg/150px-Col_N._J._Nair.jpg","https://en.wikipedia.org/wiki/Neelakantan_Jayachandran_Nair"));
                    recipientsList.add(new NationalistData("Neerja Bhanot","https://upload.wikimedia.org/wikipedia/en/thumb/f/f5/Neerja_Bhanot_%281963_%E2%80%93_1986%29.jpg/220px-Neerja_Bhanot_%281963_%E2%80%93_1986%29.jpg","https://en.wikipedia.org/wiki/Neerja_Bhanot"));
                    recipientsList.add(new NationalistData("Rakesh Sharma","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Rakesh_sharma.jpg/220px-Rakesh_sharma.jpg","https://en.wikipedia.org/wiki/Rakesh_Sharma"));
                    recipientsList.add(new NationalistData("Gennadi Strekalov","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Gennady_Strekalov.jpg/220px-Gennady_Strekalov.jpg","https://en.wikipedia.org/wiki/Gennadi_Strekalov"));
                    recipientsList.add(new NationalistData("Yury Malyshev","https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/1980_CPA_5108.jpg/220px-1980_CPA_5108.jpg","https://en.wikipedia.org/wiki/Yury_Malyshev_(cosmonaut)"));
                    recipientsList.add(new NationalistData("Bachittar Singh","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Fort_of_Kotla_Nihang_Khan%2C_village_Kotla_Nihang_Khan%2C_Rupnagar_district%2CPunjab%2CIndia.jpg/220px-Fort_of_Kotla_Nihang_Khan%2C_village_Kotla_Nihang_Khan%2C_Rupnagar_district%2CPunjab%2CIndia.jpg","https://en.wikipedia.org/wiki/Bachittar_Singh"));

                    recyclerView=findViewById(R.id.chakra_details_recycler_view_id);
                    recyclerView.setLayoutManager(new GridLayoutManager(this,2));
                    recyclerView.setAdapter(new GridRecyclerAdapter(ChakraDetailsActivity.this,recipientsList,ChakraDetailsActivity.this));
                    completeListUrl="http://gallantryawards.gov.in/awardees/ashoka-chakra";
                }
            }
        }

        completeList=findViewById(R.id.chakra_details_complete_list_id);
        completeList.setOnClickListener(this);





    }

    @Override
    public void onItemClick(int clickedItemPosition) {
        NationalistData clickedItem=recipientsList.get(clickedItemPosition);
        Intent wikiIntent=new Intent(ChakraDetailsActivity.this,Nationalistwiki.class);
        Bundle bundle=new Bundle();
        bundle.putString("freedom_fighter_data_link",clickedItem.LinkToData);
        wikiIntent.putExtras(bundle);
        startActivity(wikiIntent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.chakra_details_complete_list_id:
                Intent wikiIntent=new Intent(ChakraDetailsActivity.this,Nationalistwiki.class);
                Bundle bundle=new Bundle();
                bundle.putString("freedom_fighter_data_link",completeListUrl);
                wikiIntent.putExtras(bundle);
                startActivity(wikiIntent);
                break;
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}