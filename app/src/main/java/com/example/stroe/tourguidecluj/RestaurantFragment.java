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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_element_list, container, false);
        // Create a list of tour elements
        ArrayList<PointOfInterest> elements = new ArrayList<PointOfInterest>();
        elements.add(new PointOfInterest("Samsara Foodfouse", "Address", "description", R.drawable.samsara1_min));
        elements.add(new PointOfInterest("Gandhi","Address", "description", R.drawable.gandhi_min));
        elements.add(new PointOfInterest("Chios","Address", "description", R.drawable.chios_min));
        elements.add(new PointOfInterest("Boema","Address", "description", R.drawable.boema_min));
        elements.add(new PointOfInterest("Baracca","Address", "description", R.drawable.baracca_min));

        TourElementAdapter itemsAdapter =
                new TourElementAdapter(getActivity(), elements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
