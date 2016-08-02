package com.example.android.mogilevcity;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by katsiarynamashokha on 7/5/16.
 */
public class InfoAdapter extends ArrayAdapter<Information> {
    private int mColorResourceId;

    public InfoAdapter(Activity context, ArrayList<Information> info, int colorResourceId) {
        super(context, 0, info);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Information currentInfo = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentInfo.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentInfo.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentInfo.hasImage()) {
            imageView.setImageResource(currentInfo.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        nameTextView.setTextColor(color);
        return listItemView;
    }
}

