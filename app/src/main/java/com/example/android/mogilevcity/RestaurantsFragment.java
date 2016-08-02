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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create array list with the information about retaurants.
        ArrayList<Information> info = new ArrayList<>();
        info.add(new Information("Cafe - Pizza Parmesan", "A very popular place especially among the young people. Parmesan offers a great variety" +
                " of pizzas (more than 30), pasta, salads, deserts, beers and wines. It is comfortably located in the very center of the city."));
        info.add(new Information("Restaurant 101", "Fire station themed restaurant which is located in the historical center of the city. You will be " +
                "surprised by its decor. At some point you will catch yourself thinking that you are inside the fire department station."));
        info.add(new Information("Restaurant - Cafe Izba ", "The cafe is located on the first floor, and the restaurant is on the second. The decor is very authentic. " +
                "Over there you can feel the atmosphere of Belarusian village and try dishes of local cuisine."));
        info.add(new Information("Irish Pub Ale House", "There is a great selection of local and European beers as well as other spirits. This bar also" +
                " has a great food menu. If you happen to be there Friday or Saturday night, you can listen to live music as well. "));


        InfoAdapter adapter = new InfoAdapter(getActivity(), info, R.color.colorRestaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
