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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create array list with the information about hotels.
        ArrayList<Information> info = new ArrayList<>();
        info.add(new Information("Hotel Mogilev", "The hotel \"Mogilev\" is located right in the center of the city on the picturesque " +
                "bank of the river Dubrovenka, 3 km far from the railway station. The hotel service level and the service quality" +
                " is highly valued by the tourists."));
        info.add(new Information("Hotel Gubernskaya", "The hotel is situated on the crossroads of Leninskaya and Mironova streets. " +
                "The location is very convenient. The upscale rooms feature a mix of casual and plush decor, and offer free Wi-Fi, " +
                "flat-screen TVs and minibars. Many have city or courtyard views."));
        info.add(new Information("Hotel Tourist", "The Tourist-hotel complex is situated in а park near the river Dnieper not far away" +
                " of the historic city center. There are the Hockey Palace, the Palace of culture, the leisure park, the cinema, a supermarket, " +
                "a bus station near the hotel. The hotel \"Tourist\" is a modern, comfortable hotel."));
        info.add(new Information("Hotel Metropol", "Hotel \"Metropol\" is a luxurious and quiet hotel in the historic center of Mogilev. " +
                "The hotel offers beautiful views of the ancient architectural monuments - the church of St. Stanislav and Drama Theatre. " +
                "The location of the hotel allows its guests to feel the unique cultural and spiritual atmosphere of Mogilev."));

        InfoAdapter adapter = new InfoAdapter(getActivity(), info, R.color.colorHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}

