package com.example.android.mogilevcity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoolThingsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create array list with the information about cool things to do.
        ArrayList<Information> info = new ArrayList<>();
        info.add(new Information("Visit Star Square", "The square is surrounded by 12 chairs with zodiac signs. Local people" +
                " say if you sit on a chair of your zodiac sign and make a wish it will come true.", R.drawable.star_square));
        info.add(new Information("See a play at Drama Theater", "The theater was founded in 1888 at the expense of voluntary " +
                "donations of citizens of the city of Mogilev. It a very beautiful bulding that is hard to miss.", R.drawable.theater));
        info.add(new Information("Walk by Dubrovenka River", "This river had almost dissapered, but local authorities fixed it" +
                " and made it a very nice place to go for a walk.", R.drawable.dubrovenka));
        info.add(new Information("Visit Zoosad", "Locate right across Buinichi field, zoosad is a perfect place to " +
                "discover local nature, animals, history, and crafts. You will enjoy it!", R.drawable.zoo));


        InfoAdapter adapter = new InfoAdapter(getActivity(), info, R.color.colorCoolThings);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}

