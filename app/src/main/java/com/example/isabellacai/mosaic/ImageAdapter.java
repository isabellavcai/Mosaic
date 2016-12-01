package com.example.isabellacai.mosaic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

/**
 * Created by isabellacai on 11/27/16.
 */

//change this so that it gets images from the arraylist

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return GlobalVariables.getInstance().mosaics.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) { //if we want to customize what returns on click
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(GlobalVariables.getInstance().mosaics.get(position).getMosaicSource());
        return imageView;
    }

    // references to our images
//    public Integer[] mThumbIds = {
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1
//    };
}
