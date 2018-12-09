package com.example.stroe.tourguidecluj;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccomodationFragment extends Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_element_list, container, false);

        // Create a list of tour elements
        ArrayList<PointOfInterest> elements = new ArrayList<PointOfInterest>();
        elements.add(new PointOfInterest("Hampton by Hilton Cluj-Napoca","Address", "description", R.drawable.hampton_min));
        elements.add(new PointOfInterest("Grand Hotel Italia","Address", "description", R.drawable.grand_italia_min));
        elements.add(new PointOfInterest("Grand Hotel Napoca","Address", "description", R.drawable.grand_napoca_min));
        elements.add(new PointOfInterest("Ramada Hotel Cluj","Address", "description", R.drawable.ramada_min));
        elements.add(new PointOfInterest("Hotel Belvedere","Address", "description", R.drawable.belvedere_min));
        elements.add(new PointOfInterest("Hotel Melody Central","Address", "description", R.drawable.melody_min));

        TourElementAdapter itemsAdapter =
                new TourElementAdapter(getActivity(), elements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
