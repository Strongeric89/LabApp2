package com.example.soc7.labapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eric on 31/10/2017.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {
    Context mContext;
    int mLayoutResourceId;
    Movie data[]= null;

    public MovieAdapter(Context context, int resource, Movie[] data){
        super(context,resource,data);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.data = data;

    }


    public Movie getItem(int position){
        return super.getItem(position);
    }

    public View getView(int position, View convertView, ViewGroup parent){
            View row = convertView;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourceId,parent,false);

        TextView titleView = (TextView) row.findViewById(R.id.nameTextView);
        TextView descView = (TextView) row.findViewById(R.id.descTextView);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

        Movie movie = data[position];

        titleView.setText(movie.title);
        descView.setText(movie.description);

        int resId = mContext.getResources().getIdentifier(movie.image,"drawable", mContext.getPackageName());
        imageView.setImageResource(resId);

        return row;

    }

}
