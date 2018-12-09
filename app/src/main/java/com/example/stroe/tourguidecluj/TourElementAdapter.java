package com.example.stroe.tourguidecluj;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourElementAdapter extends ArrayAdapter<PointOfInterest> {

    public TourElementAdapter(Activity context, ArrayList<PointOfInterest> elements) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, elements);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link PointOfInterest} object located at this position in the list
        PointOfInterest currentPointOfInterest = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID element_image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.element_image);
        imageView.setImageResource(currentPointOfInterest.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID element_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.element_name);
        nameTextView.setText(currentPointOfInterest.getName());

        // Find the TextView in the list_item.xml layout with the ID element_address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.element_address);
        addressTextView.setText(currentPointOfInterest.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID element_description
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.element_description);
        descriptionView.setText(currentPointOfInterest.getDescription());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
