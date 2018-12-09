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
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_element_list, container, false);
        // Create a list of tour elements
        ArrayList<PointOfInterest> elements = new ArrayList<PointOfInterest>();
        elements.add(new PointOfInterest("Bastionul Croitorilor", "Address", "description", R.drawable.bastion_min));
        elements.add(new PointOfInterest("Piata Unirii","Address", "description", R.drawable.piata_min));
        elements.add(new PointOfInterest("Piata Muzeului","Address", "description", R.drawable.piata_muzeu_min));
        elements.add(new PointOfInterest("Catedrala Ortodoxa","Address", "description", R.drawable.catedrala_ort_min));
        elements.add(new PointOfInterest("Biserica Sfantul Mihail","Address", "description", R.drawable.catedrala_min));
        elements.add(new PointOfInterest("Teatrul Natonal","Address", "description", R.drawable.teatru));

        TourElementAdapter itemsAdapter =
                new TourElementAdapter(getActivity(), elements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
