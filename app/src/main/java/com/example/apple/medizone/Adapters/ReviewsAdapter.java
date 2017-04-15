package com.example.apple.medizone.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.apple.medizone.DataProviders.ReviewsDataProvider;
import com.example.apple.medizone.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by DELL on 24-08-2016.
 */
public class ReviewsAdapter extends BaseAdapter {
    Context context;
    ArrayList<ReviewsDataProvider> serviceManualArrayList;
    LayoutInflater inflater;

    public ReviewsAdapter(Context context, ArrayList<ReviewsDataProvider> serviceManualArrayList) {
        this.context = context;
        this.serviceManualArrayList = serviceManualArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return serviceManualArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {
            holder = new Holder();
            view = inflater.inflate(R.layout.customview_reviews, viewGroup, false);
            holder.username = (TextView) view.findViewById(R.id.username);
            holder.image=(CircleImageView)view.findViewById(R.id.image);
            holder.des = (TextView) view.findViewById(R.id.description);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }
        ReviewsDataProvider serviceManual = serviceManualArrayList.get(i);
        holder.username.setText(serviceManual.getUsername());
        holder.des.setText(serviceManual.getDescription());
        return view;
    }
    class Holder {
        TextView des,username;
        CircleImageView image;
    }
}