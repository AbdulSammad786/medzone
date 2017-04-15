package com.example.apple.medizone.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.apple.medizone.Fragments.HomeFragment;
import com.example.apple.medizone.R;


/**
 * Created by Apple on 1/3/2017.
 */public class ImageSliderAdapter extends PagerAdapter {
    Context mContext;

    public ImageSliderAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

    private int[] sliderImagesId = new int[]{
            R.drawable.articletopimage,
            R.drawable.articletopimage,
            R.drawable.articletopimage,
            R.drawable.articletopimage,
            R.drawable.articletopimage,
            R.drawable.articletopimage,
    };

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v == ((ImageView) obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mImageView.setImageResource(sliderImagesId[i]);
        Toast.makeText(mContext, "i="+i, Toast.LENGTH_SHORT).show();
        if (i==1)
        {
            HomeFragment.ist.setBackgroundResource(R.drawable.off);
            HomeFragment.second.setBackgroundResource(R.drawable.on);
            HomeFragment.thirt.setBackgroundResource(R.drawable.on);
            HomeFragment.fourth.setBackgroundResource(R.drawable.on);
            HomeFragment.fifth.setBackgroundResource(R.drawable.on);
        }
        if (i==2)
        {
            HomeFragment.ist.setBackgroundResource(R.drawable.on);
            HomeFragment.second.setBackgroundResource(R.drawable.off);
            HomeFragment.thirt.setBackgroundResource(R.drawable.on);
            HomeFragment.fourth.setBackgroundResource(R.drawable.on);
            HomeFragment.fifth.setBackgroundResource(R.drawable.on);
        }
        if (i==3)
        {

            HomeFragment.ist.setBackgroundResource(R.drawable.on);
            HomeFragment.second.setBackgroundResource(R.drawable.on);
            HomeFragment.thirt.setBackgroundResource(R.drawable.off);
            HomeFragment.fourth.setBackgroundResource(R.drawable.on);
            HomeFragment.fifth.setBackgroundResource(R.drawable.on);
        }
        if (i==4)
        {

            HomeFragment.ist.setBackgroundResource(R.drawable.on);
            HomeFragment.second.setBackgroundResource(R.drawable.on);
            HomeFragment.thirt.setBackgroundResource(R.drawable.on);
            HomeFragment.fourth.setBackgroundResource(R.drawable.off);
            HomeFragment.fifth.setBackgroundResource(R.drawable.on);
        }
        if (i==5)
        {

            HomeFragment.ist.setBackgroundResource(R.drawable.on);
            HomeFragment.second.setBackgroundResource(R.drawable.on);
            HomeFragment.thirt.setBackgroundResource(R.drawable.on);
            HomeFragment.fourth.setBackgroundResource(R.drawable.on);
            HomeFragment.fifth.setBackgroundResource(R.drawable.off);
        }
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }
}