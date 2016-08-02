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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create array list with the information about museums.
        ArrayList<Information> info = new ArrayList<>();
        info.add(new Information("Ratusha", "Mogilev Town Hall, which is also knows as \"Ratusha\", " +
                "a restored 17th - century monument of architecture. Museum of History" +
                " of Mogilev is housed inside it.", R.drawable.city_hall));
        info.add(new Information("Museum of Ethnography", "This museum will tell you a lot of information about the " +
                "history of Mogilev city and its region.", R.drawable.ethno_museum));
        info.add(new Information("Mogilev Fine Arts \nMuseum of Maslenikov", "This museum is a guardian of masterpieces" +
                " of the 17th - 19th centuries but also is a great architectural specimen",
                R.drawable.maslenikov_museum));
        info.add(new Information("The Buinichi Field Memorial", "That is a museum under the open sky which is a symbol" +
                " of courage and perseverance of Belarusian people.", R.drawable.pole));

        InfoAdapter adapter = new InfoAdapter(getActivity(), info, R.color.colorMuseums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
