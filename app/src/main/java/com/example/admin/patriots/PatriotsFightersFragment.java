package com.example.admin.patriots;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PatriotsFightersFragment extends Fragment implements GridRecyclerAdapter.listItemClickListener{

    ArrayList<NationalistData> FightersList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //List to contain freedom fighter details
        FightersList=new ArrayList<>();

        //Adding data to the list
        FightersList.add(new NationalistData("Tanguturi Prakasam","https://upload.wikimedia.org/wikipedia/en/0/03/T_prakasam_20061113.jpg",1872,1957,"https://en.wikipedia.org/wiki/Tanguturi_Prakasam"));
        FightersList.add(new NationalistData("Bhagat Singh","https://upload.wikimedia.org/wikipedia/commons/9/9b/Bhagat_Singh_1929_140x190.jpg",1907,1931,"https://en.wikipedia.org/wiki/Bhagat_Singh"));
        FightersList.add(new NationalistData("V. O. Chidambaram Pillai","https://upload.wikimedia.org/wikipedia/commons/c/c0/V._O._Chidambaram_Pillai.jpg",1872,1936,"https://en.wikipedia.org/wiki/V._O._Chidambaram_Pillai"));
        FightersList.add(new NationalistData("Rabindranath Tagore","https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Rabindranath_Tagore_unknown_location.jpg/220px-Rabindranath_Tagore_unknown_location.jpg",1861,1941,"https://en.wikipedia.org/wiki/Rabindranath_Tagore"));
        FightersList.add(new NationalistData("Subramania Bharati","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Subramanya_Bharathi.jpg/401px-Subramanya_Bharathi.jpg",1882,1921,"https://en.wikipedia.org/wiki/Subramania_Bharati"));
        FightersList.add(new NationalistData("Vinayak Damodar Savarkar","https://upload.wikimedia.org/wikipedia/commons/5/53/Savarkar3xt.jpg",1883,1966,"https://en.wikipedia.org/wiki/Vinayak_Damodar_Savarkar"));
        FightersList.add(new NationalistData("Alluri Sitarama Raju","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Alluri_Sita_Rama_Raju_statue.jpg/220px-Alluri_Sita_Rama_Raju_statue.jpg",1897,1924,"https://en.wikipedia.org/wiki/Alluri_Sitarama_Raju"));
        FightersList.add(new NationalistData("Khudiram Bose","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Khudiram_Bose_1905_cropped.jpg/220px-Khudiram_Bose_1905_cropped.jpg",1889,1908,"https://en.wikipedia.org/wiki/Khudiram_Bose"));
        FightersList.add(new NationalistData("Chandra Shekhar Azad","https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Chandrashekar_azad.bmp.jpg/220px-Chandrashekar_azad.bmp.jpg",1906,1931,"https://en.wikipedia.org/wiki/Chandra_Shekhar_Azad"));
        FightersList.add(new NationalistData("Chittaranjan Das","https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Portrait_of_Chittaranjan_Das.JPG/220px-Portrait_of_Chittaranjan_Das.JPG",1870,1925,"https://en.wikipedia.org/wiki/Chittaranjan_Das"));
        FightersList.add(new NationalistData("Komaram Bheem","https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Komaram_Bheem.jpg/220px-Komaram_Bheem.jpg",1901,1940,"https://en.wikipedia.org/wiki/Komaram_Bheem"));
        FightersList.add(new NationalistData("Ram Prasad Bismil","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRP9mgipymZTGFEZlr4Hzsy3okeY9_0WgJY1mdL39N-5zCio_Jm",1897,1927,"https://en.wikipedia.org/wiki/Ram_Prasad_Bismil"));
        FightersList.add(new NationalistData("Udham Singh","https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/Udham.jpg/220px-Udham.jpg",1899,1940,"https://en.wikipedia.org/wiki/Udham_Singh"));
        FightersList.add(new NationalistData("Hemu Kalani","https://upload.wikimedia.org/wikipedia/commons/6/62/Hemukalani.jpg",1923,1943,"https://en.wikipedia.org/wiki/Hemu_Kalani"));
        FightersList.add(new NationalistData("Mangal Pandey","http://im.hunt.in/cg/iol/About/Personalities/HistoricalHeroes/Mangal_pandey.jpg",1827,1857,"https://en.wikipedia.org/wiki/Mangal_Pandey"));
        FightersList.add(new NationalistData("Vasudev Balwant Phadke","https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/VasudevBalwantPhadkebust.jpg/220px-VasudevBalwantPhadkebust.jpg",1845,1883,"https://en.wikipedia.org/wiki/Vasudev_Balwant_Phadke"));
        FightersList.add(new NationalistData("Anant Laxman Kanhere","https://upload.wikimedia.org/wikipedia/en/thumb/b/bf/Kanhere.JPG/220px-Kanhere.JPG",1892,1910,"https://en.wikipedia.org/wiki/Anant_Laxman_Kanhere"));
        FightersList.add(new NationalistData("Bagha Jatin","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/BaghaJatin12.jpg/220px-BaghaJatin12.jpg",1879,1915,"https://en.wikipedia.org/wiki/Bagha_Jatin"));
        FightersList.add(new NationalistData("Batukeshwar Dutt","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Batukeshwar_dutt.jpg/220px-Batukeshwar_dutt.jpg",1910,1965,"https://en.wikipedia.org/wiki/Batukeshwar_Dutt"));
        FightersList.add(new NationalistData("Sukhdev Thapar","https://upload.wikimedia.org/wikipedia/en/7/71/Sukhdev_Thapar.jpeg",1907,1931,"https://en.wikipedia.org/wiki/Sukhdev_Thapar"));
        FightersList.add(new NationalistData("Shivaram Rajguru","https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Statues_of_Bhagat_Singh%2C_Rajguru_and_Sukhdev.jpg/220px-Statues_of_Bhagat_Singh%2C_Rajguru_and_Sukhdev.jpg",1908,1931,"https://en.wikipedia.org/wiki/Shivaram_Rajguru"));
        FightersList.add(new NationalistData("Pritilata Waddedar","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Original_Archived_photo_of_Pritilata_Waddedar.jpg/220px-Original_Archived_photo_of_Pritilata_Waddedar.jpg",1911,1932,"https://en.wikipedia.org/wiki/Pritilata_Waddedar"));
        FightersList.add(new NationalistData("Bhagwati Charan Vohra","https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Bhagwati_Charan_Vohra.jpg/220px-Bhagwati_Charan_Vohra.jpg",1904,1930,"https://en.wikipedia.org/wiki/Bhagwati_Charan_Vohra"));
        FightersList.add(new NationalistData("Madan Lal Dhingra","https://upload.wikimedia.org/wikipedia/commons/e/e2/Dhingra.jpg",1883,1909,"https://en.wikipedia.org/wiki/Madan_Lal_Dhingra"));
        FightersList.add(new NationalistData("Alluri Sitarama Raju","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Alluri_Sita_Rama_Raju_statue.jpg/220px-Alluri_Sita_Rama_Raju_statue.jpg",1897,1924,"https://en.wikipedia.org/wiki/Alluri_Sitarama_Raju"));
        FightersList.add(new NationalistData("Kushal Konwar","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Kushal_Kowar.jpg/220px-Kushal_Kowar.jpg",1905,1943,"https://en.wikipedia.org/wiki/Kushal_Konwar"));
        FightersList.add(new NationalistData("Surya Sen","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Surya_Sen_before_1934.jpg/220px-Surya_Sen_before_1934.jpg",1894,1934,"https://en.wikipedia.org/wiki/Surya_Sen"));
        FightersList.add(new NationalistData("Sri Aurobindo","https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Sri_aurobindo.jpg/220px-Sri_aurobindo.jpg",1872,1950,"https://en.wikipedia.org/wiki/Sri_Aurobindo"));
        FightersList.add(new NationalistData("Rash Behari Bose","https://upload.wikimedia.org/wikipedia/commons/f/ff/Rash_bihari_bose.jpg",1886,1945,"https://en.wikipedia.org/wiki/Rash_Behari_Bose"));
        FightersList.add(new NationalistData("Badal Gupta","https://upload.wikimedia.org/wikipedia/commons/3/39/Badal_gupta.jpg",1912,1930,"https://en.wikipedia.org/wiki/Badal_Gupta"));
        FightersList.add(new NationalistData("Dinesh Gupta","https://upload.wikimedia.org/wikipedia/en/thumb/0/07/Dinesh_Gupta_1.jpg/200px-Dinesh_Gupta_1.jpg",1911,1931,"https://en.wikipedia.org/wiki/Dinesh_Gupta"));
        FightersList.add(new NationalistData("Bhupendra Kumar Datta","https://upload.wikimedia.org/wikipedia/en/thumb/1/11/BhupendraDutta1.jpg/200px-BhupendraDutta1.jpg",1892,1979,"https://en.wikipedia.org/wiki/Bhupendra_Kumar_Datta"));
        FightersList.add(new NationalistData("Ramesh Chandra Jha","https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/R.C.Jha.jpg/220px-R.C.Jha.jpg",1928,1994,"https://en.wikipedia.org/wiki/Ramesh_Chandra_Jha"));
        FightersList.add(new NationalistData("Bhavabhushan Mitra","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/BHAVABHUSHAN_MITRA.JPG/220px-BHAVABHUSHAN_MITRA.JPG",1881,1970,"https://en.wikipedia.org/wiki/Bhavabhushan_Mitra"));
        FightersList.add(new NationalistData("Bina Das","https://upload.wikimedia.org/wikipedia/commons/0/08/Dasbina.jpg",1911,1986,"https://en.wikipedia.org/wiki/Bina_Das"));
        FightersList.add(new NationalistData("Kalpana Datta","https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Kalpana_Dutt.png/220px-Kalpana_Dutt.png",1913,1995,"https://en.wikipedia.org/wiki/Kalpana_Datta"));
        FightersList.add(new NationalistData("Kartar Singh Sarabha","https://upload.wikimedia.org/wikipedia/commons/6/69/Kartar_singh_sarabha.jpg",1896,1915,"https://en.wikipedia.org/wiki/Kartar_Singh_Sarabha"));
        FightersList.add(new NationalistData("Shyamji Krishna Varma","https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Shyamji_krishna_varma.jpg/220px-Shyamji_krishna_varma.jpg",1857,1930,"https://en.wikipedia.org/wiki/Shyamji_Krishna_Varma"));
        FightersList.add(new NationalistData("Subhas Chandra Bose","https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Netaji_Subhas_Chandra_Bose.jpg/220px-Netaji_Subhas_Chandra_Bose.jpg",1897,1945,"https://en.wikipedia.org/wiki/Subhas_Chandra_Bose"));
        FightersList.add(new NationalistData("Binod Bihari Chowdhury","https://upload.wikimedia.org/wikipedia/en/7/7d/Binod_Bihari_Chowdhury.jpg",1911,2013,"https://en.wikipedia.org/wiki/Binod_Bihari_Chowdhury"));
        FightersList.add(new NationalistData("Bhupendranath Datta","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Bhupendranath_Datta_%28brother_of_Swami_Vivekananda%29.png/230px-Bhupendranath_Datta_%28brother_of_Swami_Vivekananda%29.png",1880,1961,"https://en.wikipedia.org/wiki/Bhupendranath_Datta"));
        FightersList.add(new NationalistData("Amarendranath Chatterjee","https://upload.wikimedia.org/wikipedia/commons/1/13/AMARENDRA_CHATTERJEE.JPG",1880,1957,"https://en.wikipedia.org/wiki/Amarendranath_Chatterjee"));
        FightersList.add(new NationalistData("Subodh Roy","https://upload.wikimedia.org/wikipedia/commons/0/07/Subodh_roy.jpg",1916,2006,"https://en.wikipedia.org/wiki/Subodh_Roy"));
        FightersList.add(new NationalistData("Asaf Ali","https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Asaf_Ali_c-_1909_2013-08-09_16-24.jpg/220px-Asaf_Ali_c-_1909_2013-08-09_16-24.jpg",1888,1953,"https://en.wikipedia.org/wiki/Asaf_Ali"));
        FightersList.add(new NationalistData("Mahatma Gandhi","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Portrait_Gandhi.jpg/220px-Portrait_Gandhi.jpg",1869,1948,"https://en.wikipedia.org/wiki/Mahatma_Gandhi"));
        FightersList.add(new NationalistData("Jawaharlal Nehru","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Jnehru.jpg/220px-Jnehru.jpg",1889,1964,"https://en.wikipedia.org/wiki/Jawaharlal_Nehru"));
        FightersList.add(new NationalistData("S. Satyamurti","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Sathyamurthy.jpg/220px-Sathyamurthy.jpg",1887,1943,"https://en.wikipedia.org/wiki/S._Satyamurti"));
        FightersList.add(new NationalistData("Bal Gangadhar Tilak","https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Bal_G._Tilak.jpg/220px-Bal_G._Tilak.jpg",1856,1920,"https://en.wikipedia.org/wiki/Bal_Gangadhar_Tilak"));
        FightersList.add(new NationalistData("Bipin Chandra Pal","https://upload.wikimedia.org/wikipedia/commons/a/a0/Bipin-Chandra-Pal.jpg",1858,1932,"https://en.wikipedia.org/wiki/Bipin_Chandra_Pal"));
        FightersList.add(new NationalistData("Lala Lajpat Rai","https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Lala_Lajpat_Rai_photo_in_Young_India.jpg/220px-Lala_Lajpat_Rai_photo_in_Young_India.jpg",1865,1928,"https://en.wikipedia.org/wiki/Lala_Lajpat_Rai"));


        View fragmentView=inflater.inflate(R.layout.patriots_fighters_fragment,container,false);
        RecyclerView recyclerView=fragmentView.findViewById(R.id.new_fragment_recycler_view_id);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(new GridRecyclerAdapter(this,FightersList,getContext()));


        return fragmentView;


    }

    @Override
    public void onItemClick(int clickedItemPosition) {
        NationalistData clickedItem=FightersList.get(clickedItemPosition);
        Intent wikiIntent=new Intent(getContext(),Nationalistwiki.class);
        Bundle bundle=new Bundle();
        bundle.putString("freedom_fighter_data_link",clickedItem.LinkToData);
        wikiIntent.putExtras(bundle);
        startActivity(wikiIntent);
    }

}