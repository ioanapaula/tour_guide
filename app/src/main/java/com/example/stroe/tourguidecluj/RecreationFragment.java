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
public class RecreationFragment extends Fragment {


    public RecreationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_element_list, container, false);

// Create a list of tour elements
        ArrayList<PointOfInterest> elements = new ArrayList<PointOfInterest>();
        elements.add(new PointOfInterest("Parcul Simion Barnutiu", "Address", "description", R.drawable.parcul_central));
        elements.add(new PointOfInterest("Parcul Babes","Address", "description", R.drawable.babes_2_min));
        elements.add(new PointOfInterest("Gradina Botanica","Address", "description", R.drawable.gradina_bot_min));
        elements.add(new PointOfInterest("Baza sportiva Gheorgheni","Address", "description", R.drawable.complex_min));
        elements.add(new PointOfInterest("Cluj Arena","Address", "description", R.drawable.clujarena_min));
        elements.add(new PointOfInterest("Sala Polivalenta","Address", "description", R.drawable.polivalenta_min));
        elements.add(new PointOfInterest("Iulius Mall","Address", "description", R.drawable.iulius_mall_cluj1_0_min));
        elements.add(new PointOfInterest("Vivo Cluj-Napoca","Address", "description", R.drawable.vivo_min));

        TourElementAdapter itemsAdapter =
                new TourElementAdapter(getActivity(), elements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
