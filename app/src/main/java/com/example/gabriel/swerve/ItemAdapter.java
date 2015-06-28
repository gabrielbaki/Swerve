package com.example.gabriel.swerve; /**
 * Created by GABRIEL on 6/28/2015.
 */
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvImage = (TextView) convertView.findViewById(R.id.tvImage);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.tvPrice);
        // Populate the data into the template view using the data object
        tvName.setText(item.getName());
        tvImage.setText(item.getImage());
        tvPrice.setText(item.getPrice());
        // Return the completed view to render on screen
        return convertView;
    }
}