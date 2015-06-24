package com.seetha.kavithai.annaikusamarpanam;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;


public class kavithaAdapter implements ListAdapter {

    private Context context;
    private List<kavithai> values;

    kavithaAdapter(Context c, List<kavithai> v){
        context = c;
        values = v;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView;

        switch (position % 2) {
            case 1:
                itemView =  inflater.inflate(R.layout.card, parent, false);
                break;
            default:
                itemView =  inflater.inflate(R.layout.card1, parent, false);
        }

        TextView title = (TextView) itemView.findViewById(R.id.textView);
        title.setText(values.get(position).title);

        TextView content = (TextView) itemView.findViewById(R.id.textView2);
        content.setText(values.get(position).short_content);

        ImageView image = (ImageView) itemView.findViewById(R.id.imageView);
        image.setImageDrawable(context.getResources().getDrawable(values.get(position).image));

        return itemView;
    }

    @Override
    public int getCount() {
        return values.size();
    }

    @Override
    public Object getItem(int position) {
        return values.get(position);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}

