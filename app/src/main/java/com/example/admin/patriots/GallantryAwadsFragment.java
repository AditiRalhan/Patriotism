package com.example.admin.patriots;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class GallantryAwadsFragment extends Fragment implements View.OnClickListener{

    RelativeLayout paramVirChakra,mahaVirChakra,virChakra,ashokaChakra,kirtiChakra,shauryaChakra;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gallantryFragment=inflater.inflate(R.layout.gallantry_awards_fragment,container,false);

        paramVirChakra=gallantryFragment.findViewById(R.id.awards_param_vir_chakra_id);
        mahaVirChakra=gallantryFragment.findViewById(R.id.awards_maha_vir_chakra_id);
        virChakra=gallantryFragment.findViewById(R.id.awards_vir_chakra_id);
        ashokaChakra=gallantryFragment.findViewById(R.id.awards_ashoka_chakra_id);
        kirtiChakra=gallantryFragment.findViewById(R.id.awards_kirti_chakra_id);
        shauryaChakra=gallantryFragment.findViewById(R.id.awards_shaurya_chakra_id);
        paramVirChakra.setOnClickListener(this);
        mahaVirChakra.setOnClickListener(this);
        virChakra.setOnClickListener(this);
        ashokaChakra.setOnClickListener(this);
        kirtiChakra.setOnClickListener(this);
        shauryaChakra.setOnClickListener(this);


        return gallantryFragment;
    }

    @Override
    public void onClick(View view) {

        Intent wikiIntent=new Intent(getContext(),Nationalistwiki.class);
        Bundle bundle=new Bundle();
        String completeListUrl="";

        switch (view.getId())
        {
            case R.id.awards_param_vir_chakra_id:
                Intent chakraDetailsintent=new Intent(getContext(),ChakraDetailsActivity.class);
                Bundle paramVirBundle=new Bundle();
                paramVirBundle.putString("LauncherCategoryKey","Param Vir Chakra");
                chakraDetailsintent.putExtras(paramVirBundle);
                startActivity(chakraDetailsintent);
                break;
            case R.id.awards_ashoka_chakra_id:
                Intent ashokaIntent=new Intent(getContext(),ChakraDetailsActivity.class);
                Bundle ashokaBundle=new Bundle();
                ashokaBundle.putString("LauncherCategoryKey","Ashoka Chakra");
                ashokaIntent.putExtras(ashokaBundle);
                startActivity(ashokaIntent);
                break;
            case R.id.awards_maha_vir_chakra_id:
                completeListUrl="https://en.wikipedia.org/wiki/Maha_Vir_Chakra";
                bundle.putString("freedom_fighter_data_link",completeListUrl);
                wikiIntent.putExtras(bundle);
                startActivity(wikiIntent);
                break;
            case R.id.awards_kirti_chakra_id:
                completeListUrl="https://en.wikipedia.org/wiki/Kirti_Chakra";
                bundle.putString("freedom_fighter_data_link",completeListUrl);
                wikiIntent.putExtras(bundle);
                startActivity(wikiIntent);
                break;
            case R.id.awards_vir_chakra_id:
                completeListUrl="https://en.wikipedia.org/wiki/Vir_Chakra";
                bundle.putString("freedom_fighter_data_link",completeListUrl);
                wikiIntent.putExtras(bundle);
                startActivity(wikiIntent);
                break;
            case R.id.awards_shaurya_chakra_id:
                completeListUrl="https://en.wikipedia.org/wiki/Shaurya_Chakra";
                bundle.putString("freedom_fighter_data_link",completeListUrl);
                wikiIntent.putExtras(bundle);
                startActivity(wikiIntent);
                break;
        }

    }


}