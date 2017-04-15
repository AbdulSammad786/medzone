package com.example.apple.medizone.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.apple.medizone.Adapters.ImageSliderAdapter;
import com.example.apple.medizone.Adapters.ReviewsAdapter;
import com.example.apple.medizone.DataProviders.ReviewsDataProvider;
import com.example.apple.medizone.R;

import java.util.ArrayList;

/**
 * Created by Apple on 3/25/2017.
 */
public class HomeFragment  extends Fragment {
    public static ImageView ist,second,thirt,fourth,fifth;
    ListView listview;
    ReviewsAdapter adapter;
    ArrayList<ReviewsDataProvider> arrayList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragments, null);
        ist=(ImageView)view.findViewById(R.id.first);
        second=(ImageView)view.findViewById(R.id.second);
        thirt=(ImageView)view.findViewById(R.id.third);
        fourth=(ImageView)view.findViewById(R.id.fouth);
        fifth=(ImageView)view.findViewById(R.id.fifth);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewPageAndroid);
        ImageSliderAdapter adapterView = new ImageSliderAdapter(getActivity());
        mViewPager.setAdapter(adapterView);
        arrayList=new ArrayList<>();
        listview=(ListView)view.findViewById(R.id.liistview);

        for(int i=0;i<20;i++)
        {
         arrayList.add(new ReviewsDataProvider("Sammad 786","Awesome Applciation for Medicines"));

        }
        adapter=new ReviewsAdapter(getActivity(),arrayList);
        listview.setAdapter(adapter);
        return view;
    }

}
